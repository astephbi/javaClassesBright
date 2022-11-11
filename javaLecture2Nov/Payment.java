// created to handle all payments momo 

public class Payment {
    // number to process payment
    private String phoneNumber;
    private String network;
    private double amount;
    private String currency;

  

    public Payment(String phoneNumber, String network, double amount, String currency){
        this.phoneNumber = formatPhoneNumber();
        this.network = network;
        this.amount = amount;
        this.currency = currency;

    private String formatPhoneNumber(String number){
            if(phoneNumber.startsWith("0") && phoneNumber.length()==10){
                return "+233" + number.substring(0,10);
            } return number;
        }

}

}
