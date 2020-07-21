import java.io.*;
import java.util.Scanner;
public class tamgiac{
	int cv,a,b,c;
	public tamgiac(){
		
		System.out.println("Nhap so a:");
		Scanner aa = new Scanner(System.in);
		a=aa.nextInt();
		
		System.out.println("Nhap so b:");
		Scanner bb = new Scanner(System.in);
		b=bb.nextInt();
		
		System.out.println("Nhap so c:");
		Scanner cc = new Scanner(System.in);
		c=cc.nextInt();
		

	}
	
	public void kiemtradk( ){
		if(a<=0 || b<=0 || c<=0 || a+b<c || b+c<a || c+a<b){
		System.out.println("Khong ton tai");		
		}
		else
		{
			System.out.println("Day la mot hinh tam giac");
		}
	}
	
	public void xettamgiac( ){
		if( a<b+c && b<a+c && c<a+b ){
        if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
            System.out.println("Day la tam giac vuong");
        else if(a==b && b==c && c==a)
            System.out.println("Day la tam giac deu");
        else if(a==b || a==c || b==c)
            System.out.println("Day la tam giac can");
        else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b)    
            System.out.println("Day la tam giac tu");
        else
            System.out.println("Day la tam giac nhon");
    }
    else
        System.out.println("Day khong phai la ba canh cua mot tam giac");
	}	


	public static void main(String []args){
		/* tao doi tuong */
		tamgiac tg = new tamgiac();		
		
		tg.kiemtradk( );
		tg.xettamgiac( );
	}
}