package Hunter;

public class StringRev1 {
	public static void main(String[] args){
		String str[]="She is beautiful".split(" ");
		String finalStr="";
		for(int i=str.length-1;i>=0;i--){
			finalStr+=str[i]+" ";
		}
		System.out.println("The Reversed string words are:"+ finalStr);

	}
}
