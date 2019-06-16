public class MobileRechargeOption2 extends MainMenu {

    private String robiOp1;
    private String airtelOp2;
    private String banglalinkOp3;
    private String grameenphoneOp4;
    private String teletalkOp5;
    private String op6MainMenu;
    private String op0Exit;

    private String mobileRechargeInput;
    private String numberToGetRecharged;

    public String getNumberToGetRecharged() {

        System.out.println("Enter the number you want to recharge:");
        numberToGetRecharged = scan.next();
        Wallet numToRecharge = new Wallet();
        if (numToRecharge.verifyRegularNumber(numberToGetRecharged)) {
            return numberToGetRecharged;
        } else {
            System.out.println("This number doesn't exist. Please try again.");
            return "";
        }
    }

    public String getMobileRechargeInput(String mobileRechargeInput){
        return mobileRechargeInput;
    }

    public String displayPrepaid() {
        System.out.println("");
        return "";
    }

    public String displayPostpaid() {
        System.out.println();
        return "";
    }

    public String displaySkittos() {

        System.out.println();
        System.out.println("Please enter a Skittos number: ");
        getExitOption();
        String skittosNum = scan.next();

        if (!skittosNum.equals("0")) {
            if(skittosNum.substring(2,3).equals("3")) {
                inputRechargeAmount();
                return ""; //think what's appropriate
            } else {
                System.out.println("That wasn't a Skitto number, please try again.");
                return displaySkittos();
            }

        } else {
            return getExitMessage();
        }
    }

    public String inputRechargeAmount() {
        System.out.println("Enter the amount in Tk to be recharged:");
        System.out.println("Valid range: Tk 10-5000");
        int amount = scan.nextInt();

        if (amount < 10) {
            System.out.println("Your amount is below the minimum.");
            return "";
        } else if (amount > 5000) {
            System.out.println("This amount is above the maximum");
            return "";
        } else {
            return getSuccessfulRechargeMessage(amount);
        }
    }

    public String getSuccessfulRechargeMessage(int rechargedAmoount) {
        System.out.println("Congratulations! Tk " + rechargedAmoount +
                "was added to the balance of the specified number.");
        return "";
    }

    public String chooseOptionsForRechargeForGP() {

        System.out.println();
        System.out.println("Select your plan");
        System.out.println();

        System.out.println("1. Prepaid");
        System.out.println("2. Postpaid");
        System.out.println("3. Skittos");
        System.out.println("4. Return to Main Menu");
        getExitOption();

        mobileRechargeInput = getMobileRechargeInput(scan.next());
        if(mobileRechargeInput.equals("1")){
            displayPrepaid();
            return "";

        } else if(mobileRechargeInput.equals("2")){
            displayPostpaid();
            return "";

        } else if(mobileRechargeInput.equals("3")){
            displaySkittos();
            return "";

        } else if (mobileRechargeInput.equals("4")) {
            System.out.println(displayMenu());
            return menu();

        } else if(mobileRechargeInput.equals("0")){
            getExitMessage();
            return "";

        } else {
            getErrorMessage();
            return "";
        }


    }
    public String chooseOptionsForRechargeMinusGP() {

        System.out.println();
        System.out.println("Select your plan");
        System.out.println();

        System.out.println("1. Prepaid");
        System.out.println("2. Postpaid");
        System.out.println("3. Return to Main Menu");
        getExitOption();

        mobileRechargeInput = getMobileRechargeInput(scan.next());
        if(mobileRechargeInput.equals("1")){
            return "";

        } else if(mobileRechargeInput.equals("2")){
            return "";

        } else if(mobileRechargeInput.equals("3")){
            System.out.println(displayMenu());
            return menu();

        } else if(mobileRechargeInput.equals("0")){
            getExitMessage();
            return "";

        } else {
            getErrorMessage();
            return "";
        }

    }

    public String displayMobileRecharge() {

        robiOp1 = "1. Robi";
        airtelOp2 = "2. Airtel";
        banglalinkOp3 = "3. Banglalink";
        grameenphoneOp4 = "4. Grameenphone";
        teletalkOp5 = "5. Teletalk";
        op6MainMenu = "6. Return to Main Menu";

        System.out.println();
        System.out.println("Welcome to bKash mobile recharge!");
        System.out.println("Please select your operator:");

        System.out.println(robiOp1);
        System.out.println(airtelOp2);
        System.out.println(banglalinkOp3);
        System.out.println(grameenphoneOp4);
        System.out.println(teletalkOp5);
        System.out.println(op6MainMenu);
        System.out.println(getExitOption());

        mobileRechargeInput = getMobileRechargeInput(scan.next());

        if(mobileRechargeInput.equals("1")){
            System.out.println("ROBI");
            return "";

        } else if(mobileRechargeInput.equals("2")){
            return "";

        } else if(mobileRechargeInput.equals("3")){
            return "";

        } else if(mobileRechargeInput.equals("4")){
            System.out.println();
            System.out.println("GRAMEENPHONE");
            return "";

        } else if(mobileRechargeInput.equals("5")){
            return "";

        } else if(mobileRechargeInput.equals("6")){
            System.out.println(displayMenu());
            return menu();

        } else if(mobileRechargeInput.equals("0")){
            return getExitMessage();

        } else {
            getErrorMessage();
            return getExitMessage();
        }

    }
}
