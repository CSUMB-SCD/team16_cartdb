package csumb.edu.cartdb;

import org.springframework.data.mongodb.repository.Query;

import csumb.edu.cartdb.entities.Cart;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart, String> {  

    @Query (value = "{'s1':'?0'}")
    List<Cart> findId(String s1);

   // @Query ("Delete * from cart where ")
	// void deleteItem(String s1, String p1);
}