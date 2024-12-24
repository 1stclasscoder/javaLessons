package exercise4;

/*
   Создайте класс "Магазин", который будет содержать информацию о товарах, такую
   как название, цена и количество на складе. Реализуйте методы для установки и
   получения значений каждого атрибута, а также метод для вывода информации о товаре на экран.
*/

import java.math.BigDecimal;

public class Shop {
    String name;
    BigDecimal price;
    int ProductQuantity;

    Shop() { }

    Shop(String name, double price, int ProductQuantity) {
        this.name = name;
        this.ProductQuantity = ProductQuantity;
        this.price = new BigDecimal(Double.toString(price));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price.doubleValue();
    }

    public void setPrice(double price) {
        this.price = new BigDecimal(Double.toString(price));
    }

    public int getProductQuantity() {
        return ProductQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        ProductQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ProductQuantity=" + ProductQuantity +
                '}';
    }

    public void printInf() {
        System.out.println(this);
    }

//    public static void main(String[] args) {
//        Shop test = new Shop("TTT", 123.5, 5);
//        System.out.println(test);
//        test.setName("electro");
//        test.setPrice(55.5);
//        test.setPrice(10);
//        System.out.println(test);
//        System.out.println(test.getName() + " " + test.getPrice() + " " + test.getProductQuantity());
//    }
}
