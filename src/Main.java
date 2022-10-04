public class Main {

	public static void main(String[] args) {
		int sum=0;
		for(String arg:args){
			int number= Integer.parseInt(arg);
			sum+=number;
		}
		System.out.println(sum/ args.length);
	}

}