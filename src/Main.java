import java.util.LinkedList;

public class Main {

    public static void main(String[] args){

        Fruit frutto1 = new Fruit("Mela");
        Fruit frutto2 = new Fruit("Pera");
        Fruit frutto3 = new Fruit("Banana");


        LinkedList<String> fruit = new LinkedList<String>();
        fruit.add(String.valueOf(frutto1));
        fruit.add(String.valueOf(frutto2));
        fruit.add(String.valueOf(frutto3));

        System.out.println(fruit);

        fruit.addFirst(String.valueOf(new Fruit("Fragola")));
        fruit.addLast(String.valueOf(new Fruit("Lampone")));

        System.out.println(fruit);

    }



}
