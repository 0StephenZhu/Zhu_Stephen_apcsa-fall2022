//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowels = "aeiouAEIOU";
	   
	   boolean isFirstLast = false;
	   for (int i = 0; i < vowels.length(); i++) {
		   if (a.charAt(0) == vowels.charAt(i) || a.charAt(a.length() - 1) == vowels.charAt(i)) {
			   isFirstLast = true;
		   }
	   }
	   
	   if (isFirstLast) {
		   return "yes";
	   }
	   else {
		   return "no";
	   }
	} 
}