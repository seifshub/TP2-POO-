public class LibraryCard {
    private int cardNumber;
    private int expirationYear;
    public LibraryCard()
    {
        this.cardNumber=0;
        this.expirationYear=0;
    }
    public LibraryCard(int cardNumber, int expirationYear) {
        this.cardNumber = cardNumber;
        this.expirationYear = expirationYear;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    public int getExpirationYear() {
        return expirationYear;
    }
    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }
    public String to_string() {
        return "( cardNumber:" +getCardNumber()+", expirationYear:" +getExpirationYear()+" )";
    }

}
