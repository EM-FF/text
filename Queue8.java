public class Queue{

	public static void main(String[] args) {
	 	Queue8 queue = new Queue8();
	 	queue.check(0);
	 } 


}

class Queue8{

	int max = 8;
	int [] array = new int[max];
	static int count = 0;

	//放置第n个皇后的位置
	public void check(int n){
		if(n == 8){
			print();
			return;
		}
		//结束
		//依次放皇后，并判断是否冲突
		//每一次的递归，都会寻找一个皇后不冲突的所有位置，因此会回溯
		for(int i = 0; i < max; i++){
			array[n] = i;
			//不冲突，开始下一个皇后
			if(judge(n))check(n+1);
			//冲突，则用循环找合适位置
		}

	}

	private boolean judge(int n){
		for (int i = 0; i < n; i++){
			//array[i] == array[n]判断前n-1个皇后与第n个是否冲突
			//行冲突，不需要，check方法放每个皇后就是按行来循环
			//列冲突，array[i] == array[n]
			//对角线冲突，Math.abs(n - i) == Math.abs(array[n] - array[i])
			if(array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])){
				return false;
			}

		}
		return true;


	}


	private void print(){
		count++;
	 	System.out.printf("第%d种解法\n",count);
		for(int i = 0; i < max; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}





}
