/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3strukdat;
    import java.util.Scanner;
/**
 *
 * @author alan
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] CHAND){

        //Create an instance of stack
        latihan1class<String> stack = new latihan1class<String>();
        Scanner input = new Scanner(System.in);
        String s;
        System.out.println("Output: ");
        while(input.hasNext()){
            s = input.next();
            if(s.equals("-")){
                System.out.print(stack.pop()+" ");
            }else{
                stack.push(s);
            }
        }
        System.out.println();
    }
}