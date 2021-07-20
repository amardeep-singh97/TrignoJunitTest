package trigno;
import java.util.*;

public class TrignometryFunctions {
	
	private static final double pi = 3.141592653589793238462643383279;
	
	
	public TrignometryFunctions() {
		//constructor
	}
	
	public double sinFunctionRadian(double rad) {
		
		
		double degree = convertToDegree(rad);
		
		int answerFormat = 1;
		
		Map recivedMap = detectQuadrantDegree(degree);
		
		double recivedDegree = (double) recivedMap.get("Degree");
		int recivedQuadrant = (int) recivedMap.get("Quadrant");
		
		if(recivedQuadrant==3||recivedQuadrant==4) {
			if(recivedDegree == 360) {
				answerFormat = 1;
			}else {
				answerFormat = -1;	
			}
			
		}
		
		if(recivedQuadrant==2) {
			if(recivedDegree==180) {
				recivedDegree = recivedDegree%90;
			}else {
				recivedDegree = recivedDegree%90;
				recivedDegree = conversionPositiveDegree(recivedDegree);
			}

		}
		
		if(recivedQuadrant==3) {
			recivedDegree = recivedDegree%180;
		}
		
		if(recivedQuadrant==4) {
			recivedDegree = recivedDegree%270;
			recivedDegree = conversionPositiveDegree(recivedDegree);
		}
		
		double radian = convertToRadian(recivedDegree);
		
		int iterations = 20;
		double answer=0;
		int j=1;
		
		for(int i = 1 ; i <=iterations; i= i+2) {
			answer = answer + j*(raisePower(radian,i)/ (double) factorial(i));
			j = j*(-1);
		}	
		
		
		return answerFormat*answer;
	}
	
	
	public double cosFunctionRadian(double rad) {
		
		double degree = convertToDegree(rad);
		
		
		int answerFormat = 1;
		
		Map recivedMap = detectQuadrantDegree(degree);
		
		double recivedDegree = (double) recivedMap.get("Degree");
		int recivedQuadrant = (int) recivedMap.get("Quadrant");
		
		
		if(recivedQuadrant==2||recivedQuadrant==3) {
			answerFormat = -1;
		}
		
		if(recivedQuadrant==2) {
			recivedDegree = recivedDegree%90;
		}
		
		if(recivedQuadrant==3) {
			recivedDegree = recivedDegree%180;
		}
		
		if(recivedQuadrant==4) {
			recivedDegree = recivedDegree%270;
			recivedDegree = conversionPositiveDegree(recivedDegree);
		}
		
		double radian = convertToRadian(recivedDegree);
		
		int iterations = 20;
		double answer = 0;
		int j=1;
		
		for(int i = 0; i<= iterations; i=i+2) {
			answer = answer + j*(raisePower(radian,i)/ (double) factorial(i));
			j = j*(-1);
		}
		
		return answerFormat*answer;
	}
	
	public double tanFunctionRadian(double rad) {
		double answer = 0;
		int answerFormat = 1;
		if(rad == pi) {
			answerFormat = -1;
		}
		
		if(rad == pi/2 ) {
			answer = Double.POSITIVE_INFINITY;
		} 
		else if (rad == pi*1.5) {
			answer = Double.NEGATIVE_INFINITY;
		}
		else{
			answer = sinFunctionRadian(rad)/cosFunctionRadian(rad);
		}
		
		return answerFormat*answer;
	}
	
	public double sinFunctionDegree(double degree) {

		int answerFormat = 1;
		
		Map recivedMap = detectQuadrantDegree(degree);
		
		double recivedDegree = (double) recivedMap.get("Degree");
		int recivedQuadrant = (int) recivedMap.get("Quadrant");
		
		if(recivedQuadrant==3||recivedQuadrant==4) {
			if(recivedDegree == 360) {
				answerFormat = 1;
			}else {
				answerFormat = -1;	
			}
			
		}
		
		if(recivedQuadrant==2) {
			if(recivedDegree==180) {
				recivedDegree = recivedDegree%90;
			}else {
				recivedDegree = recivedDegree%90;
				recivedDegree = conversionPositiveDegree(recivedDegree);
			}

		}
		
		if(recivedQuadrant==3) {
			recivedDegree = recivedDegree%180;
		}
		
		if(recivedQuadrant==4) {
			recivedDegree = recivedDegree%270;
			recivedDegree = conversionPositiveDegree(recivedDegree);
		}
		
		double radian = convertToRadian(recivedDegree);
		
		
		int iterations = 20;
		double answer=0;
		int j=1;
		
		for(int i = 1 ; i <=iterations; i= i+2) {
			answer = answer + j*(raisePower(radian,i)/ (double) factorial(i));
			j = j*(-1);
		}	
		return answerFormat*answer;
	}
	
