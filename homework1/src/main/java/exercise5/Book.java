package exercise5;

/*
   Создайте класс "Книга", который будет представлять собой книгу в библиотеке.
   Класс должен содержать атрибуты, такие как название, автор и год издания.
   Реализуйте методы для получения и установки значений каждого атрибута, а также
   метод для вывода информации о книге на экран.
 */

public class Book {
String name;
String author;
int year;

    public Book() { }

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public void printBook() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Book test = new Book();
        test.setName("jbsjc");
        test.setAuthor("jbsjc");
        test.setYear(15);
        test.printBook();
    }
}
