package HW1;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private int pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantityPurchased, int pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityPurchased = quantityPurchased;
        this.pricePerItem = pricePerItem;
    }

    public int getInvoiceAmount() {
        if (this.quantityPurchased <= 0 || this.pricePerItem <= 0) {
            return 0;
        }

        return this.quantityPurchased * this.pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}
