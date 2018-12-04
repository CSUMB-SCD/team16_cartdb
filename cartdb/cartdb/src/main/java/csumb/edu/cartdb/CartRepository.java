package csumb.edu.cartdb;

import org.springframework.data.mongodb.repository.Query;

import csumb.edu.cartdb.entities.Cart;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart, String> {
    
    //Optional<Cart> findById(String id);   

    @Query (value = "{'s1':'?0'}")
    Cart findId(String s1);

    // @Query (value = "{'id':'?0'}")
    // List<Cart> findAll();
}