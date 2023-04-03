package DZ2;

class Father implements FamilyTree{
    String type;
    String name;
    Integer age;
    Integer height;

   Father(String type, String name, Integer age, Integer height) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    //    @Override
//    public String display() {
//        return "Семья {" +
//                "статус ='" + type + '\'' +
//                ", имя ='" + name + '\'' +
//                ", возраст =" + age +
//                ", рост =" + height +
//                '}';
//    }


    public void print() {
        System.out.printf("%s %s %s %s \n",type, name, age, height);
    }
}
