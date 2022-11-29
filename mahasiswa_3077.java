/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NO3_SIS105C_3077;

/**
 *
 * @author LENOVO
 */
public class mahasiswa_3077 {
    protected String nama_3077,nim_3077,jurusan_3077; 
    protected double ipk_3077;

    public mahasiswa_3077(String nama, String nim, String jurusan, double ipk){
        this.nama_3077 = nama;
        this.nim_3077 = nim;
        this.jurusan_3077 = jurusan;
        this.ipk_3077 = ipk;
    }
    
    public void cetakMahasiswa(){
        System.out.println("Nama Mahasiswa : "+nama_3077);
        System.out.println("NIM : "+nim_3077);
        System.out.println("Jurusan : "+jurusan_3077);
        System.out.println("IPK : "+ipk_3077);
    }
}
