public class HanoiTower {


	public static void main(String[] args) {
		T t1 = new T();
		t1.move(3, 'A', 'B', 'C');



	}
}

class T{


	public void move(int num, char a, char b, char c){

		if(num == 1)System.out.println(a + "->" + c);

		else{
			//多个盘，分两部分，将上面n-1个当一个，最下面一个
			//将上部分移到b，将最下面移到c
			move(num - 1, a, c, b);//将盘子从a移到b,借助c
			System.out.println(a + "->" + c);
			move(num-1, b, a, c);//将盘子从b移到c，借助a
		}
	}
}
