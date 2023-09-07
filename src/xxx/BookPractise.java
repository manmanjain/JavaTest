package xxx;

public class BookPractise {
	public static void main(String[] args) {
		int[] a = { 2, 4, 7, 1, 5 };
		int[] b = new int[5];
		int i, s = 0;

		for (i = 0; i <= 4;i++) {
			System.out.print(a[i]+" ");

		}
		System.out.println();
		
		for(i=0;i<=4;i++) {
			s+=a[i];
			
		}
		System.out.println("sum="+s);
		
		for(i=0;i<=4;i++) {
			b[i]=a[i]*2;
		}
		for(i=0;i<=4;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		int[] c= {-1,0,3,4,-5,8};
		int j;
		int pos=0,neg=0,zero=0;
		
		for(j=0;j<=5;j++) {
			System.out.print(c[j]+" ");
		}
		System.out.println();
		
		for(j = 0;j<=5;j++) {
			if(c[j]>0) {
				pos+=1;
			}else if(c[j]<0){
				neg+=1;
			}else {
				zero+=1;
			}
		}
		System.out.print("正數："+pos+";"+"0:"+zero+";"+"neg:"+neg);
	}
}
