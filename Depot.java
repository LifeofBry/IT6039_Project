package packer;

/**
 *
 * @author Bryan
 */
public class Depot {
    private String name;
    private Address address;

    public Depot(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    /* Changed
    
       public String getName() {
       return address.toString();
       }

       to
    
       public String getName() {
       return name;
       }
    */
    public String getName() {
        return name;
    }
    
    public Coordinates getCoordinates() {
        return this.address.getCoordinates();
    }
    
    public String toString() {
        return this.getName();
    }
    
}
