/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author USER
 */
public class TestPolymorphism {
 
    public static void main(String[] args)
    {
        ObjekGeometri persegi = new Kotak();
        persegi.setColor("Blue");
        persegi.ObjekGeometri("Persegi", 40);
        
        ObjekGeometri lingkaran = new Lingkaran();
        lingkaran.setColor("Black");
        lingkaran.ObjekGeometri("Lingkaran", 50);
        
        ObjekGeometri oval = new Oval();
        oval.setColor("red");
        oval.ObjekGeometri("Oval", 20);
        
        ObjekGeometri trapesium =new Trapesium();
        trapesium.setColor("green");
        trapesium.ObjekGeometri("Trapesium", 50);
 
        displayObject(persegi);
        displayObject(lingkaran);
        displayObject(oval);
        displayObject(trapesium);
        
    }
    
    public static void displayObject(ObjekGeometri obj)
    {
        System.out.println(obj.getBentuk());
        System.out.println(obj.getcolor());
        System.out.println(obj.getLuas());
    }
 
}
