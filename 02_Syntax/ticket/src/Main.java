public class Main {

    public static void main(String[] args) {

//        for ( int i = 200000; i < 220001; i++) {
//
//            System.out.println(i);
//        }
//        for ( int a = 220001; a < 235001; a++)
//        {
//            System.out.println(a);
//        }


        int ticket1 = 200000;

        while (ticket1 < 235001) {
            System.out.println(ticket1);
            ticket1++;

            if (ticket1 == 210001 ){
                ticket1 = 220000;
            }
        }

    }
}
