
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sami
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.starsInLastPrint = 0;
    }
    
    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }
    
    public void printLine(){
        Random random = new Random();
        for(int i = 0; i < width; i++){
            if(random.nextDouble() < density){
                System.out.print("*");
                starsInLastPrint++;
            }else{
                System.out.print(" ");
            }
        }
    }
    
    public void print(){
        starsInLastPrint = 0;
        for(int i = 0; i < height; i++){
            printLine();
            System.out.println("");
        }
    }
    
    public int starsInLastPrint(){
        return starsInLastPrint;
    }
}
