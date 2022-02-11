
/**
 * Classe Produit
 * @author marvin
 *
 */
public class Produit {
	private String productLabel;
	private int quantity;
	private double unitPrice;
	
	/**
	 * Constructeur du produit, initialisé avec le libellé, la quantité et le prix unitaire
	 * @param productLabel
	 * @param quantity
	 * @param unitPrice
	 */
	public Produit(String productLabel, int quantity, double unitPrice) {
		this.productLabel = productLabel;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	/**
	 * Accesseur libellé produit
	 * @return
	 */
	public String getProductLabel() {
		return productLabel;
	}

	/**
	 * Setteur libellé produit
	 * @param productLabel
	 */
	public void setProductLabel(String productLabel) {
		this.productLabel = productLabel;
	}

	/**
	 * Accesseur quantité produit
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Setteur quantité produit
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Accesseur prix unitaire du produit
	 * @return
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * Setteur prix unitaire du produit
	 * @param unitPrice
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
