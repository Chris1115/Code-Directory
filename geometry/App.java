import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean again = true;

        while (again)
        {
            System.out.println("Hi, welcome to the basic geometry calculator program");
            System.out.println("Choose basic shape first,");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
    
            int ans = input.nextInt();
    
            if (ans == 1)
            {
                circle lingkaran = new circle();

                System.out.println("input the diameter/radius : (dia/rad)\n");

                String cate = input.nextLine();
    
                if (cate.toLowerCase() == "dia")
                {
                    System.out.println("input the diameter : ");

                    int diam = input.nextInt();

                    lingkaran.setValue(diam, "radius");
                }

                System.out.println("Need derived 3D shape too?");
                System.out.println("1. Sphere");
                System.out.println("2. Cylinder");
                System.out.println("3. No need");
    
                int ansTwo = input.nextInt();
    
                // Declare object circle here
                
                lingkaran.count();


                // Declare object 3D here
                if(ansTwo == 1)
                {
                    // Declare object Sphere
                    sphere bola = new sphere();
                    bola.setValue(7, "radius");
                    bola.count();
                    bola.count3D();
                    bola.status3D();

                    again = false;
                }
                else if(ansTwo == 2)
                {
                    // Declare object Cylinder
                    cylinder tabung = new cylinder();
                    tabung.setValue(7, "radius");
                    tabung.setValue(10, "height");
                    tabung.count();
                    tabung.count3D();
                    tabung.status3D();

                    again = false;
                }
                else
                {
                    // Do Nothing, at least until now
                    lingkaran.status();
                    again = false;
                }
    
            }
            else if (ans == 2)
            {
                System.out.println("Need derived 3D shape too?");
                System.out.println("1. Cube");
                System.out.println("2. Cuboid");
                System.out.println("3. No need");
    
                int ansTwo = input.nextInt();
    
                // Declare object rectangle here
                rect kotak = new rect();

                kotak.setValue(10, "edgeA");
                kotak.setValue(20, "edgeB");
                kotak.countRect();
    
                // Declare object 3D here
                if(ansTwo == 1)
                {
                    // Declare object Cube
                    again = false;
                    cube kubus = new cube();
                    kubus.setValue(10, "edgeA");
                    kubus.setValue(20, "edgeB");
                    kubus.setValue(10, "height");
                    kubus.countRect();
                    kubus.count3D();
                    kubus.status3D();
                }
                else if(ansTwo == 2)
                {
                    // Declare object Cuboid
                    cuboid balok = new cuboid();
                    balok.setValue(10, "edgeA");
                    balok.setValue(20, "edgeB");
                    balok.setValue(10, "height");
                    balok.countRect();
                    balok.count3D();
                    balok.status3D();
                    again = false;
                }
                else
                {
                    // Do Nothing, at least until now
                    kotak.status();
                    again = false;
                }
            }
            else
            {
                System.out.println("Get the right option please!");
            }
        }

        input.close();
    }
}
