package DZ2;

public class Program {
    public static void main(String[] args) {
        Father father = new Father("Отец", "Александр", 50, 180);
        father.print();

        Son son = new Son("Сын", "Вася", 15, 156);
        son.print();
    }
}
