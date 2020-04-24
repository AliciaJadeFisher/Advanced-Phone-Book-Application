/*
 * Phonebook
 * An application that allows users to view, search 
 * and add entries to the phonebook
 */
package phonebook_2;

import java.util.ArrayList;

/**
 *
 * @author s6040531
 */
public class Phonebook_2 
{
    
    // ArrayList that contains a collection of hash maps (each containing a single phonebook record)
    static ArrayList<PB_record> phoneBook = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Calls initPhonebook()
        initPhonebook();
        
        // Creates and displays the main UI
        UI_Main ui = new UI_Main(phoneBook);
        ui.setVisible(true);
        
    }
    
     /**
     * Method for initiating the phone book
     * Inserts three entries into the phone book
     */
    public static void initPhonebook()
    {
         // Creates a new PB_record object and saves the record details
        phoneBook.add(PB_record.getInstance("John","Marks","01534833933","07442122889",
                "01534876542","jeffmarks@yahoo.co.uk"));
        
        // Creates a new PB_record object and saves the record details
        phoneBook.add(PB_record.getInstance("Mary","Smith","01685089304","07876541234",
                "01685098687","marysmith@yahoo.co.uk"));
        
        // Creates a new PB_record object and saves the record details
        phoneBook.add(PB_record.getInstance("Richard","Parker","01368147030","07987675412",
                "01368980431","richparker@yahoo.co.uk"));
    }
    
}
