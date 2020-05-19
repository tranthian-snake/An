using System;
public class Person
 {
    public string name;
    public int phone;
    public string email;

    public Person() { }
    public Person(string name, int phone, string email)
    {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public override String ToString()
    {
        return "Person has: name is " + name + ", email address is " + email;
    }
}
