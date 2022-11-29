/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NO3_SIS105C_3077;

/**
 *
 * @author LENOVO
 */

public class assistenPraktiku_3077 extends mahasiswa_3077 implements iPendapatan_3077{
    protected String mkAssistent_3077;
    protected int jmlPertemuan_3077,pendapatan;

    public assistenPraktiku_3077(String nama, String nim, String jurusan,String mkasis,double ipk, int jumlahpert) {
        super(nama, nim, jurusan, ipk);
        this.mkAssistent_3077 = mkasis;
        this.jmlPertemuan_3077 = jumlahpert;
    }
    
    public double totalPendapatan_3077(){
        pendapatan  = jmlPertemuan_3077 * 50000;
        return pendapatan;
    }
    
    public void cetakAsprak_3077(){
        super.cetakMahasiswa();
        System.out.println("MK Asisten : "+mkAssistent_3077);
        System.out.println("Jumlah Pertemuan : "+jmlPertemuan_3077);
        System.out.println("Pendapatan : "+pendapatan);
    }
}
