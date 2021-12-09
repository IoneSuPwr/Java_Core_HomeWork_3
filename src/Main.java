

/**
 ДЗ №3 - Обобщения
 Задание 2 - Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 Для хранения фруктов внутри коробки можно использовать ArrayList;
 Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
 которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 Можно сравнивать коробки с яблоками и апельсинами;
 Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов:
 нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты,
 которые были в первой;
 Не забываем про метод добавления фрукта в коробку.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("'g' - addFruit: ");
        or.addFruit(new Orange(),7);
        or1.addFruit(new Orange(),9);
        ap.addFruit(new Apple(),11);
        ap1.addFruit(new Apple(),5);
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
        System.out.println("'e' - compare(): ");
        System.out.println("Box 1 equals box 3: "+or.compare(ap));
        System.out.println("Box 2 equals box 4: "+or1.compare(ap1));
        System.out.println("'f' - pourTo(): ");
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("'d' - getWeight(): ");
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
    }
}
