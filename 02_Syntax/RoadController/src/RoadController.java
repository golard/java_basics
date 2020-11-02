import core.*;
import core.Camera;

import java.util.Scanner;

public class RoadController {
   /**/
    private static double passengerCarMaxWeight = 3500.0; // kg переменная double инициализация переменных
    private static int passengerCarMaxHeight = 2000; // mm переменная integer инициализация переменных
    private static double controllerMaxHeight = 3500; // mm переменная integer инициализация переменных

    private static int passengerCarPrice = 100; // RUB переменная integer инициализация переменных
    private static int cargoCarPrice = 250; // RUB еременная integer инициализация переменных
    private static int vehicleAdditionalPrice = 200; // RUB переменная integer инициализация переменных

    public static void main(String[] args) { //Переменная типа String[] параметр метода main
        System.out.println("Сколько автомобилей сгенерировать?"); // Запрос количества автомобилей у пользователя

        Scanner scanner = new Scanner(System.in); //переменная scanner сканирование введенного количество машин
        int carsCount = scanner.nextInt(); // Переменная integer сохраняем в целочисленную переменную

        for (int i = 0; i < carsCount; i++) { // переменная integer начинаем с 0, идем до количества введенных машин, прибавляя +1 пока i < carsCount
            Car car = Camera.getNextCar(); // создается объект машина
            System.out.println(car); //

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) { //если это специальный транспорт, то пропускаем бесплатно и продолжаем парсить машины дальше
                openWay(); // ""
                continue; // ""
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car); //Переменная integer инициализация переменных
            if (price == -1) { // "Если цена равна -1, то продолжай" Цена же всегда будет не равна -1?
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб."); //Вывод общей суммы к оплате
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car) {
        int carHeight = car.height; //Переменная integer
        int price = 0; // Переменная integer для начала вычислений присваеваем 0
        if (carHeight > controllerMaxHeight) { //Условие "Если высота машины больше, чем высота пропускного пункта, то..."
            blockWay("высота вашего ТС превышает высоту пропускного пункта!"); //ссылаемся на метод blockWay, путь преграждается
            return -1; //возвращаемся проверять следуюшую машину, если не проходим по высоте
        } else if (carHeight > passengerCarMaxHeight) { // "Иначе если высота машины больше максимальной легковой машины...
            double weight = car.weight;
            //Грузовой автомобиль

            if (weight > passengerCarMaxWeight) { //Дальше проверяем к какой машине соотнести вес, если вес больше веса легковой машины
                price = cargoCarPrice; // то тогда считаем по цене за легковую машину
                if (car.hasVehicle) { //Проверка объекта car, если ли прицеп или нет, мы проверили сработали ли math.random 50% d классе камера
                    price = price + vehicleAdditionalPrice; //Добавка к цене за грузовую машину
                    System.out.println("С учетом прицепа");
                }
            }
            //Легковой автомобиль
            else {
                price = passengerCarPrice; // Если это все-таки легковая машина по высоте, то цена для легковой
            }
        } else {
            price = passengerCarPrice; // Если это все-таки легковая машина по весу, то цена для легковой
        }
        return price; //возвращаемся наверх считать цену для следующей машины
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay() { // Метод для пропуска
        System.out.println("Шлагбаум открывается... Счастливого пути!"); //Вывод сообщения
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason) {
        System.out.println("Проезд невозможен: " + reason);
    } // Метод блокировки выезда, с выводом сообщения
}
//Программа