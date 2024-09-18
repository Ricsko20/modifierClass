
class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void introduce() {
        System.out.println("Célom: Élj a pillanatnak!");
    }
    
    public void getGoal() {
        System.out.println("Szia " + name + " vagyok " + age + " éves " + gender);
    }
}

public class PersonPelda {
   public static void main(String[] args) {
        Person kevi = new Person("Kevi", 20, "Nő");
        Person stu = new Person("stu", 70, "Nő");
        Person bokorlako = new Person("Bokorlakó", 5, "Férfi");

        kevi.introduce();
        kevi.getGoal();
        stu.introduce();
        stu.getGoal();
        bokorlako.introduce();
        bokorlako.getGoal();

   }

   
}
