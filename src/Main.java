public class Main {
    public static void main(String[] args) {
        int age = 14;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил");
        }

        if (age >= 7 ) {
            System.out.println("Может ходить в школу");
        } else if (age >= 18 ) {
            System.out.println("Может пойти в университет");
        } else if (age >= 24) {
            System.out.println("Может искать работу");
        }


        int capacity = 102;
        int seat = 60;
        int standingRoom = capacity - seat;

        int seatsUsed = 40;
        int standingRoomUsed = 40;

        if (seatsUsed < seat) {
            System.out.println("Осталось " + (seat - seatsUsed) + " сидячих мест");
        } else {
            if (seatsUsed == seat) {
                System.out.println("Сидячих мест не осталось");
            }
        }
    }
}