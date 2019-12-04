package Exception;

public class ExceptionAvgDemo {

	public static void main(String[] args) throws SyoriException {
	int avg = getAvg(10,20,55,65,76,-56);	
	System.out.println(avg);
	}
	
	
	private static int getAvg(int...source) throws SyoriException {
		int sum = 0;
		for (int s : source) {
			if( s < 0 ) {
				throw new SyoriException("引数は０より大きい値を設定してください" + s);
			}
			sum = sum + s;
		}
		return sum/source.length;
	}
}
