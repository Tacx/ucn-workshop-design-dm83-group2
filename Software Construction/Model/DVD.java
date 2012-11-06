package Model;
import java.util.ArrayList;

/**
 * Write a description of class DVD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DVD
{
    // instance variables - replace the example below with your own
    private int id;
    private String title;
    private String artist;
    private String publicationDate;
    private ArrayList<Copy> copies;

    /**
     * Constructor for objects of class DVD
     */
    public DVD()
    {
        copies = new ArrayList<Copy>();
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void title(String title)
    {
        this.title = title;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public void setPublicationDate(String publicationDate)
    {
        this.publicationDate = publicationDate;
    }
    
    public String getPublicationDate()
    {
        return publicationDate;
    }
    
    public void addCopy(Copy newCopy)
    {
        copies.add(newCopy);
    }
    
    public void removeDVDcopy(int serialNumber)
    {
        Copy copy = getCopy(serialNumber);
        copies.remove(copy);
    }
    
    public Copy getCopy(int id)
    {
        int index = 0;
        boolean found = false;
        int index2 = 0;
        
        while(!found && index < copies.size())
        {
            Copy copy = copies.get(index);
            if(copy.getSerialNumber()==id){
                found = true;
                index2 = index;
            }
            index++;
        }
        if(found == true )
        {
            return copies.get(index2);
        }
        else
        {
            return null;
        }
    }
    
    
    public void createCopy(int serialNumber, String purchaseDate,double purchasePrice)
    {
        Copy copy = new Copy(serialNumber, purchaseDate, purchasePrice);
        addCopy(copy);
    }
    
    
}