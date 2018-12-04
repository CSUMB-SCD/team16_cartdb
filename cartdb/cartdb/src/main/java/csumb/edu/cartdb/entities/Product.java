package csumb.edu.cartdb.entities;


public class Product {
    private Description description;
    private String id;
    private Image image;
    private int stockNum;
    private String name;
    private double payment;


    public Product(String id,Image image,String name,Description description, int stockNum, double payment){
        this.description = description;
        this.image = image;
        this.stockNum = stockNum;
        this.name = name;
        this.payment = payment;
    }

    
    /**
     * @param payment the payment to set
     */
    public void setPayment(double payment) {
        this.payment = payment;
    }
    
    /**
     * @return the payment
     */
    public double getPayment() {
        return payment;
    }
    
    public void setName(String name) {
        this.name = name;
    }
   
    public String getName() {
        return this.name;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }
    
    public void setDescription(Description description) {
        this.description =description;
    }
 
    public void setImage(Image image) {
        this.image = image;
    }
    
    public Description getDescription(){
        return this.description;
    }
  
    public Image getImage() {
        return this.image;
    }

    public int getStockNum() {
        return this.stockNum;
    }
}