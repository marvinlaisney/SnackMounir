import java.util.List;

/**
 * Classe Ticket
 * @author marvin
 *
 */
public class Ticket {
	private double tva = 0.8;

	private List<Produit> listProduits;
	
	/**
	 * Constructeur de la classe Ticket, initialisé avec une liste de produit
	 * @param listProduits
	 */
	public Ticket(List<Produit> listProduits) {
		this.listProduits = listProduits;
	}

	/**
	 * Accesseur de la liste des produits
	 * @return
	 */
	public List<Produit> getListProduits() {
		return listProduits;
	}
	
	/**
	 * Setteur de la liste des produits
	 * @param listProduits
	 */
	public void setListProduits(List<Produit> listProduits) {
		this.listProduits = listProduits;
	}
	
	/**
	 * Accesseur TVA à appliquer
	 * @return
	 */
	public double getTva() {
		return tva;
	}

}
