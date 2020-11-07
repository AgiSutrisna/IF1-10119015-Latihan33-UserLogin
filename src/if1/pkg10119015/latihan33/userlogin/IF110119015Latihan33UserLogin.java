/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan33.userlogin;
import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static String usName, passWord;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        usName = input.next();
        System.out.print("Masukkan Password = ");
        passWord = input.next();
        
        User user = new User();
        user.pengecekkanLogin(usName, passWord);
        
        
    }
    
}
