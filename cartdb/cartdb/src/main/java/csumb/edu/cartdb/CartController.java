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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import csumb.edu.cartdb.entities.Cart;
import csumb.edu.cartdb.entities.Product;
import csumb.edu.cartdb.entities.User;


@RestController
public class CartController{
    @Autowired
    CartRepository cartRepo;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/cart")
    public List<Cart> getAll(){
       List<Cart> result = cartRepo.findAll();
       return result;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/cart/{id}")
    public Cart getProductId (@PathVariable String id) {
        Cart result = cartRepo.findId(id);
        return result;
    }  

    @PostMapping("/cart/{userid,product}")
	public Cart createCart(@RequestBody String userid, @RequestBody Product product ) {
		Cart cartObj = cartRepo.save(new Cart(userid, new Product(product.getId(),product.getImage(),product.getName(),product.getDescription(), product.getStockNum(),product.getPayment())));
		return cartObj;
    }
    
    @DeleteMapping("/cart/{id}")
	public ResponseEntity<String> deletebyID(@PathVariable("id") String id) {
 
		cartRepo.deleteById(id);
 
		return new ResponseEntity<>("Product has been removed!", HttpStatus.OK);
    }
    
    @DeleteMapping("/cart/delete")
	public ResponseEntity<String> deleteAllCustomers() {
 
		cartRepo.deleteAll();
 
		return new ResponseEntity<>("", HttpStatus.OK);
    }

}