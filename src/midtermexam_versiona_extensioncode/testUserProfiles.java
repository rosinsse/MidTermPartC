/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author srosi
 */
public class testUserProfiles {
    public static void main (String[] args){
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        Scanner i = new Scanner(System.in);
        System.out.println("what is your name?");
        String userID = i.nextLine();
        System.out.println("what is your favorite genre from this list? " + Arrays.toString(genres));
        String genre = i.nextLine();
        System.out.println("your profile has been created with name " + userID + " and favorite genre " + genre + ".");
    }
}
