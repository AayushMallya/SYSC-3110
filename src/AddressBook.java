import java.util.ArrayList;

public class AddressBook{

    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        this.buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.buddies.remove(buddy);
    }

    public static void main(String [] args){
        System.out.println("Address Book");
       /* BuddyInfo buddy = new BuddyInfo("Tom", "Carleton",  613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println(addressBook);
*/

    }
}


