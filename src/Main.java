public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;

        double currentVolume = 0;
        int hours = 0;

        while (currentVolume < volume) {
            currentVolume += fillingSpeed;
            currentVolume -= devastationSpeed;
            hours++;
        }
        System.out.println("Время наполнения бассейна: " + hours + " часов");
    }
}
