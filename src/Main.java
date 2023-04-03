public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }

    public static void task1() {
        int year = 2100;
        printMessage(year);
    }

    private static void printMessage(int year) {
        if (isYearLeeap(year)) {
            System.out.println(year + " - высокосный год");
        } else {
            System.out.println(year + " - не высокосный год");
        }
    }

    public static boolean isYearLeeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }


    public static void task2() {
    printLink( 0,2016);
    }
    private static void printLink ( int os, int year) {
            if (os == 0) {
                if (year >= 2015) {
                System.out.println("Новое приложение для iOS");
            } else {
                System.out.println("Старое приложение для iOS");
            }
        } else {
                if (year >= 2015) {
                    System.out.println(" Новое приложение для android");
                } else {
                    System.out.println(" Старое приложение для android");
                }
            }
        }
        private static void task3(){
        printDeliveryDays( 95);
        }
        private static void printDeliveryDays(int distance){
        int deliveryDays = calcuLateDeliveryDays(distance);
        if(deliveryDays < 0){
            System.out.println("Доставки нет");
        } else {
            System.out.println("Доставка займет " + deliveryDays + " дней");
        }
        }
        private  static  int calcuLateDeliveryDays(int distance){
        if (distance < 20) {
            return 1;
        }else if ( distance < 60) {
            return 2;
        } else if ( distance < 100) {
            return 3;
        } else {
            return -1;
        }
        }

}

