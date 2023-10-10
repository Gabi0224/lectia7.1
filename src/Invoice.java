public class Invoice {
    private String deviceModel;
    private String productDescription;
    private int quantity;
    private double pricePerUnit;

    public Invoice(String deviceModel, String productDescription, int quantity, double pricePerUnit) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        setQuantity(quantity);
        setPricePerUnit(pricePerUnit);
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public void setPricePerUnit(double pricePerUnit) {
        if (pricePerUnit > 0) {
            this.pricePerUnit = pricePerUnit;
        } else {
            this.pricePerUnit = 0.0;
        }
    }

    public double getAmount() {
        return quantity * pricePerUnit;
    }
}