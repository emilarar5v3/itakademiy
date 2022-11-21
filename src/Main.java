public class Main {
    public static void main(String[] args) {
        Person nam = new Person("ALEKS ", 23, 76);
        System.out.println(nam);
        nam.run();
        nam.fly();
        nam.speak();
    }
}