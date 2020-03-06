/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP08;

/**
 *
 * @author Tran Thi An
 */
public class Point3D extends Point2D{
    private float z;
    
    public Point3D(){
        super();
        this.z=0.0f;
    }
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z=z;
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] xyz= new float[3];
        xyz[0]= this.getX();
        xyz[1]= this.getY();
        xyz[2]= this.getZ();
        return xyz;
    }

    @Override
    public String toString() {
        return "(" +super.getX()+ ", " +super.getY()+ ", " + z + ')';
    }
    
    
}
