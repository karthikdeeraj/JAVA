public class PaymentGateway {
    void paymentType(long cnum, String name, int cvv) {
        String numberAsString = Long.toString(cnum);
        if (numberAsString.length() == 7) {
            System.out.println("Payment has been successfully made through credit card");
        } else {
            System.out.println("Enter valid credit card number");
        }
    }

    void paymentType(String pemail, String ppassword, String input, String type) {
        if (input.equalsIgnoreCase("Login")) {
            System.out.println("Payment has been successfully made through paypal" + type + "card");
        } else if (input.equalsIgnoreCase("signup")) {
            System.out.println("Enter your email");
            System.out.println("Enter your password");
            System.out.println("Re-enter you password");
        } else {
            System.out.println("Enter the valid details");
        }
    }

    public static void main(String[] args) {
        PaymentGateway pg=new PaymentGateway();
        pg.paymentType(1234567,"Karthik",378);
        pg.paymentType("karthik@gmail.com","jadkakd","login","debit");
        pg.paymentType(12345679,"Karthik",378);
    }
}

