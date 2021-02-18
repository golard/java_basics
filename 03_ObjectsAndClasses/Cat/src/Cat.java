import java.io.Serializable;

public class Cat
{
    public static final int  COUNT_EYES = 2;
    public static final double  MAX_WEIGHT = 10000.0;
    public static final double  MIN_WEIGHT = 1000.0;
    private double originWeight;
    public double weight;
    private double minWeight;
    private double maxWeight;
    public double totalFoodWeight;
    static int count;
    private boolean flag;


    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        totalFoodWeight = 0;
        //pee = 100.0;
        flag = true;
        count++;
    }

    public void meow()
    {
        if(flag) {
            weight = weight - 1;
            System.out.println("Meow");
        }
        else {
            System.out.println("Кошка мертва, она боьльше не может мяукать");
        }
    }

    public void feed(Double amount)
    {
        if(weight < maxWeight) {                    //Если вес кошки меньше допустимого, то покормить еще. => Count++
            weight = weight + amount;
            System.out.println("Кошка поела:" + weight);
        }

            else if (weight > maxWeight) {
                System.out.println("Кошка мертва, она не может больше есть");
                count--;
            }
            //if (weight > maxWeight) {               //Если вес кошки превышает, то кошка умирает. => Count--
            }


    public void drink(Double amount)
    {
        if(flag) {
            weight = weight + amount;
        }
        else {
            System.out.println("Кошка мертва, она больше не может пить");
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public Double getTotalFoodWeight ()
    {       //Сумма общего корма кота
        return totalFoodWeight;
    }

    public Double pee ()
    {
        weight = weight - 100.0;
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public static int count ()
    {
        return count;
    }

    static int getCount()
    {
        return count;
    }
}