	public double cosFunctionDegree(double degree) {
		int answerFormat = 1;
		
		Map recivedMap = detectQuadrantDegree(degree);
		
		double recivedDegree = (double) recivedMap.get("Degree");
		int recivedQuadrant = (int) recivedMap.get("Quadrant");
		
		if(recivedQuadrant==2||recivedQuadrant==3) {
			answerFormat = -1;
		}
		
		if(recivedQuadrant==2) {
			recivedDegree = recivedDegree%90;
		}
		
		if(recivedQuadrant==3) {
			recivedDegree = recivedDegree%180;
		}
		
		if(recivedQuadrant==4) {
			recivedDegree = recivedDegree%270;
			recivedDegree = conversionPositiveDegree(recivedDegree);
		}
		
		double radian = convertToRadian(recivedDegree);
		
		int iterations = 20;
		double answer = 0;
		int j=1;
		
		for(int i = 0; i<= iterations; i=i+2) {
			answer = answer + j*(raisePower(radian,i)/ (double) factorial(i));
			j = j*(-1);
		}
		
		return answerFormat*answer;
	}
	
	public double tanFunctionDegree(double degree) {
		
		double answer = 0;
		
		int answerFormat = 1;
		
		if(degree == 180) {
		  answerFormat = -1;
		}
		
		if(degree == 90 ) {
			answer = Double.POSITIVE_INFINITY;
		} 
		else if (degree == 270) {
			answer = Double.NEGATIVE_INFINITY;
		}
		else{
			answer = sinFunctionDegree(degree)/cosFunctionDegree(degree);	
		}
		
		return answerFormat*answer;
	}
	
	public double factorial(double value){
		if(value%1 !=0) return  Double.NaN;
		if(value < 0) return  Double.NaN;
		if(value == 0) return 1;
		if(value == 1) return 1;
		return (factorial(value - 1) * value);
	}
	
	//raisePower
	public double raisePower(double value, double power) {
		double finalValue;
		if(power==0) {
			finalValue = 1;
		} else if(power%1 != 0){
//			int decimalPlacesCount = 0;
//			long Tens = 10 ;
//			String a = Double.toString(power);
//			String[] b = a.split(".");
//			decimalPlacesCount = b[1].length();
//			for(int i =1; i<decimalPlacesCount; i++ ) {
//				Tens = Tens*10;
//			}
//			power = power*Tens;
//			
//			finalValue = value;
//			
//			for(int i = 1; i<power; i++) {
//				finalValue = finalValue*value;
//			}
//			
//			return 0;
//			
			return Double.NaN;
		}
		else if(power > 0) {
			finalValue = value;
			for(int i =1; i< power; i++) {
				finalValue = finalValue*value;
			}
		}  else
		{
			finalValue = 1/value;
			double tempVal = 1/value;
			power = power*(-1);
			for(int i =1; i< power; i++) {
				finalValue = finalValue*tempVal;
			}
		}
		return finalValue;
	}
	
	public double convertToRadian(double value) {
		
		double radian;
		radian = value*(pi/180);
		return radian;
	}
	
	public double convertToDegree(double value) {
		double degree;
		degree = value*(180/pi);
		return degree;
	}
	
	public double conversionPositiveDegree(double value) {
		double check;
		check = 90 - value;
		return check;
	}
	
	public double conversionNegativeDegree(double value) {
		// -1 to -90 convert into 359 to 270
		double check;
		check = 360 + value;
		return check;
	}
	
	public Map detectQuadrantDegree(double deg) {
		Map finalValues = new HashMap();
		boolean notDetected = true;
		if(deg<0) {
			while(notDetected) {
				if(deg>=-90) {
					finalValues.put("Quadrant", 4);
					deg = conversionNegativeDegree(deg);
					finalValues.put("Degree", deg);
					notDetected = false;
				} else if(deg>= -180) {
					finalValues.put("Quadrant", 3);
					deg = conversionNegativeDegree(deg);
					finalValues.put("Degree", deg);
					notDetected = false;
				}else if(deg>=-270) {
					finalValues.put("Quadrant", 2);
					deg = conversionNegativeDegree(deg);
					finalValues.put("Degree", deg);
					notDetected = false;
				}else if(deg>=-360) {
					finalValues.put("Quadrant", 1);
					deg = conversionNegativeDegree(deg);
					finalValues.put("Degree", deg);
					notDetected = false;
				}else {
					deg = deg + 360;
				}
			}
		}else {
			while(notDetected) {
				if(deg<=90) {
					notDetected= false;
					finalValues.put("Quadrant", 1);
					finalValues.put("Degree", deg);
				}else if(deg<=180) {
					notDetected = false;
					finalValues.put("Quadrant", 2);
					finalValues.put("Degree", deg);
				}else if(deg <= 270) {
					notDetected = false;
					finalValues.put("Quadrant", 3);
					finalValues.put("Degree", deg);
				}else if(deg<=360) {
					notDetected = false;
					finalValues.put("Quadrant", 4);
					finalValues.put("Degree", deg);
				}else {
					deg = deg - 360;
				}
			}
		}
		return finalValues;
	}
	
	public static void main(String[] args) {
		TrignometryFunctions  tf = new TrignometryFunctions();
		double returnValue;
		returnValue = tf.raisePower(2,0);
		System.out.println(returnValue);
	}
}
