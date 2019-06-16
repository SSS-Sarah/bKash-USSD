public class HelplineOption8 extends MainMenu{

    private String option1;
    private String option00;
    private String option0;
    private int helplineInput;

    public int getHelplineInput(int helplineInput) {
        return helplineInput;
    }

    public String displayHelpline() {

        option1="1.  Call 16247 or visit www.bkash.com for more info.";
        option00="00. Return to Main Menu";
        option0= getExitOption();

        System.out.println();
        System.out.println(option1);
        System.out.println(option00);
        System.out.println(getExitOption());
        helplineInput=getHelplineInput(scan.nextInt());

        if (helplineInput==1){
            System.out.println(getExitMessage());
            return "";

        } else if(helplineInput==00){
            System.out.println(displayMenu());
            return menu();

        } else if (helplineInput==0){
            System.out.println(getExitMessage());
            return "";

        } else {
            System.out.println(getErrorMessage());
            return "";

        }
    }




}
