/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NO3_SIS105C_3077;

/**
 *
 * @author LENOVO
 */
public class studentStaff_3077 extends mahasiswa_3077 implements iPendapatan_3077{
    protected int jamKerja_3077;
    protected String unitKerja_3077;
    
    public studentStaff_3077(String nama, String nim, String jurusan, double ipk,String unitkerja, int jamKerja) {
        super(nama, nim, jurusan, ipk);
        this.unitKerja_3077 = unitkerja;
        this.jamKerja_3077 = jamKerja;
    }
    
    public double totalPendapatan_3077(){
        int pendapatan  = jamKerja_3077 * 30000;
        return pendapatan;
    }
    
    public void cetakAsprak_3077(){
    super.cetakMahasiswa();
    System.out.println("Unit Kerja : "+unitKerja_3077);
    System.out.println("Jam Kerja : "+jamKerja_3077);
    }
}
