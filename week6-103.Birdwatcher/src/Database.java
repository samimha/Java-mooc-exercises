
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sami
 */
public class Database {

    private ArrayList<Bird> birdList;

    public Database() {
        birdList = new ArrayList<Bird>();
    }

    public void add(Bird bird) {
        birdList.add(bird);
    }

    public void printBird(Bird bird) {
        System.out.println(bird.toString());
    }

    public void handleCommands(Scanner scanner) {
        for (;;) {
            System.out.println("?");
            String input = scanner.nextLine();
            if (input.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Latin Name:");
                String latinName = scanner.nextLine();
                add(new Bird(name, latinName));
            }
            if (input.equals("Observation")) {
                System.out.println("What was observed:?");
                String name = scanner.nextLine();
                boolean isNotBird = true;
                for (Bird bird : birdList) {
                    if (bird.name().equals(name)){
                        bird.observe();
                        isNotBird = false;
                    }
                }
                if (isNotBird){
                    System.out.println("Is not a bird!");
                }
                
            }
            if (input.equals("Statistics")) {
                for(Bird bird : birdList){
                    printBird(bird);
                }
            }
            if (input.equals("Show")) {
                System.out.println("What?");
                String name = scanner.nextLine();
                for (Bird bird : birdList) {
                    if (bird.name().equals(name)){
                        printBird(bird);
                    }
                }

            }
            if (input.equals("Quit")) {
                break;
            }
        }
    }
}
