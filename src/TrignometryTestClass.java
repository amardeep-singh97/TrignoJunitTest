package trigno;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrignometryTestClass {

    private static final double pi = 3.141592653589793238462643383279;

    public static FileWriter fw ;
    public TrignometryFunctions tf = new TrignometryFunctions();

    @Test public void sinRadianQuadrantTesting() throws IOException{
        double returnVal;
        //first quadrant
        returnVal = tf.sinFunctionRadian((pi/2)-1);
        Assertions.assertTrue(returnVal<=1 && returnVal>=0);

        //Second quadrant
        returnVal = tf.sinFunctionRadian((pi/2)+1);
        Assertions.assertTrue(returnVal<=1 && returnVal>=0);

        //third quadrant
        returnVal = tf.sinFunctionRadian((pi)+1);
        Assertions.assertTrue(returnVal>= -1 && returnVal<=0);

        //fourth quadrant
        returnVal = tf.sinFunctionRadian(2*pi - 1);
        Assertions.assertTrue(returnVal>= - 1 && returnVal<=0);

        fw.write("Testing Sine Radiant Function For Quadrants is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void sinRadianValueTest() throws IOException {

        //Testing values, Sine gives same value at pi*0.25, pi*0.75, pi*1.25 and pi*1.75, just with different signs
        double firstVal = tf.sinFunctionRadian(pi*0.25);

        double secondVal = tf.sinFunctionRadian(pi*0.75);

        double thirdVal = tf.sinFunctionRadian(pi*1.25);

        double fourthVal = tf.sinFunctionRadian(pi*1.75);

        Assertions.assertTrue(firstVal == secondVal && thirdVal == fourthVal && firstVal == -1*thirdVal);

        fw.write("Testing Sine Radiant Function For same values in different quadrants is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void sinRadianRangeTest() throws IOException {

        fw.write("Testing Sine Radiant Function For for range Started "+System.lineSeparator());
        double returnVal;
        //Value of Sine never goes above 1 and below -1 in all quadrants
        for(int i = 0; i < (int) 2*pi+1;i++) {
            returnVal = tf.sinFunctionRadian(i);
            if(returnVal>1||returnVal<-1) {
                fw.write("Out of range Value: "+ returnVal +System.lineSeparator());
                Assertions.assertFalse(returnVal>1||returnVal<-1);
            }else {
                fw.write("In range Value at radiant " + i + " : "+ returnVal +System.lineSeparator());
                Assertions.assertTrue(returnVal<=1&&returnVal>=-1);
            }
        }


        fw.write("Testing Sine Radiant Function For range is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void checkSpecificValueSinRad() throws IOException {

        double firstVal = tf.sinFunctionRadian(0);
        Assertions.assertEquals(0,firstVal,0.00001);

        double secondVal = tf.sinFunctionRadian(pi/2);
        Assertions.assertEquals(1,secondVal,0.0001);

        double thirdVal = tf.sinFunctionRadian(pi);
        Assertions.assertEquals(0,thirdVal,0.00001);

        double fourthVal = tf.sinFunctionRadian(pi*1.5);
        Assertions.assertEquals(-1,fourthVal,0.0001);

        double fifthVal = tf.sinFunctionRadian(2*pi);
        Assertions.assertEquals(0,fifthVal,0.00001);

        fw.write("Testing Sine Radiant Function For values at 0, pi/2 , pi*1.5 and 2*pi is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void cosRadianQuadrantTesting() throws IOException{
        double returnVal;
        //first quadrant
        returnVal = tf.cosFunctionRadian(1);
        Assertions.assertTrue(returnVal<=1 && returnVal>=0);

        //Second quadrant
        returnVal = tf.cosFunctionRadian(pi-1);
        Assertions.assertTrue(returnVal>= -1 && returnVal<=0);

        //third quadrant
        returnVal = tf.cosFunctionRadian(pi+1);
        Assertions.assertTrue(returnVal>= -1 && returnVal<=0);

        //fourth quadrant
        returnVal = tf.cosFunctionRadian(2*pi - 1);
        Assertions.assertTrue(returnVal<=1 && returnVal>=0);

        fw.write("Testing CoSine Radiant Function For Quadrants is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void cosRadianValueTest() throws IOException {

        //Testing values, CoSine gives same value at pi*0.25, pi*0.75, pi*1.25 and pi*1.75, just with different signs
        double firstVal = tf.cosFunctionRadian(pi*0.25);

        double secondVal = tf.cosFunctionRadian(pi*0.75);

        double thirdVal = tf.cosFunctionRadian(pi*1.25);

        double fourthVal = tf.cosFunctionRadian(pi*1.75);

        Assertions.assertTrue(firstVal == fourthVal && thirdVal == secondVal && firstVal == -1*thirdVal);

        fw.write("Testing CoSine Radiant Function For same values in different Quadrants is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());

    }

    @Test public void cosRadianRangeTest() throws IOException {

        fw.write("Testing CoSine Radiant Function For Range Started"+System.lineSeparator());

        double returnVal;
        //Value of CoSine never goes above 1 and below -1 in all quadrants
        for(int i = 0; i < (int) 2*pi+1;i++) {
            returnVal = tf.cosFunctionRadian(i);
            if(returnVal>1||returnVal<-1) {
                fw.write("Out of range Value: "+ returnVal +System.lineSeparator());
                Assertions.assertFalse(returnVal>1||returnVal<-1);
            }else {
                fw.write("In range Value at radiant " + i + " : "+ returnVal +System.lineSeparator());
                Assertions.assertTrue(returnVal<=1&&returnVal>=-1);
            }
        }

        fw.write("Testing CoSine Radiant Function For Range is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void checkSpecificValueCosRad() throws IOException {
        double firstVal = tf.cosFunctionRadian(0);
        Assertions.assertEquals(1,firstVal,0.00001);

        double secondVal = tf.cosFunctionRadian(pi/2);
        Assertions.assertEquals(0,secondVal,0.00001);

        double thirdVal = tf.cosFunctionRadian(pi);
        Assertions.assertEquals(-1,thirdVal,0.00001);

        double fourthVal = tf.cosFunctionRadian(pi*1.5);
        Assertions.assertEquals(0,fourthVal,0.00001);

        double fifthVal = tf.cosFunctionRadian(2*pi);
        Assertions. assertEquals(1,fifthVal,0.00001);


        fw.write("Testing CoSine Radiant Function For values at 0, pi/2 , pi*1.5 and 2*pi is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void tanRadianQuadrantTesting() throws IOException {
        double returnVal;
        //first quadrant
        returnVal = tf.tanFunctionRadian(1);
        Assertions.assertTrue(returnVal>=0 && returnVal<= Double.POSITIVE_INFINITY);

        //Second quadrant
        returnVal = tf.tanFunctionRadian(pi-1);
        Assertions.assertTrue(returnVal<=0 && returnVal>= Double.NEGATIVE_INFINITY );

        //third quadrant
        returnVal = tf.tanFunctionRadian(pi+1);
        Assertions.assertTrue(returnVal>=0 && returnVal<= Double.POSITIVE_INFINITY);

        //fourth quadrant
        returnVal = tf.tanFunctionRadian(2*pi - 1);
        Assertions.assertTrue(returnVal<=0 && returnVal>= Double.NEGATIVE_INFINITY);


        fw.write("Testing Tangent Radiant Function For Quadrants is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());

    }

    @Test public void tanRadianValueTest() throws IOException {
        //Testing values, Tangent gives same value at pi*0.25, pi*0.75, pi*1.25 and pi*1.75, just with different signs
        double firstVal = tf.tanFunctionRadian(pi*0.25);

        double secondVal = tf.tanFunctionRadian(pi*0.75);

        double thirdVal = tf.tanFunctionRadian(pi*1.25);

        double fourthVal = tf.tanFunctionRadian(pi*1.75);

        Assertions.assertTrue(firstVal == thirdVal && secondVal == fourthVal && firstVal == -1*secondVal);


        fw.write("Testing Tangent Radiant Function For same value in different Quadrants is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void tanRadianRangeTest() throws IOException {
        double returnVal;
        fw.write("Testing Tangent Radiant Function For Range Started"+System.lineSeparator());
        fw.write(System.lineSeparator());
        //Value of Tangent can range from positive Infinity to negative Infinity in all quadrants
        for(int i = 0; i < (int) 2*pi+1;i++) {
            returnVal = tf.tanFunctionRadian(i);
            fw.write("In range Value at radiant " + i + " : "+ returnVal +System.lineSeparator());
            Assertions.assertTrue(returnVal <= Double.POSITIVE_INFINITY && returnVal>= Double.NEGATIVE_INFINITY );
        }

        fw.write("Testing Tangent Radiant Function For Range is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void checkSpecificValueTanRad() throws IOException {
        double firstVal = tf.tanFunctionRadian(0);
        Assertions.assertEquals(0,firstVal,0.1);

        double secondVal = tf.tanFunctionRadian(pi/2);
        Assertions.assertEquals(Double.POSITIVE_INFINITY,secondVal,0.1);

        double thirdVal = tf.tanFunctionRadian(pi);
        Assertions.assertEquals(0,thirdVal,0.1);

        double fourthVal = tf.tanFunctionRadian(pi*1.5);
        Assertions.assertEquals(Double.NEGATIVE_INFINITY,fourthVal,0.1);

        double fifthVal = tf.tanFunctionRadian(2*pi);
        Assertions.assertEquals(0,fifthVal,0.1);

        fw.write("Testing Tangent Radiant Function For values at 0, pi/2 , pi*1.5 and 2*pi is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void sinDegreeQuadrantTesting() throws IOException{
        double returnVal;
        //first quadrant
        returnVal = tf.sinFunctionDegree(70);
        Assertions.assertTrue(returnVal<=1 && returnVal>=0);

        //Second quadrant
        returnVal = tf.sinFunctionDegree(150);
        Assertions.assertTrue(returnVal<=1 && returnVal>=0);

        //third quadrant
        returnVal = tf.sinFunctionDegree(185);
        Assertions.assertTrue(returnVal>= -1 && returnVal<=0);

        //fourth quadrant
        returnVal = tf.sinFunctionDegree(350);
        Assertions.assertTrue(returnVal>= - 1 && returnVal<=0);

        fw.write("Testing Sine Degree Function For Quadrants is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());

    }

    @Test public void sinDegreeValueTest() throws IOException {

        //Testing values, Sine gives same value at pi*0.25, pi*0.75, pi*1.25 and pi*1.75, just with different signs
        double firstVal = tf.sinFunctionDegree(45);

        double secondVal = tf.sinFunctionDegree(135);

        double thirdVal = tf.sinFunctionDegree(225);

        double fourthVal = tf.sinFunctionDegree(315);

        Assertions.assertTrue(firstVal == secondVal && thirdVal == fourthVal && firstVal == -1*thirdVal);

        fw.write("Testing Sine Degree Function For same values in different quadrants is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void sinDegreeRangeTest() throws IOException {

        double returnVal;
        fw.write("Testing sine Degree function for range started "+System.lineSeparator());
        //Value of Sine never goes above 1 and below -1 in all quadrants
        for(int i = 0; i < 360;i++) {
            returnVal = tf.sinFunctionDegree(i);
            if(returnVal>1||returnVal<-1) {
                Assertions.assertFalse(returnVal>1||returnVal<-1);
            }else {
                fw.write("In range Value at Degree " + i + " : "+ returnVal +System.lineSeparator());
                Assertions.assertTrue(returnVal<=1&&returnVal>=-1);
            }
        }

        fw.write("Testing sine Degree function for range is Done "+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void checkSpecificValueSinDegree() throws IOException {

        //Checking sine's range's end values
        double firstVal = tf.sinFunctionDegree(0);
        Assertions. assertEquals(0,firstVal,0.0001);

        double secondVal = tf.sinFunctionDegree(90);
        Assertions.assertEquals(1,secondVal,0.0001);

        double thirdVal = tf.sinFunctionDegree(180);
        Assertions.assertEquals(0,thirdVal,0.0001);

        double fourthVal = tf.sinFunctionDegree(270);
        Assertions.assertEquals(-1,fourthVal,0.0001);

        double fifthVal = tf.sinFunctionDegree(360);
        Assertions.assertEquals(0,fifthVal,0.0001);

        fw.write("Testing Sine Degree Function For values at 0, pi/2 , pi*1.5 and 2*pi is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());

    }

    @Test public void cosDegreeQuadrantTesting() throws IOException {
        double returnVal;
        //first quadrant
        returnVal = tf.cosFunctionDegree(46);
        Assertions.assertTrue(returnVal<=1 && returnVal>=0);

        //Second quadrant
        returnVal = tf.cosFunctionDegree(92);
        Assertions.assertTrue(returnVal>= -1 && returnVal<=0);

        //third quadrant
        returnVal = tf.cosFunctionDegree(190);
        Assertions.assertTrue(returnVal>= -1 && returnVal<=0);

        //fourth quadrant
        returnVal = tf.cosFunctionDegree(275);
        Assertions.assertTrue(returnVal<=1 && returnVal>=0);

        fw.write("Testing CoSine Degree Function For Quadrants is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());

    }

    @Test public void cosDegreeValueTest() throws IOException {

        //Testing values, CoSine gives same value at pi*0.25, pi*0.75, pi*1.25 and pi*1.75, just with different signs
        double firstVal = tf.cosFunctionDegree(45);

        double secondVal = tf.cosFunctionDegree(135);

        double thirdVal = tf.cosFunctionDegree(225);

        double fourthVal = tf.cosFunctionDegree(315);

        Assertions.assertTrue(firstVal == fourthVal && thirdVal == secondVal && firstVal == -1*thirdVal);

        fw.write("Testing CoSine Radiant Function For same values in different quadrants is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());

    }

    @Test public void cosDegreeRangeTest() throws IOException {
        fw.write("Testing CoSine Degree function for range started "+System.lineSeparator());
        double returnVal;
        //Value of CoSine never goes above 1 and below -1 in all quadrants
        for(int i = 0; i < 360;i++) {
            returnVal = tf.cosFunctionDegree(i);
            if(returnVal>1||returnVal<-1) {
                Assertions.assertFalse(returnVal>1||returnVal<-1);
            }else {
                fw.write("In range Value at Degree " + i + " : "+ returnVal +System.lineSeparator());
                Assertions.assertTrue(returnVal<=1&&returnVal>=-1);
            }
        }

        fw.write("Testing Cosine Degree function for range is Done "+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void checkSpecificValueCosDegree() throws IOException {

        //checking range's end values
        double firstVal = tf.cosFunctionDegree(0);
        Assertions.assertEquals(1,firstVal,0.0001);

        double secondVal = tf.cosFunctionDegree(90);
        Assertions.assertEquals(0,secondVal,0.0001);

        double thirdVal = tf.cosFunctionDegree(180);
        Assertions.assertEquals(-1,thirdVal,0.0001);

        double fourthVal = tf.cosFunctionDegree(270);
        Assertions.assertEquals(0,fourthVal,0.0001);

        double fifthVal =tf.cosFunctionDegree(360);
        Assertions.assertEquals(1,fifthVal,0.0001);

        fw.write("Testing CoSine Degree Function For values at 0, pi/2 , pi*1.5 and 2*pi is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());

    }

    @Test public void tanDegreeQuadrantTesting() throws IOException {
        double returnVal;
        //first quadrant
        returnVal = tf.tanFunctionDegree(36);
        Assertions.assertTrue(returnVal>=0 && returnVal<= Double.POSITIVE_INFINITY);

        //Second quadrant
        returnVal = tf.tanFunctionDegree(100);
        Assertions.assertTrue(returnVal<=0 && returnVal>= Double.NEGATIVE_INFINITY );

        //third quadrant
        returnVal = tf.tanFunctionDegree(190);
        Assertions.assertTrue(returnVal>=0 && returnVal<= Double.POSITIVE_INFINITY);

        //fourth quadrant
        returnVal = tf.tanFunctionDegree(300);
        Assertions.assertTrue(returnVal<=0 && returnVal>= Double.NEGATIVE_INFINITY);

        fw.write("Testing Tangent Degree Function For Quadrants is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());

    }

    @Test public void tanDegreeValueTest() throws IOException {
        //Testing values, Tangent gives same value at pi*0.25, pi*0.75, pi*1.25 and pi*1.75, just with different signs
        double firstVal = tf.tanFunctionDegree(45);

        double secondVal = tf.tanFunctionDegree(135);

        double thirdVal = tf.tanFunctionDegree(225);

        double fourthVal =tf.tanFunctionDegree(315);

        Assertions.assertTrue(firstVal == thirdVal && secondVal == fourthVal && firstVal == -1*secondVal);

        fw.write("Testing Tangent Radiant Function For same values in different quadrants is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void tanDegreeRangeTest() throws IOException {
        double returnVal;
        fw.write("Testing Tangent Degree function for range started "+System.lineSeparator());
        //Value of Tangent can range from positive Infinity to negative Infinity in all quadrants
        for(int i = 0; i < 360;i++) {
            returnVal = tf.tanFunctionDegree(i);
            fw.write("In range Value at Degree " + i + " : "+ returnVal +System.lineSeparator());
            Assertions.assertTrue(returnVal <= Double.POSITIVE_INFINITY && returnVal>= Double.NEGATIVE_INFINITY );
        }

        fw.write("Testing sine Degree function for range is Done "+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void checkSpecificValueTanDegree() throws IOException {
        double firstVal = tf.tanFunctionDegree(0);
        Assertions.assertEquals(0,firstVal,0.0001);

        double secondVal = tf.tanFunctionDegree(90);
        Assertions.assertEquals(Double.POSITIVE_INFINITY,secondVal,0.0001);

        double thirdVal = tf.tanFunctionDegree(180);
        Assertions.assertEquals(0,thirdVal,0.0001);

        double fourthVal = tf.tanFunctionDegree(270);
        Assertions.assertEquals(Double.NEGATIVE_INFINITY,fourthVal,0.0001);

        double fifthVal = tf.tanFunctionDegree(360);
        Assertions.assertEquals(0,fifthVal,0.0001);

        fw.write("Testing Tangent Degree Function For values at 0, pi/2 , pi*1.5 and 2*pi is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void negativeDegreeTest() throws IOException {
        double firstVal;
        double secondVal;

        firstVal = tf.sinFunctionDegree(350);
        secondVal = tf.sinFunctionDegree(-10);
        Assertions.assertEquals(firstVal,secondVal,0);

        firstVal = tf.cosFunctionDegree(350);
        secondVal = tf.cosFunctionDegree(-10);
        Assertions.assertEquals(firstVal,secondVal,0);

        firstVal = tf.tanFunctionDegree(350);
        secondVal = tf.tanFunctionDegree(-10);
        Assertions.assertEquals(firstVal,secondVal,0);
        fw.write("Testing For insertion of neagive Degree for all degree Functions is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());

    }

    @Test public void negativeRadianTest() throws IOException {
        double firstVal;
        double secondVal;

        firstVal = tf.sinFunctionRadian(2*pi-1);
        secondVal = tf.sinFunctionRadian(-1);
        Assertions.assertEquals(firstVal,secondVal,0);

        firstVal = tf.cosFunctionRadian(2*pi-1);
        secondVal = tf.cosFunctionRadian(-1);
        Assertions.assertEquals(firstVal,secondVal,0);

        firstVal = tf.tanFunctionRadian(2*pi-1);
        secondVal = tf.tanFunctionRadian(-1);
        Assertions.assertEquals(firstVal,secondVal,0);

        fw.write("Testing For insertion of neagive Radiant for all Radiant Functions is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void decimalDegreeTest() throws IOException {
        double returnVal;

        returnVal = tf.tanFunctionDegree(40.565415);
        Assertions.assertNotNull(returnVal);

        returnVal = tf.sinFunctionDegree(53.659644);
        Assertions.assertNotNull(returnVal);

        returnVal = tf.cosFunctionDegree(36.785434);
        Assertions.assertNotNull(returnVal);

        fw.write("Testing For Decimal Degree is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void decimalRadianTest() throws IOException {
        double returnVal;

        returnVal = tf.tanFunctionRadian(1.225);
        Assertions.assertNotNull(returnVal);

        returnVal = tf.sinFunctionRadian(2.6545);
        Assertions.assertNotNull(returnVal);

        returnVal = tf.cosFunctionRadian(4.56513);
        Assertions.assertNotNull(returnVal);

        fw.write("Testing For Decimal Radiant is Done"+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void testFactorial() throws IOException {
        fw.write("Testing For Factorial function is Starting...."+System.lineSeparator());
        //check factorial on natural numbers
        double returnVal;

        returnVal = tf.factorial(-25);
        fw.write("On giving Negative value Factorial function gives: "+returnVal+System.lineSeparator());
        Assertions.assertEquals(Double.NaN,returnVal,0);

        returnVal = tf.factorial(32.4);
        fw.write("On giving Decimal value Factorial function gives: "+returnVal+System.lineSeparator());
        Assertions.assertEquals(Double.NaN,returnVal,0);

        returnVal = tf.factorial(0);
        fw.write("On giving Zero to Factorial function gives: "+returnVal+System.lineSeparator());
        Assertions.assertEquals(1,returnVal,0);

        returnVal = tf.factorial(1);
        fw.write("On giving 1 to Factorial function gives: "+returnVal+System.lineSeparator());
        Assertions.assertEquals(1,returnVal,0);

        returnVal = tf.factorial(4);
        fw.write("On giving Four to Factorial function gives: "+returnVal+System.lineSeparator());
        Assertions.assertEquals(24,returnVal,0);

        fw.write("Testing For Factorial function is Done."+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void raisePowerFunctionTest() throws IOException {
        fw.write("Testing For RaisePower function is Starting...."+System.lineSeparator());
        double returnVal;

        returnVal = tf.raisePower(-2,3);
        fw.write("On giving -2 as value and 3 as power to raisePower function gives: "+returnVal+System.lineSeparator());
        Assertions.assertTrue(returnVal==(-8));

        returnVal = tf.raisePower(2,3);
        fw.write("On giving 2 as value and 3 as power to raisePower function gives: "+returnVal+System.lineSeparator());
        Assertions.assertTrue(returnVal==(8));

        returnVal = tf.raisePower(27,0.3);
        fw.write("On giving 27 as value and 0.3 power to raisePower function gives: "+returnVal+System.lineSeparator());
        Assertions.assertEquals(Double.NaN,returnVal,0);

        returnVal = tf.raisePower(2,-2);
        fw.write("On giving 2 as value and -2 as power to raisePower function gives: "+returnVal+System.lineSeparator());
        Assertions.assertTrue(returnVal==(0.25));

        returnVal = tf.raisePower(-2,0);
        fw.write("On giving -2 as value and zero as power to raisePower function gives: "+returnVal+System.lineSeparator());
        Assertions.assertTrue(returnVal==(1.0));

        fw.write("Testing For Factorial function is Done."+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void detectQuadrantDegreeTest() throws IOException {
        fw.write("Testing For detectQuadrantDegree function is Starting...."+System.lineSeparator());
        Map returnVal;

        returnVal = tf.detectQuadrantDegree(50);
        fw.write("On giving 50 degrees to detectQuadrantDegree function gives: Quadrant: "+(int) returnVal.get("Quadrant")+", "+"and Degree: "+(double) returnVal.get("Degree")+System.lineSeparator());
        Assertions.assertEquals(1,(int) returnVal.get("Quadrant"),0);
        Assertions.assertEquals(50,(double) returnVal.get("Degree"),0);

        returnVal = tf.detectQuadrantDegree(370);
        fw.write("On giving 370 degrees to detectQuadrantDegree function gives: Quadrant: "+(int) returnVal.get("Quadrant")+", "+"and Degree: "+(double) returnVal.get("Degree")+System.lineSeparator());
        Assertions.assertEquals(1,(int) returnVal.get("Quadrant"),0);
        Assertions.assertEquals(10,(double) returnVal.get("Degree"),0);

        returnVal = tf.detectQuadrantDegree(471);
        fw.write("On giving 471 degrees to detectQuadrantDegree function gives: Quadrant: "+(int) returnVal.get("Quadrant")+", "+"and Degree: "+(double) returnVal.get("Degree")+System.lineSeparator());
        Assertions.assertEquals(2,(int) returnVal.get("Quadrant"),0);
        Assertions.assertEquals(111,(double) returnVal.get("Degree"),0);

        returnVal = tf.detectQuadrantDegree(-50);
        fw.write("On giving -50 degrees to detectQuadrantDegree function gives: Quadrant: "+(int) returnVal.get("Quadrant")+", "+"and Degree: "+(double) returnVal.get("Degree")+System.lineSeparator());
        Assertions.assertEquals(4,(int) returnVal.get("Quadrant"),0);
        Assertions.assertEquals(310,(double) returnVal.get("Degree"),0);

        fw.write("Testing For detectQuadrantDegree function is Done."+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void convertToRadianTest() throws IOException {
        fw.write("Testing For convertToRadian function is Starting...."+System.lineSeparator());
        double returnVal;

        returnVal = tf.convertToRadian(30);
        fw.write("On giving 30 degree to convertToRadian function gives: "+returnVal +System.lineSeparator());
        Assertions.assertEquals(0.523599,returnVal,0.001);


        returnVal = tf.convertToRadian(-30);
        fw.write("On giving -30 degree to convertToRadian function gives: "+returnVal +System.lineSeparator());
        Assertions.assertEquals(-0.523599,returnVal,0.001);


        returnVal = tf.convertToRadian(40.5);
        fw.write("On giving 40.5 degree to convertToRadian function gives: "+returnVal +System.lineSeparator());
        Assertions.assertEquals(0.7068583,returnVal,0.001);

        fw.write("Testing For convertToRadian function is Done."+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void convertToDegreeTest() throws IOException {

        fw.write("Testing For convertToDegree function is Starting...."+System.lineSeparator());
        double returnVal;

        returnVal = tf.convertToDegree(30);
        fw.write("On giving 30 degree to convertToRadian function gives: "+returnVal +System.lineSeparator());
        Assertions.assertEquals(1718.8733853924696,returnVal,0);


        returnVal = tf.convertToDegree(-30);
        fw.write("On giving -30 degree to convertToRadian function gives: "+returnVal +System.lineSeparator());
        Assertions.assertEquals(-1718.8733853924696,returnVal,0);


        returnVal = tf.convertToDegree(40.5);
        fw.write("On giving 40.5 degree to convertToRadian function gives: "+returnVal +System.lineSeparator());
        Assertions.assertEquals(2320.479070279834,returnVal,0);

        fw.write("Testing For convertToRadian function is Done."+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void conversionDegreeTest() throws IOException {
        fw.write("Testing For conversionPositiveDegree function is Starting...."+System.lineSeparator());
        double returnVal;

        returnVal = tf.conversionPositiveDegree(80);
        fw.write("On giving 80 degree: "+returnVal+System.lineSeparator());
        Assertions.assertEquals(10,returnVal,0);

        returnVal = tf.conversionPositiveDegree(75.5);
        fw.write("On giving 75.5 degree: "+returnVal+System.lineSeparator());
        Assertions.assertEquals(14.5,returnVal,0);


        fw.write("Testing For coversionPositiveDegree function is Done."+System.lineSeparator());
        fw.write(System.lineSeparator());
    }

    @Test public void conversionNegativeDegree() throws IOException {
        fw.write("Testing For conversionNegativeDegree function is Starting...."+System.lineSeparator());
        System.out.println(System.lineSeparator());
        double returnVal;
        fw.write("This method is used to convert negative degree into positive degree."+System.lineSeparator());
        returnVal = tf.conversionNegativeDegree(-70);
        fw.write("On giving -70 degree: "+returnVal+System.lineSeparator());
        Assertions.assertEquals(290,returnVal,0);

        returnVal = tf.conversionNegativeDegree(-155.5);
        fw.write("On giving -155.5 degree: "+returnVal+System.lineSeparator());
        Assertions.assertEquals(204.5,returnVal,0);

        fw.write("Testing For coversionNegativeDegree function is Done."+System.lineSeparator());
        fw.write(System.lineSeparator());

    }
}