/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author USER
 */
public class Oval extends ObjekGeometri{
    
    public void ObjekGeometri(String bentuk, int luas) {
        this.bentuk = bentuk;
        this.luas = luas;
    }
    
    public String getBentuk() {
        return super.bentuk;
    }
    
    public int getLuas() {
        return super.luas;
    }
    
}
