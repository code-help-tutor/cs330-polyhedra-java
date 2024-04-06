WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
import java.util.Scanner;

public class Composite extends Polyhedron {
    /**
     * Collection of polyhedra of which
     * this composite polyhedron is composed
     */
    private Polyhedron[] polyhedra;

    /**
     * Default Constructor
     */
    Composite()
    {
        super("Composite");
        
        polyhedra = null;
    }

    /**
     * Copy Constructor
     */
    Composite(Composite src)
    {
        super("Composite");

        // Start with copy code
        // do not forget to check if
        // polyhedra is null

    }

    /**
     * Read all component polyhedra
     *
     * @pre polyhedra == null
     *   && numPolyhedra == 0
     */
    public void read(Scanner scanner)
    {
        int numPolyhedra = scanner.nextInt();

        polyhedra = new Polyhedron[numPolyhedra];

        for (int i = 0; i < polyhedra.length; i++) {
            polyhedra[i] = Polyhedron.createAndRead(scanner);

            boundingBox.merge(polyhedra[i].getBoundingBox());
        }
    }

    public Polyhedron clone()
    {
        return new Composite(this);
    }

    public void scale(double scalingFactor)
    {
        // loop
    }

    /**
     * Scale all polyhedra
     */
    public String toString() 
    {
        StringBuilder bld = new StringBuilder();

        bld.append(super.toString());

        // Start your toString code here


        //end your toString code here

        return bld.toString();
    }
}

