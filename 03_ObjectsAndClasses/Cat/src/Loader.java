import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Loader
{
    public static void main(String[] args) {
/*        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();*/

/*      System.out.println("Первая кошка: " + cat.getWeight());
        System.out.println("Вторая кошка: " + cat1.getWeight());
        System.out.println("Третья кошка: " + cat2.getWeight());
        System.out.println("Четвертая кошка: " + cat3.getWeight());
        System.out.println("Пятая кошка: " + cat4.getWeight());

        cat.feed(100.0);
        System.out.println("Вес первой кошки: " + cat.getWeight());

        cat2.feed(100.0);
        System.out.println("Вес второй кошки: " + cat2.getWeight());*/


/*      while (!cat.getStatus().equals("Exploded") ) {
            cat.feed(100.00);
        }
        System.out.println(cat.getStatus());

        while (!cat.getStatus().equals("Dead") ) {
            cat.meow();
        }
        System.out.println(cat.getStatus());*/

     /*   System.out.println("Вторая кошка: " + cat1.getWeight());

        cat1.feed(150.0);

        System.out.println("Вторая кошка съела "                    + cat1.getTotalFoodWeight() + " грамм корма.");
        System.out.println("Вторая кошка поела и теперь ее вес "    + cat1.getWeight() + " грамм");

        cat1.feed(100.0);

        System.out.println("Вторая кошка съела "                    + cat1.getTotalFoodWeight() + " грамм корма.");
        System.out.println("Вторая кошка поела и теперь ее вес "    + cat1.getWeight() + " грамм.");

        cat1.pee();
        System.out.println("Вес составляет " + cat1.getWeight()     + " грамм.");*/

/*        System.out.println("Первая кошка: " + cat.getWeight());
        System.out.println("Вторая кошка: " + cat1.getWeight());
        System.out.println("Третья кошка: " + cat2.getWeight());
        cat1.feed(9000.0);
        System.out.println("Вторая кошка: " + cat1.getStatus());
        System.out.println("Всего осталось кошек: " + cat.getCount());
        cat.feed(9000.0);
        System.out.println("Первая кошка: " + cat.getStatus());
        System.out.println("Всего осталось кошек: " + cat.getCount());*/

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        System.out.println(Cat.getCount());
        cat.feed(5.0);
        cat.feed(5.0);
        cat.feed(9000.0);
        cat.feed(9000.0);
        System.out.println("Осталось живых кошек : " + Cat.getCount());
        System.out.println("У кошки " + Cat.COUNT_EYES + " глазa");


        private static Cat getKitten(Double weight)
        {
            System.out.println(getKitten.Cat());
        }


    }
}
