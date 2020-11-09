
public class Cat
{
    private double originWeight;
    public double weight;

    private double minWeight;
    private double maxWeight;
    public double totalFoodWeight;
    public double pee;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        totalFoodWeight = 0;
        pee = 100.0;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
        totalFoodWeight(amount);
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public double totalFoodWeight (Double amount) {       //Сумма общего корма кота
        totalFoodWeight = totalFoodWeight + amount;
        return totalFoodWeight;
    }

    public double pee (Double amount) {
        weight = weight - pee;
        return pee;
    }

    public String getStatus() {
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
}