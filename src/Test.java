public class Test {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(numberGenerator);
        thread1.start();
        thread2.start();
    }
}
