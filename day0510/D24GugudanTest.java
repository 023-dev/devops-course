import java.util.Scanner;
class D24GugudanTest {
	public static void main(String[] args) {
		for(int i=1;i<10;i++){
		System.out.printf("<<\t구구단\t%d단\t>>\t\n", i);
			for(int j=1;j<10;j++){
				System.out.printf("%d\t*\t%d\t=\t%d\n", i, j, i*j);
			}
		}
	}
}
