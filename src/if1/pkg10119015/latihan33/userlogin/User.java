/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan33.userlogin;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class User {
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        if ((parUserName.equals(username)) && (parPassword.equals(password))){
            return statusAkun = true;
        } else {
            return statusAkun = false;
        }
    }

    private void hasilLogin(boolean status,String parUserName){
        status = statusAkun;
        if (status) {
            System.out.println();
            System.out.println("*****HALO " + username + " *****");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword){
        cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
}
