public class Main {
    public static void main(String[] args) {
        int age = 14;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + "" + " ,то ему нужно ходить в детский сад");
        }else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить на работу");
        }
        if (age < 5) {
            System.out.println("Ребенок не может на аттракционе");
        } else if (age > 5 || age<=14) {
            System.out.println("Ребенок может кататься на аттракционе в сопровождении взрослого");
        }else if (age>14) {
            System.out.println("Ребенок может кататься на аттракционе без сопровождения взрослого");
        }
        int one = 55;
        int two = 22;
        int three = 33;
        if (one > two) {
            if (one > three) {
                System.out.println("Наибольшим числом будет " + one);
            } else if (three < one) {
                System.out.println("Наибольшим числом будет " + three);

            }

        }



    }
}