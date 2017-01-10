import java.util.ArrayList;

public class Hippodrome {
    public static void main (String[] args) throws InterruptedException {
        game = new Hippodrome();
        Horse horse1 = new Horse("Marina", 3, 0);
        Horse horse2 = new Horse("Katerina", 3, 0);
        Horse horse3 = new Horse("Elena", 3, 0);
        game.horses.add(horse1);
        game.horses.add(horse2);
        game.horses.add(horse3);
        game.horses = game.getHorses();
        game.run();
        game.printWinner();
    }
    public static Hippodrome game;
    public static ArrayList<Horse> horses = new ArrayList<>();
    public ArrayList<Horse> getHorses() {
        return horses;
    }
    public void run() throws InterruptedException {
        for(int i = 1; i <= 100; i ++){
            move();
            print();
            Thread.sleep(500);
        }
    }
    public void move() {
        for (Horse horse : horses)
            horse.move();
    }
    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        System.out.println();
        System.out.println();
    }
    public Horse getWinner(){
        Horse winner;
        if (horses.size() == 0){
            return null;
        }
        else winner = horses.get(0);
        for (int i = 1; i < horses.size(); i ++){
            if (horses.get(i).distance > winner.distance){
                winner = horses.get(i);
            }
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().name + "!");
    }
}