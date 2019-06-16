import java.util.Scanner;
public class MainMenu {

    Scanner scan = new Scanner(System.in);
    private String twoFourSeven;
    private String menuInput;
    private String errorMessage="Oops! You entered the wrong number, please try again!";

    public String getMenuInput(String menuInput) {
        return menuInput;
    }

    public String getErrorMessage() {
        errorMessage = "Oops! Error in input, please try again!";
        System.out.println(errorMessage);
        return "";
    }

    public String getExitOption() {
        String exitOption = "Press 0 to exit";
        System.out.println(exitOption);
        return "";
    }

    public String getExitMessage() {
        String exitMessage = "You have exited the application.";
        System.out.println(exitMessage);
        return "";
    }

    //main menu display
    public String displayMenu() {

        System.out.println("Welcome to bKash Main Menu");
        System.out.println();

        String option1 = "1. Send money";
        String option2 = "2. Mobile recharge";
        String option3 = "3. Payment";
        String option4 = "4. Cash out";
        String option5 = "5. Pay your bills";
        String option6 = "6. Remittance";
        String option7 = "7. Go to My bKash";
        String option8 = "8. Helpline";
        //String option0 = getExitOption();

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
        System.out.println(option4);
        System.out.println(option5);
        System.out.println(option6);
        System.out.println(option7);
        System.out.println(option8);
        getExitOption();
        return "";
    }


    public String menu() {

        System.out.println("Enter *247# to access your bKash account");
        twoFourSeven = scan.next();

        if (twoFourSeven.equals("*247#")) {
            System.out.println("Welcome to your bKash account!");
            System.out.println();

            displayMenu();
            menuInput = getMenuInput(scan.next());

            if(menuInput.equals("1")){ //sendMoney
                return "";

            } else if(menuInput.equals("2")){ //Mobile recharge
                MobileRechargeOption2 mobileRechargeOption2 = new MobileRechargeOption2();
                System.out.println(mobileRechargeOption2.displayMobileRecharge());
                return mobileRechargeOption2.displayMobileRecharge();

            } else if(menuInput.equals("3")){ //Payment
                return "";

            } else if(menuInput.equals("4")){ //cash out
                return "";

            } else if(menuInput.equals("5")) { // pay bill
                return "";

            } else if(menuInput.equals("6")){ // remittance
                return "";

            } else if(menuInput.equals("7")){ //myBkash
                return "";

            } else if(menuInput.equals("8")){ //helpline
                HelplineOption8 helpline = new HelplineOption8();
                System.out.println(helpline.displayHelpline());
                return "";

            } else if(menuInput.equals("0")){ //exit
                return getExitMessage();

            } else {
                return getErrorMessage();
            }
        }

        else {
           return getErrorMessage();
        }

    }

}
