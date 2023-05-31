import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("Am intrat in main!");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        for(int num: integerList) {
            System.out.println("Lista din main: " + num);
        }

        (new Thread(new ReadList<Integer>(integerList))).start();

        (new ReadListVar2<Integer>(integerList)).start();

        System.out.println("Am iesit din main!");
    }
}