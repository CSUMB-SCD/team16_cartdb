package csumb.edu.cartdb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import csumb.edu.cartdb.entities.Cart;


@RestController
public class CartController{
    @Autowired
    CartRepository cartRepo;

    @CrossOrigin(origins = "https://otterbuy.herokuapp.com")
    @GetMapping("/cart")
    public List<Cart> getAll(){
       List<Cart> result = cartRepo.findAll();
       return result;
    }

    @CrossOrigin(origins = "https://otterbuy.herokuapp.com")
    @GetMapping("/cart/{id}")
    public List<Cart> getCartId(@PathVariable String id) {
        List<Cart> result = cartRepo.findId(id);
        return result;
    }  

    @CrossOrigin(origins = "https://otterbuy.herokuapp.com")
    @PutMapping(path= "/cart/create/{userid}/{productid}")
	public Cart createCart(@PathVariable String userid, @PathVariable String productid) {
		Cart cartObj = cartRepo.save(new Cart(userid, productid));
		return cartObj;
    }
    @CrossOrigin(origins = "https://otterbuy.herokuapp.com")
    @GetMapping(path="/delete/{s1}")
	public void deletebyID(@PathVariable String s1) {
 
		cartRepo.deleteById(s1);
     }

    //  @CrossOrigin(origins = "https://otterbuy.herokuapp.com")
    // @GetMapping(path="/delete/{s1}/{p1}")
	// public void deleteItem(@PathVariable String s1, @PathVariable String p1) {
 
	// 	cartRepo.deleteItem(s1,p1);
    //  }
     @CrossOrigin(origins = "https://otterbuy.herokuapp.com")
    @GetMapping(path="/delete")
	public void deleteAllcart() {
 
		cartRepo.deleteAll();

    }

}