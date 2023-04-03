package DZ2;

public class Son implements FamilyTree{
    String type;
    String name;
    Integer age;
    Integer height;

    Son(String type, String name, Integer age, Integer height) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void print() {
        System.out.printf("%s %s %s %s \n",type, name, age, height);
    }
}
