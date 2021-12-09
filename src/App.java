
/** ДЗ №3 - Обобщения

  Задание 1 - Написать метод, который меняет два элемента массива местами
  (массив может быть любого ссылочного типа); */

public class App {

    private final int[] arr;

    public static void main(String[] args) {

        /** массив на 5 элементов, минимальное значение чисел в массиве - 0, максимальное - 5 */
        App app = new App(5, 0, 5);

        /** выводим в консоль, для этого переопределяем метод toString() */
        System.out.println(app);
         app.swap(0, 1);
            System.out.println(app);
    }
    public App(int[] arr) {
        this.arr=arr;
    }
    public App(int size, int origin, int bound) {
        this(new java.util.Random().ints(size, origin, bound).toArray());
    }
    public void swap(int index1, int index2) {
        int tmp = arr[index1];
            arr[index1] = arr[index2];
             arr[index2] = tmp;
    }
    @Override
    public String toString() {
        /** так как для массива метод toString() не переопределен,
         используем утилитный метод вывода массива в консоль */
        return java.util.Arrays.toString(arr);
    }
}
