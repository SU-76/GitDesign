import java.util.Scanner;

public class MultiplyForExercise {
	public static void main(String[] args) {

		//老韩编程思想[get到了]
		//化繁为简 : 即将复杂的需求，拆解成简单的需求，逐步完成
		//先死后活 : 先考虑固定的值，然后转成可以灵活变化的值
		//优化[效率，可读性，结构]
		
		// 1 + 2
		Scanner scanner = new Scanner(System.in);
		double score;
		int classNum = 3; //班级数
		int passNum = 0; //及格人数
		double sum = 0.0;
		double sumClassScore = 0.0;
		for (int i = 1; i<=classNum; ++i) {
			//double sum = 0.0; 也可以在这里额声明sum;	`但是我感觉一直声明不是很好`
			for (int j = 1; j<=5; ++j) {
				System.out.println("请输入" + i + "班第"+ j + "个学生成绩:");
				score = scanner.nextDouble();
				sum += score;
				if (score >= 60) {
					++passNum;
				}
			}
			System.out.println(i + "班的平均分为：" + (sum/5));
			sumClassScore += sum;
			sum = 0;
		}
		//System.out.println("所有班级的平均分为：" + (sumClassScore/classNum)); //三个班的平均分这么算？
		System.out.println("所有班级的平均分为：" + (sumClassScore/(classNum * 5));
		System.out.println("所有班级及格人数：" + passNum);


		//2 可以加到一块
		/*int score2;
		int count2 = 0;
		for (int i = 1; i<=3; ++i) {
			for (int j = 1; j<=5; ++j) {
				System.out.println("请输入" + i + "班第"+ j + "个学生成绩:");
				score2 = scanner.nextInt();
				if (score2 >= 60) {
					++count2;
				}
			}
			System.out.println("所有班级及格人数：" + count2);
		}*/


		//3
		for (int i = 1; i<=9; ++i) {
			for (int j = 1; j <= i; ++j) {//根据图给的要求来操作，想一想大循环和小循环分别执行多少
				System.out.print(j + " x " + i + " = " + (i*j) + "\t");
			}
			System.out.println("");
		}






	} 
}
