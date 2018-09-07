/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_09;
import java.util.Scanner;
/**
 *
 * @author Alina
 */
public class Tarea_09 {

static int o=0;
static boolean jugador=true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Cocina*/
        Cocina();    }
    
    public static void Cocina()
    {
    System.out.println("Estas  enfrente del refrigerador");
     System.out.println("¿Quieres comer? ");
      System.out.println("1.Si \n2.No");
      Scanner scanner = new Scanner(System.in);
      o=scanner.nextInt();
      scanner.nextLine();
      
      if(o==1)
      {
          Comida();
      }
      
    }
    public static void Comida()
    {
         
     System.out.println("¿Que quieres comer? ");
      System.out.println("1.Queso de cabra \n2.Yogurt griego");
      Scanner scanner = new Scanner(System.in);
      o=scanner.nextInt();
      scanner.nextLine();
      
      if(o==1)
      {
          Refrigerador();
      }
       if(o==2)
      {
          Yogurt();
      }
    }
    public static void Refrigerador()
    {
    System.out.println("Ya terminaste de comer");
     System.out.println("¿Quieres cerrar el refrigerador? ");
      System.out.println("1.Si \n2.No");
      Scanner scanner = new Scanner(System.in);
      o=scanner.nextInt();
      scanner.nextLine();
      
      if(o==1)
      {
          Cocina();
      }
      
    }
     public static void Yogurt()
    {
    System.out.println("El yogurt te hizo daño,vas al baño.");
     System.out.println("¿Ya acabaste? ");
      System.out.println("1.Si \n2.No");
      Scanner scanner = new Scanner(System.in);
      o=scanner.nextInt();
      scanner.nextLine();
      
      if(o==1)
      {
          Cocina();
      }
      
      
    }
    
    /*
    public static void Juego()
    {
         System.out.println("Rock paper scissors ");
               
            System.out.println("Take your pick ");
             System.out.println("1.Rock \n2.Paper \n3.Scissors");
             Scanner scanner = new Scanner(System.in);
             o=scanner.nextInt();
             scanner.nextLine();

            switch(o)
            {
                case 1:
                {
                   cpu();
                     System.out.println(o);
                   if(o==1)
                   {
                         System.out.println("Draw");
                   }
                     if(o==2)
                   {
                         System.out.println("You lose");
                   }
                       if(o==3)
                   {
                         System.out.println("You win");
                   }
                    break;
                }
                case 2:
                    {
                   cpu();
                     System.out.println(o);
                   if(o==1)
                   {
                         System.out.println("You lose");
                   }
                     if(o==2)
                   {
                         System.out.println("Draw");
                   }
                       if(o==3)
                   {
                         System.out.println("You win");
                   }
                    break;
                }
                case 3:
                   {
                   cpu();
                     System.out.println(o);
                   if(o==1)
                   {
                         System.out.println("You lose");
                   }
                     if(o==2)
                   {
                         System.out.println("You win");
                   }
                       if(o==3)
                   {
                         System.out.println("Draw");
                   }
                    break;
                }
            }
         }
    
    public static void cpu()
    {
        o =(int) Math.ceil(Math.random()*3);
        
        switch(o)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
                       
        }
    }*/
}
