package csumb.edu.cartdb.entities;


public class Cart{
    private String s1;
    private Product p1;

    public Cart (String s1,Product product){
        this.s1 = s1;
        this.p1=product;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(Product p1) {
        this.p1 = p1;
    }

    /**
     * @param s1 the s1 to set
     */
    public void setS1(String s1) {
        this.s1 = s1;
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
    public String getS1() {
        return s1;
    }
}