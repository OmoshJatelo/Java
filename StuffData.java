import java.io.Serializable;

// This class implements Serializable so it can be converted into a byte stream
// and sent across the network.
public class StuffData implements Serializable {
    
    // Serial Version UID ensures that the sender and receiver 
    // are using compatible versions of this class.
    private static final long serialVersionUID= 1L;
    
    int id;
    String name;
    double salary;

    // Constructor to initialize the employee object
    public StuffData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}