/*
Wallet class (object created in Main.java)
Takes input of user mobile number as a String (instead of an integer)
    Verifies this input using 3 conditions
        - check if length 11 (standard mobile number) using string.length()
        - check if integer (string to charArray, check if every char in array is int)
        - check if starts with 01 (create substring, checks if equal to 01)
    If mobile number is verified,
 */



import java.util.Scanner;

public class Wallet extends MainMenu {

    private String walletNumber;
    private char[] numberInArray;

    public String getWalletNumber() {

        System.out.println("Enter your bKash wallet number (phone number):");
        Scanner scanner = new Scanner(System.in);
        walletNumber = scanner.next();
        return verifyWalletNumber();
    }

    public String verifyWalletNumber() {
        if(walletNumber.length()==11 && isIntegerNumber(getNumberInArray(walletNumber))
                && startsWith01(walletNumber)){
            AccountInformation account = new AccountInformation();

            if(walletNumber.equals(account.hasBkashAccount())){
                System.out.println(menu());
                return "";
            } else {
                System.out.println("Sorry this number doesn't have a bKash account.");
                return getExitMessage();
            }
        } else {
            System.out.println(getInvalidNumberMessage());
            return"";
        }
    }

    public boolean verifyRegularNumber(String numberToGetRecharged) {
        if(numberToGetRecharged.length()==11 && isIntegerNumber(getNumberInArray(numberToGetRecharged))
                && startsWith01(numberToGetRecharged)){
           return true;
        } else {
            System.out.println(getInvalidNumberMessage());
            return false;
        }
    }


    public String getInvalidNumberMessage() {

        System.out.println(getErrorMessage());
        System.out.println("Tip: Remember to use all 11 digits" +
                " of your phone number starting with 01");
        System.out.println(getExitOption());
        System.out.println("Press any other key to continue");

        if(scan.next().equals("0")){
            System.out.println(getExitMessage());
            return "";
        } else {
            return getWalletNumber();
        }
    }

    public boolean isIntegerNumber(char numberInArray) {

        if(Character.isDigit(numberInArray)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean startsWith01(String number){

        String substringNumber;
        substringNumber = number.substring(0,2);
        if(substringNumber.equals("01")) {
            return true;
        } else {
            return false;
        }
    }

    public char getNumberInArray(String number) {
        numberInArray = number.toCharArray();
        for(char c : numberInArray) {
            return c;
        }
        return ' ';
    }
}
