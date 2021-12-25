/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolaankaryawan;

/**
 *
 * @author WIN10
 */
interface Gaji {
    public int hitungGajiKotor(int gapok, int tunjangan);
    public int hitungTunjangan();
    public double hitungGajiBersih(double gajiKotor, double potongan);
}
