package csumb.edu.cartdb.entities;


public class Cart{
    private String id;
    private String productid;

    public Cart (String id,String productid){
        this.id = id;
        this.productid=productid;
    }
/**
 * @return the id
 */
public String getId() {
    return id;
}

/**
 * @return the productid
 */
public String getProductid() {
    return productid;
}

/**
 * @param id the id to set
 */
public void setId(String id) {
    this.id = id;
}

/**
 * @param productid the productid to set
 */
public void setProductid(String productid) {
    this.productid = productid;
}


    
}