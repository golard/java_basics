
public class Main {
    public static void main(String[] args) {


        //Люди
        int vasyaAge = 18;
        int katyaAge = 19;
        int mishaAge = 20;

        //Возраст
        int min = 0;
        int middle = 0;
        int max = 0;

        if (vasyaAge > katyaAge && vasyaAge > mishaAge) {
            max = vasyaAge;

            if (katyaAge > mishaAge) {
                middle = katyaAge;
                min = mishaAge;
            } else {
                min = katyaAge;
                middle = mishaAge;
            }
        } else if (katyaAge > mishaAge && katyaAge > vasyaAge) {
            max = katyaAge;

            if (mishaAge > vasyaAge) {
                middle = mishaAge;
                min = vasyaAge;
            } else {
                middle = vasyaAge;
                min = mishaAge;
            }
        } else if (mishaAge > vasyaAge && mishaAge > katyaAge) {
            max = mishaAge;

            if (vasyaAge > katyaAge) {
                middle = vasyaAge;
                min = katyaAge;

            } else {
                min = vasyaAge;
                middle = katyaAge;
            }
        }
        System.out.println(min);
        System.out.println(middle);
        System.out.println(max);

    }
}
