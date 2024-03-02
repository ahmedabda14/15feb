/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feb15;

/**
 *
 * @author ahmed
 */

interface printable{
    void print();
    static int cube(int x){
        return x*x*x;
    }
}
interface Showable{
    void show();
}
public class Feb15 implements printable, Showable{
public void print(){
        System.out.println(" fbsjfk");

}


public void show(){
    System.out.println("sdfkj");
}
    public static void main(String[] args) {
printable p = new Feb15();
p.print();
printable.cube(2);
System.out.println(printable.cube(2));
Showable n = new Feb15();
n.show();

    }
    
}
