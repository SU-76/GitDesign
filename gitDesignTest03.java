import java.util.Scanner;

public class Stars {
	public static void main(String[] args) {

		//老韩编程思想[get到了]
		//化繁为简 : 即将复杂的需求，拆解成简单的需求，逐步完成
		//先死后活 : 先考虑固定的值，然后转成可以灵活变化的值
		//优化[效率，可读性，结构]

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入层数：");
		int totalLevel = scanner.nextInt();

		//1 	直角三角形yes
		System.out.println("=============直角三角形==============");
		for (int i = 1; i<= totalLevel; i++){
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		//2 	等腰三角形yes
		System.out.println("=============等腰三角形==============");
		for (int i=1; i <= totalLevel; i++) {
			for (int j = (totalLevel - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {

				System.out.print("*");
			}
			for (int j2 = (totalLevel - i); j2 >= 1; j2--) {
				System.out.print(" ");
			}
			System.out.println("");
		}

		//3 	空心三角形	:(最难的想到了，最基本的没想到～
		System.out.println("=============空心三角形==============");
		for (int i=1; i <= totalLevel; i++) {
			for (int j = (totalLevel - i); j >= 1; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || k == (2 * i - 1) || i == totalLevel) {//思想精华，可以这么用，自己之前在do-while循环里已经用过了，为什么想不到呢？
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}

			for (int j2 = (totalLevel - i); j2 >= 1; j2--) {
				System.out.print(" ");
			}
			System.out.println("");
		}

		//4 练习 	空心菱形


	} 
}
