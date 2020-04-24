/*
 * Model class used to represent a single record in the phone book
 */
package phonebook_2;

import java.util.HashMap;

/**
 *
 * @author s6040531
 */
class PB_record 
{
    /**
     * Multiton Pattern instances HashMap
     */
    private static HashMap<String, PB_record> instances = new HashMap<>();
    
    /**
     * Attributes of PB_record
     */
    private String fName;
    private String sName;
    private String pNumber;
    private String mNumber;
    private String wNumber;
    private String email;
    
    /**
     * Empty constructor
     */
    private PB_record(){}
    
    /**
     * Main constructor
     * @param na
     * @param nu 
     */
    private PB_record(String fn, String sn, String pnu, String mnu, String wnu, String em)
    {
        fName = fn;
        sName = sn;
        pNumber = pnu;
        mNumber = mnu;
        wNumber = wnu;
        email = em;
    }
    
    /**
     * Multiton Pattern methods
     * Creates a new object instance if one does not exist
     * If one exists, returns existing object
     * @param fn
     * @param sn
     * @param pnu
     * @param mnu
     * @param wnu
     * @param em
     * @return 
     */
    
    public static PB_record getInstance(String fn, String sn, String pnu, 
            String mnu, String wnu, String em)
    {
        String key = fn.toLowerCase() + "_" + sn.toLowerCase() + "_" + pnu;
        
        PB_record instance = instances.get(key);
        if(instance == null)
        {
            instance = new PB_record(fn,sn,pnu,mnu,wnu,em);
           
            instances.put(key,instance);
        
        }
        
        return instance;
    }
    
    /**
     * Retrieves the first name of the record
     * @return fName
     */
    String getfName()
    {
        return fName;
    }
    
    /**
     * Retrieves the surname of the record
     * @return sName
     */
    String getsName()
    {
        return sName;
    }
    
    /**
     * Retrieves the phone number of the record
     * @return 
     */
    String getpNumber()
    {
        return pNumber;
    }
    
    /**
     * Retrieves the mobile number of the record
     * @return mNumber
     */
    String getmNumber()
    {
        return mNumber;
    }
    
    /**
     * Retrieves the work number of the record
     * @return wNumber
     */
    String getwNumber()
    {
        return wNumber;
    }
    
    /**
     * Retrieves the email of the record
     * @return email
     */
    String getEmail()
    {
        return email;
    }
}
