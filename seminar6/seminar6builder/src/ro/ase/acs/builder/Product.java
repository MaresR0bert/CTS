package ro.ase.acs.builder;

import java.util.Date;

public class Product {
    private String name;
    private float price;
    private long barCode;
    private int quantity;
    private Date expireDate;
    private float discount;
    private boolean isVeganFriendly;
    private boolean isVegetarianFriendly;
    private boolean isGlutenFree;

    Product(String name, float price, long barCode, int quantity, Date expireDate, float discount, boolean isVeganFriendly, boolean isVegetarianFriendly, boolean isGlutenFree) {
        this.name = name;
        this.price = price;
        this.barCode = barCode;
        this.quantity = quantity;
        this.expireDate = expireDate;
        this.discount = discount;
        this.isVeganFriendly = isVeganFriendly;
        this.isVegetarianFriendly = isVegetarianFriendly;
        this.isGlutenFree = isGlutenFree;
    }

    Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public float getPrice() {
        return price;
    }

//    public void setPrice(float price) {
//        this.price = price;
//    }

    public long getBarCode() {
        return barCode;
    }

//    public void setBarCode(long barCode) {
//        this.barCode = barCode;
//    }

    public int getQuantity() {
        return quantity;
    }

//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }

    public Date getExpireDate() {
        return expireDate;
    }

//    public void setExpireDate(Date expireDate) {
//        this.expireDate = expireDate;
//    }

    public float getDiscount() {
        return discount;
    }

//    public void setDiscount(float discount) {
//        this.discount = discount;
//    }

    public boolean isVeganFriendly() {
        return isVeganFriendly;
    }

//    public void setVeganFriendly(boolean veganFriendly) {
//        isVeganFriendly = veganFriendly;
//    }

    public boolean isVegetarianFriendly() {
        return isVegetarianFriendly;
    }

//    public void setVegetarianFriendly(boolean vegetarianFriendly) {
//        isVegetarianFriendly = vegetarianFriendly;
//    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

//    public void setGlutenFree(boolean glutenFree) {
//        isGlutenFree = glutenFree;
//    }

    public static class ProductBuilder {
        private Product product;

        public ProductBuilder() {
            this.product = new Product(null, 0);
        }

        public ProductBuilder addName(String name) {
            this.product.name = name;
            return this;
        }

        public ProductBuilder addPrice(float price) {
            this.product.price = price;
            return this;
        }

        public ProductBuilder addBarcode(long barCode) {
            this.product.barCode = barCode;
            return this;
        }

        public ProductBuilder addQuantity(int quantity) {
            this.product.quantity = quantity;
            return this;
        }

        public ProductBuilder addExpireDate(Date expireDate) {
            this.product.expireDate = expireDate;
            return this;
        }

        public ProductBuilder addDiscount(float discount) {
            this.product.discount = discount;
            return this;
        }

        public ProductBuilder addIsVeganFriendly(boolean isVeganFriendly) {
            this.product.isVeganFriendly = isVeganFriendly;
            return this;
        }

        public ProductBuilder addIsVegetarianFriendly(boolean isVegetarianFriendly) {
            this.product.isVegetarianFriendly = isVegetarianFriendly;
            return this;
        }

        public ProductBuilder addIsGlutenFree(boolean isGlutenFree) {
            this.product.isGlutenFree = isGlutenFree;
            return this;
        }

        public Product build() {
            return this.product;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", barCode=" + barCode +
                ", quantity=" + quantity +
                ", expireDate=" + expireDate +
                ", discount=" + discount +
                ", isVeganFriendly=" + isVeganFriendly +
                ", isVegetarianFriendly=" + isVegetarianFriendly +
                ", isGlutenFree=" + isGlutenFree +
                '}';
    }
}
