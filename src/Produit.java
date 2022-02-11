
public class Produit {
	private String productLabel;
	private int quantity;
	private double unitPrice;
	
	public Produit(String productLabel, int quantity, double unitPrice) {
		this.productLabel = productLabel;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getProductLabel() {
		return productLabel;
	}

	public void setProductLabel(String productLabel) {
		this.productLabel = productLabel;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
