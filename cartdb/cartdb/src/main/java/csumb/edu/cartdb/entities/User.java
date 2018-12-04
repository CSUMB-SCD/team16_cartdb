package csumb.edu.cartdb.entities;


public class User{
    private String id;
    
    public User( String id){
        this.id=id;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}