/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20game;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author user
 */
public class SKTVp20Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(5-0+1)+0;
        System.out.println("Программа загадала число от 0 до 5, отгадай: ");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        if(num == userNum){
            System.out.println("Ура, ты выиграл!");
        }else{
            System.out.println("Ты проиграл :(, задумано число: " + num);
        }
    }
    
}
