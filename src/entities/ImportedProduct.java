package entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;
	
	public ImportedProduct () {
	}

	public ImportedProduct(String name, Double price, Double customs) {
		super(name, price);
		this.customsFee = customs;
	}

	public Double getCustoms() {
		return customsFee;
	}

	public void setCustoms(Double customs) {
		this.customsFee = customs;
	}
	
	//metodo totalPrice
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}

}
