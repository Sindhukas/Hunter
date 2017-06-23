package Hunter;

public class RmvDup {
	public static void main(String[] args){
		String input=new String("abbc");
		System.out.println("The input is:"+input);
		String out=new String();
		for(int i=0;i<input.length();i++){
				if(input.charAt(i%input.length())!=
						input.charAt((i+1)%input.length())){
					out=out+input.charAt(i);
				}
		}System.out.println("The output is:"+out);
	}

}
