public class Main {

    public static void main(String[] args) {
        chekYear(2022);
        getDeviceLink(0, 2007);
        int deliveryDays = calculateDeliveryDays(95);
        System.out.println("Потребуется дней: " + deliveryDays);

    }

    public static void chekYear(int year) {
        if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 400 == 0 || year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void getDeviceLink(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            day = 2;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            day = 3;
        }
        return day;
    }
}