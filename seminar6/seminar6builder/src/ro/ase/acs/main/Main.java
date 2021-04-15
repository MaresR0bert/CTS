package ro.ase.acs.main;

import ro.ase.acs.builder.Product;
import ro.ase.acs.builder.ProductBuilderV2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Product product = new Product("milk",10,12345,23,null,0,false,true,true);
//        Product product2 = new Product("chocolate",7);
//        product2.setQuantity(10);
//        product2.setBarCode(123123);
//        //.......
//        product2.setExpireDate(new Date());

        Product product3 = new Product.ProductBuilder()
                .addName("milk")
                .addBarcode(12345)
                .addQuantity(23)
                .addIsVegetarianFriendly(true)
                .addIsGlutenFree(true)
                .build();

        ProductBuilderV2 builderV2 = new ProductBuilderV2();
        builderV2.addName("chocolate");
        builderV2.addPrice(7);
        builderV2.addQuantity(10);
        builderV2.addBarCode(1234124);
        Product product4 = builderV2.build();

        System.out.println(product3);
        System.out.println(product4);
    }
}
