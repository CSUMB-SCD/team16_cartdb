package csumb.edu.cartdb.entities;
import csumb.edu.cartdb.entities.Product;


public class Cart{
    private String id;
    private Product p1;

    public Cart (String id,Product p1){
        this.id = id;
        this.p1=p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(Product p1) {
        this.p1 = p1;
    }

    /**
     * @param id the s1 to set
     */
    public void setid(String id) {
        this.id = id;
    }

    /**
     * @return the p1
     */
    public Product getP1() {
        return p1;
    }

    /**
     * @return the s1
     */
    public String getid() {
        return id;
    }
}