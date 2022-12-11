/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NO3_SIS105C_3077;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class main_3077 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Jumlah Asisten Praktikum : ");
        int jmlAsis = sc.nextInt();
        for(int x = 0;jmlAsis > x;x++){}
        System.out.println("Jumlah Student Staff : ");
        int jmlStudstaff = sc.nextInt();
        */
        assistenPraktiku_3077 asprak[] = new assistenPraktiku_3077[2];
        asprak[0] = new assistenPraktiku_3077("Jamal", "21301233", "Sistem Informasi", "PBO", 3.3, 12);
        asprak[1] = new assistenPraktiku_3077("Harry", "19320233", "Teknik Sains", "Managemet  Database", 3, 10);
        
        asprak[0].totalPendapatan_3077();
        asprak[0].cetakAsprak_3077();
        System.out.println("");
        asprak[1].totalPendapatan_3077();
        asprak[1].cetakAsprak_3077();
        System.out.println("");
        
        
        studentStaff_3077 stustaff[] = new studentStaff_3077[2];
        stustaff[0] = new studentStaff_3077("Galih", "20120341", "Sistem Informasi", 3.6, "Fakultas Informatika", 8);
        stustaff[1] = new studentStaff_3077("Holand", "2122444", "Sistem Informasi", 3.1, "Fakultas Desain dan Komunikasi", 8);
        
        stustaff[0].totalPendapatan_3077();
        stustaff[0].cetakAsprak_3077();
        System.out.println("");
        stustaff[1].totalPendapatan_3077();
        stustaff[1].cetakAsprak_3077();
    }
}
