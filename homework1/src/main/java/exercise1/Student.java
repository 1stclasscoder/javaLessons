package exercise1;

/*
Создайте класс "Студент", который будет содержать информацию о студенте, такую как имя,
возраст и средний балл. Реализуйте методы для получения и установки значений каждого атрибута,
а также метод для вывода информации о студенте на экран.
 */

public class Student {
    private String name;
    private int age;
    private double avgPoint;

    public Student() { }

    public Student(String name, int age, double avgPoint) {
        this.name = name;
        this.age = age;
        this.avgPoint = avgPoint;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAvgAge() {
        return avgPoint;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
       this.age = age;
    }

    public void setAvgAge(double avgAge) {
        this.avgPoint = avgAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avgAge=" + avgPoint +
                '}';
    }

    public void printStudent() {
        System.out.println(this);
    }

//        public static void main(String[] args) {
//        Student st = new Student("sdsc", 5, 10);
//        st.printStudent();
//    }
}