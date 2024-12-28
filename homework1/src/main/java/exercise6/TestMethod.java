package exercise6;

public class TestMethod {
    public static void main(String[] args) {
        Windows test = new Windows();
        for(int i = 0; i < 30; i++) {
            test.addUser(Math.random() < 0.5);
        }
//        test.addUser(false);
//        test.addUser(false);
//        test.addUser(false);
//        test.addUser(false);
//        test.addUser(true);
    }
}
