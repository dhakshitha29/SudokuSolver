package player;
import java.util.Scanner;

public class Player {
    String pname;
    String email;
    String cntctno;
    public void setPlayer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name :");
        this.pname=sc.next();
        System.out.println("Enter EmailID :");
        this.email=sc.next();
        System.out.println("Enter Contactno :");
        this.cntctno=sc.next();
    }

    public void getPlayerName(){
        System.out.println(this.pname);
    }
}
