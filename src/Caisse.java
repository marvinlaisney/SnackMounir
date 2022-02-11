import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Caisse {
	// Initialisation du scanner et de la liste des produits
	public static Scanner sc = new Scanner(System.in);
	public static List<Produit> listProduits = new ArrayList<Produit>();

	/**
	 * Fonction d'impression du ticket
	 * @param ticket
	 */
	public static void printTicket(Ticket ticket) {
		double totalFacture = 0;
		System.out.println("------------------------------------------------------------------");
		System.out.println("|\t\t\t    SNACK MOUNIR\t\t\t |");
		System.out.println("------------------------------------------------------------------");
		System.out.println("|\tProduit\t\t|\tQuantité\t |\tPrix\t |");
		System.out.println("------------------------------------------------------------------");
		for(Produit produit: ticket.getListProduits()) {
			totalFacture += produit.getUnitPrice() * produit.getQuantity();
			System.out.print(MessageFormat.format("|{0}\t\t\t\t\t\t", produit.getProductLabel()));
			System.out.print(MessageFormat.format("{0}\t\t", produit.getQuantity()));
			System.out.print(MessageFormat.format("{0}|\n", produit.getUnitPrice()));
		}
		System.out.println("------------------------------------------------------------------");

		System.out.println(MessageFormat.format("Total TTC : {0}€", totalFacture * ticket.getTva()));
	}
	
	/**
	 * Fonction récursive permettant d'ajouter plusieurs produits à la liste
	 * @param ticket
	 */
	public static void addProduct(Ticket ticket) {
		
		System.out.println("\nVeuillez saisir le nom du produit :");
		String productLabel = sc.nextLine();
		
		if(productLabel.length() > 20) {
			System.out.println("\nLe libellé du produit est trop long, veuillez recommencer.");
			addProduct(ticket);
		}else {

			System.out.println("\nVeuillez saisir le prix unitaire du produit :");
			String priceProduct = sc.nextLine();
			
			while(!isDouble(priceProduct)) {
				priceProduct = sc.nextLine();
			}
			
			System.out.println("\nVeuillez saisir la quantité du produit :");
			String quantity = sc.nextLine();
			
			while(!isInteger(quantity)) {
				quantity = sc.nextLine();
			}

			Produit product = new Produit(productLabel, Integer.parseInt(quantity), Double.parseDouble(priceProduct));

			ticket.getListProduits().add(product);

			System.out.println("\nLe produit a bien été ajouté.");

			System.out.println("\nVoulez-vous en ajouter un autre ? (O/N)");
			String answer = sc.nextLine();

			if(answer.toUpperCase().equals("O")){
				addProduct(ticket);
			}
		}
	}
	
	/**
	 * Affichage d'une erreur si la quantité saisie n'est pas un int
	 * @param string
	 * @return
	 */
	public static boolean isInteger(String string) {
	    try {
	        Integer.valueOf(string);
	        return true;
	    } catch (NumberFormatException e) {
			System.out.println("\nLa saisie n'est pas correcte, veuillez recommencer.");
	        return false;
	    }
	}
	
	/**
	 * Affichage d'une erreur si le prix saisi n'est pas un nombre
	 * @param string
	 * @return
	 */
	public static boolean isDouble(String string) {
	    try {
	        Double.valueOf(string);
	        return true;
	    } catch (NumberFormatException e) {
			System.out.println("\nLa saisie n'est pas correcte, veuillez recommencer.");
	        return false;
	    }
	}
	
	/**
	 * Programme principal
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bienvenue au Snack Mounir !");
		System.out.println();
		System.out.println("Voulez-vous créer un ticket ? (O/N)");

		String answer = sc.nextLine();
		
		if(answer.toUpperCase().equals("O")){
			
			Ticket ticket = new Ticket(listProduits);
			
			System.out.println("\nVoulez-vous ajouter un produit ? (O/N)");
			answer = sc.nextLine();
			
			if(answer.toUpperCase().equals("O")) {
				addProduct(ticket);
				
				System.out.println("\nImpression du ticket...\n");
				printTicket(ticket);
			}
		}
		
		System.out.println("\nMerci d'avoir fait confiance à Snack Mounir !");
	}

}
