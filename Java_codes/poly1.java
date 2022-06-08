class vehicle
{
    public void typevehicle(String name,int milage,int max_speed)
    {
        System.out.println(name+" has maximum speed of "+max_speed+" also provide "+milage+" km/l of milage");
    }
}
class cars extends vehicle
{
    public void typevehicle(String name,int milage,int max_speed)
    {
        System.out.println(name+" has maximum speed of "+max_speed+" also provide "+milage+" km/l of milage");
    }
}
class trucks extends vehicle
{
    public void typevehicle(String name,int milage,int max_speed)
    {
        System.out.println(name+" has maximum speed of "+max_speed+" also provide "+milage+" km/l of milage");
    }
}
public class poly1 {
    public static void main(String args[])
    {
        vehicle v1 = new vehicle();
        vehicle v2 = new cars();
        vehicle v3 = new trucks();
        v1.typevehicle("Vehicle name",10,20);
        v2.typevehicle("Porshe",200,2);
        v3.typevehicle("Tata",120,10);
    }
}
