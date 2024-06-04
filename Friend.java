import java.util.Scanner;

class Friend{

    //-------------------CREATE AN ARRAYS ----------------
    public static String[] idArray = new String[0];
    public static String[] nameArray=new String[0];
    public static String[] phoneNumberArray=new String[0];
    public static String[] companyNameArray=new String[0];
    public static double[] salaryArray=new double[0];
    public static String[] birthdayArray=new String[0];

    //----------------------CLEAR CONSOLE --------------------
    public final static void clearConsole() { 
        try {
        final String os = System.getProperty("os.name"); 
        if (os.contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        }
        } catch (final Exception e) {
        e.printStackTrace();
        // Handle any exceptions.
        }
    }

    public static void main(String[] args) {
        homePage();
    }

    //-------------------GENERATE ID----------------
    public static String generateId(){
        if(idArray.length == 0){
            return "C0001";
        }
        String lastid = idArray[idArray.length-1];
        int lastno = Integer.parseInt(lastid.substring(1));
        return String.format("C0%4d", lastno+1);
        
    }

    public static void  homePage(){
        Scanner input = new Scanner(System.in);
        System.out.println("================iFRIEND CONTACTS ORGANIZER =================");
        System.out.println("\n[01] Add Contact");
        System.out.println("\n[02] Update Contact");
        System.out.println("\n[03] Delete Contact");
        System.out.println("\n[04] Search Contact");
        System.out.println("\n[05] List Contacts");
        System.out.println("\n[06] Exit");
        System.out.print("\nEnter option to continue : ");
        int option = input.nextInt();

        switch(option){
            case 1 : addContact(); break;
            case 2 : updateContact(); break;
            case 3 : deleteContact(); break;
            case 4 : searchContact(); break;
            case 5 : listContact(); break;
            case 6 : exit(); break;
            default : System.out.println("Invalid option...");break;
            }
        }
    
    private static void addContact() {
    
    }

    private static void updateContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateContact'");
    }

    private static void deleteContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteContact'");
    }
    
    private static void searchContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchContact'");
    }

    private static void listContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listContact'");
    }

    private static void exit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exit'");
    }

    

    

    

}