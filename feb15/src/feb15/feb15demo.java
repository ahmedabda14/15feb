/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb15;

/**
 *
 * @author ahmed
 */
interface test {
    void a();
    void b();
    void c();
    
}

 abstract class Sample implements test{
    public void b(){
        System.out.println("only 1 method forom int");
    }
    public void a(){
        System.out.println("2 method");
    }
}
class Engine extends Sample{
    @Override
    public void a(){
        
    }
    @Override
    public void c(){
        
    }
}
public class feb15demo {
    public static void main(String[]Args){
        test plane = new Engine();
        plane.a();
        plane.b();
        plane.c();
    }
}
