import java.util.Scanner;
public class mangmotchieu{

	public static void main(String[] args) {
		
		int n ;
			Scanner scanner = new Scanner(System.in);
		do{
		System.out.println("Nhap vao so phan tu cua mang");
		n=scanner.nextInt();
		} while (n<=0);
		
		int [] arr= nmang(n);
		
		xmang(arr);
		daonguoc(arr, n);
		System.out.println("\nNhap so can tim kiem");
		int k = new Scanner(System.in).nextInt();
			if(test(arr, k))
			System.out.println("So:" + k + " nam o vi tri " + tk(arr, k));
			else 
					System.out.println("Khong co so nao can tim trong mang ");

	}

	public static int[] nmang(int n) {
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Nhap cac phan tu cua mang");
			arr[i] = new Scanner(System.in).nextInt();
		}	
		return  arr;
	}
	
	public static void xmang(int [] arr) {
		System.out.println("\nXuat mang:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
	
	public static void daonguoc(int []a, int n) {
			

		for(int i=0;i<=n/2;i++)
		{
			int temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
	}

	public static boolean test(int []a, int n) {
			
			for(int i=0; i<a.length; i++) {
				if(a[i]==n) 
				return true;
			}
			
			return false;
			
		}
		
	public static int tk(int []a, int n) {
			
			for(int i=0; i<a.length; i++) {
				if(a[i]==n) {
					
					return i;
				}
			}
			
			return 0;
	}
		
}
//2020 Copyright by Tiendatmagic