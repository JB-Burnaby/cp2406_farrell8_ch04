public class FormLetterWriter {

    public static void main(String[] args) {

        displaySalutation("Cameron sucks balls");
        displaySalutations("Cameron", "Gaucci");
    }

    public static void displaySalutation(String lName){
        System.out.println("Dear Mr. or Ms. " + lName);
    }

    public static void displaySalutations(String lName, String fName){
        System.out.println("Dear " + fName + " " + lName + "\nThankyou for your recent order.");
    }
}
