package sanket;
import java.util.*;
public class NotesCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount");
		int amo=sc.nextInt();
		int note;
		if(amo>=500)
		{
			note=amo/500;
			amo=amo-(note*500);
			System.out.println("Notes 2500 : "+note);
			System.out.println("Available amount : "+amo);
		}
		if(amo>=200)
		{
			note=amo/200;
			amo=amo-(note*200);
			System.out.println("Notes 200 : "+note);
			System.out.println("Available amount : "+amo);
		}
		if(amo>=100)
		{
			note=amo/100;
			amo=amo-(note*100);
			System.out.println("Notes 100 : "+note);
			System.out.println("Available amount : "+amo);
		}
		if(amo>=50)
		{
			note=amo/50;
			amo=amo-(note*50);
			System.out.println("Notes 50 : "+note);
			System.out.println("Available amount : "+amo);
		}
		if(amo>=20)
		{
			note=amo/20;
			amo=amo-(note*20);
			System.out.println("Notes 20 : "+note);
			System.out.println("Availeble amount : "+amo);
		}
		if(amo>=10)
		{
			note=amo/10;
			amo=amo-(note*10);
			System.out.println("Notes 10 : "+note);
			System.out.println("Avialable amount : "+amo);
		}
	}

}
