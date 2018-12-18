import java.util.Scanner;

public class P_I_B {
	public static void main(String[] args) {
		Methods m=new Methods();
	@SuppressWarnings("resource")
	Scanner in=new Scanner(System.in);
System.out.println("Введіть Прізвище ім'я по батькові");
String pib_full=in.nextLine();
//String pib_full="Шевчук Михайло Андрійович";
String pib=m.pib(pib_full);
   System.out.println(pib);
	}
}
class Methods{
	private String words(String str,int n) {
		String[] words=str./*trim().*/split(" ");	
		return words[n];
	}
	private String firstLetter(String word) {
		char [] letters = word.toCharArray ();
		String result=String.valueOf(letters[0]);
		return result;
	}
	public String pib(String str) {
		String result1=firstLetter(words(str,1));
		String result2=firstLetter(words(str,2));
		String result3=words(str,0);
		String result_all=result1+"."+result2+"."+result3;
		return result_all;
	}
	}