/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP11;

/**
 *
 * @author Tran Thi An
 */
public class ResizableCircle extends Circle2 implements Resizable {
    
   public ResizableCircle(double radius){
       super(radius);
   }
    @Override
    public void resize(int percent){
       radius=radius*percent;
    }
}
