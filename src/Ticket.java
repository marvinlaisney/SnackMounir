import java.util.List;

public class Ticket {
	private double tva = 0.8;

	private List<Produit> listProduits;
	
	public Ticket(List<Produit> listProduits) {
		this.listProduits = listProduits;
	}

	public List<Produit> getListProduits() {
		return listProduits;
	}

	public void setListProduits(List<Produit> listProduits) {
		this.listProduits = listProduits;
	}
	
	public double getTva() {
		return tva;
	}

}
