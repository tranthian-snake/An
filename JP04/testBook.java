/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP04;

/**
 *
 * @author Tran Thi An
 */
public class testBook {
    public static void main(String[] args) {
        JP04.Author codelean=new JP04.Author("Code Lean","codeleanvn@gmail.com",'f');
        System.out.println(codelean.toString());
        JP04.Book dummybook=new JP04.Book("Java", codelean, 75.7, 5);
        System.out.println(dummybook.toString());
    }
}
