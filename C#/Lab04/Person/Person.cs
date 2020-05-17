using System;
public class Person
 {
    public string name;
    public int phone;
    public string email;
 
    public override String ToString()
    {
        return "Person has: name is " + name + ", email address is " + email;
    }
}
