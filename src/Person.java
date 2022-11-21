public class Person {
    String name;
    int age;
    int weit;

    public Person(String name, int age, int weit) {
        this.name = name;
        this.age = age;
        this.weit = weit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeit() {
        return weit;
    }

    public void setWeit(int weit) {
        this.weit = weit;
    }
    public void run () {
        System.out.println("  человек можеть бегать ");
    }
    public void speak(){
        System.out.println("Человек можеть говорить ");
    }
    public void fly(){
        System.out.println("человек можеть летать с помошу самалета ");
    }


    @Override
    public String toString() {
        return "Person{" +
                "namee='" + name + '\'' +
                ", age=" + age +
                ", weit=" + weit +
                '}' ;
    }
}
