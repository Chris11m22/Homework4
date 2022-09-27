public class Main {
    public static void main(String[] args) {
        int age = 13;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) ;{
            System.out.println("Возраст совершеннолетия ещё не наступил");
        }

        if (age >= 7 && age <18); {
            System.out.println("Ребенок может ходить в школу");
        }
        if (age >= 18 && age < 24) ;{
            System.out.println("Может пойти в университет");
        }
        if (age >= 24) ;{
            System.out.println("Может искать работу");
        }
        int capacity = 102;
        int seat = 60;
        int standingRoom = capacity - seat;

        int seatsUsed = 40;
        int stabdingRoomUsed = 30;

        if (seatsUsed < seat); {
            System.out.println("Осталось " + (seat - seatsUsed) + " сидячих мест");
            if (standingRoom == stabdingRoomUsed);{
                System.out.println("Стоячих мест не осталось");
            }
        }
    }
}