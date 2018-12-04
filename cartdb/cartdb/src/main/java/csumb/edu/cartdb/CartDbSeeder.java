package csumb.edu.cartdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import csumb.edu.cartdb.entities.Cart;
import csumb.edu.cartdb.entities.Description;
import csumb.edu.cartdb.entities.Image;
import csumb.edu.cartdb.entities.Product;

@Component
public class CartDbSeeder implements CommandLineRunner {
    // Product("6789",Image image,String name,Description description, int stockNum, double payment)
    @Autowired
    CartRepository repo;
    @Override
    public void run(String... args) throws Exception {
        Cart c = new Cart("12345", new Product("6789",new Image("https://i.pinimg.com/736x/04/7f/46/047f468286c538988a279d14027ef3b5.jpg"),"Otter Plush",new Description( "It's an Otter" ),5,25.99));

        repo.deleteAll();
        List<Cart> p = Arrays.asList(c);
        repo.saveAll(p);
    }
    
}