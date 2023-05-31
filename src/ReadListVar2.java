import java.util.List;

public class ReadListVar2<T> extends Thread {

    // создаем локальную переменную типа List c типом используемых данных Т
    private List<T> list;

    // создаем конструктор
    public ReadListVar2(List<T> list) {
        this.list = list;
    }

    // переписываем метод из класса Thred
    public void run() {
        // прописываем в теле метода foreach для чтения нашего листа
        // ("тип данных" + "присвоение названия" : "имя используемого листа")
        for (T num : list) {
            // для обработки exception используем try/catch
            try {
                // попробуй погрузить в сон на 3 секунды
                Thread.sleep(3000);
                // учти вероятную ошибку
            } catch (InterruptedException e) {
                //если такая есть, то выведи на консоль
                System.out.println(e.getMessage());
            }
            System.out.println("Lista cu sleep: " + list);
        }
    }
}
