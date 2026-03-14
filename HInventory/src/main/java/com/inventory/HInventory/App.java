package com.inventory.HInventory;

import com.inventory.dao.ProductDAO;
import com.inventory.entity.Product;

public class App {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        dao.insertProduct(new Product("Laptop","Dell Laptop",75000,10));
        dao.insertProduct(new Product("Mouse","Wireless Mouse",500,50));

        Product p = dao.getProduct(1);
        System.out.println("Product: "+p.getName());

        dao.updateProduct(1,70000,8);

        dao.deleteProduct(2);
    }
}