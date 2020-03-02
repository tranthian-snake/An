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
public class testBook2 {
    public static void main(String[] args) {
        Author[] authors=new Author[2];
        authors[0] =new Author("Code Lean","codeleanvn@gmail.com",'f');
        authors[1] =new Author("Code Lean","codeleanvn@gmail.com",'m');
        
        Book2 dummybook=new Book2("Java", authors, 75.7, 5);
        System.out.println(dummybook.toString());
    }
}
