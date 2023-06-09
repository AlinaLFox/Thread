import java.util.*;
// шаг 1. создаем класс, который будет афишировать содержание листа
// шаг 2. после названия класса указываем в <>, что лист может содержать любой тип данных
// шаг 3. имплементируем интерфейс Runnable
public class ReadList<T> implements Runnable {
    // создаем локальную переменную типа List c типом используемых данных Т
    private List<T> list;
    // создаем конструктор
    public ReadList(List<T> list) {
        this.list = list;
    }

    // переписываем метод из интерфейса Runnable
    @Override
    public void run() {
        // прописываем в теле метода foreach для чтения нашего листа
        // ("тип данных" + "присвоение названия" : "имя используемого листа")
        for (T num: list) {
            // метод void ничего не возвращает, поэтому выводим значение сразу на консоль
            System.out.println("Lista din thread: " + num);
        }
    }
}
