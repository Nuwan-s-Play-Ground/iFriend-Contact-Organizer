import java.util.Scanner;

class Friend{
    public static void main(String[] args) {
        homePage();
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
            case 6 : exit(); 
            }
        }
    

    private static void exit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exit'");
    }

    private static void listContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listContact'");
    }

    private static void searchContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchContact'");
    }

    private static void deleteContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteContact'");
    }

    private static void addContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addContact'");
    }

    private static void updateContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateContact'");
    }

    

    

}