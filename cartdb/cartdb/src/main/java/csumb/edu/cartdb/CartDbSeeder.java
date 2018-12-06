package csumb.edu.cartdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import csumb.edu.cartdb.entities.Cart;

@Component
public class CartDbSeeder implements CommandLineRunner {
    // Product("6789",Image image,String name,Description description, int stockNum, double payment)
    @Autowired
    CartRepository repo;
    @Override
    public void run(String... args) throws Exception {
        Cart c = new Cart("12345", "6789");
        repo.deleteAll();
        List<Cart> p = Arrays.asList(c);
        repo.saveAll(p);
    }
    
}