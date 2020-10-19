package org.wildfly.security.examples;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface Products {

    List<Product> getProducts();

    void addProduct(String name, double price, int numInStock);

    void removeProduct(String name);

}
