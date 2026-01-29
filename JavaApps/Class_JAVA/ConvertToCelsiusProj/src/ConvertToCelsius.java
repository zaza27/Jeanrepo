
public class ConvertToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fDegrees = 0;
		int cDegrees = 0;
		
		String midText = " Degrees fahrenheit is ";
		String endText = " degrees celsius.";
		
		fDegrees = 32;
		cDegrees = (int)((5.0/9.0)*(fDegrees - 32.0));
		System.out.println(fDegrees + midText + cDegrees + endText);
		
		fDegrees = 72;
		cDegrees = (int)((5.0/9.0)*(fDegrees - 32.0));
		System.out.println(fDegrees + midText + cDegrees + endText);
		
		fDegrees = 212;
		cDegrees = (int)((5.0/9.0)*(fDegrees - 32.0));
		System.out.println(fDegrees + midText + cDegrees + endText);
		

	}

}
