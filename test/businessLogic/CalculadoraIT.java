/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anabel
 */
public class CalculadoraIT {
    
    public CalculadoraIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculadora.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        float a = 3F;
        float b = 5F;
        float expResult = 8F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void testSubstract() {
        System.out.println("Substract");
        float a = 10F;
        float b = 5F;
        float expResult = 5F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void testMultiply() {
        System.out.println("Multiply");
        float a = 7F;
        float b = 2F;
        float expResult = 14F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDiv() {
        System.out.println("Divide");
        float a = 20F;
        float b = 5F;
        float expResult = 4F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    //--------------------------------------------
    @Test
    public void testMod() {
        System.out.println("Module");
        float a = 22F;
        float b = 5F;
        float expResult = 2;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testPow() {
        System.out.println("Power");
        float a = 10F;
        float b = 3;
        float expResult = 1000;
        float result = Calculadora.pow(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testRaiz() {
        System.out.println("Root");
        float a = 9;
        float expResult = 3;
        float result = Calculadora.raiz(a);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testFac() {
        System.out.println("Factorial");
        float a = 4;
        float expResult = 24;
        float result = Calculadora.fac(a);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testLog() {
        System.out.println("Logarithm");
        float a = 100;
        float expResult = 2;
        float result = Calculadora.log(a);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddNegatives() {
        System.out.println("Sumar dos negativos");
        float a = -2;
        float b = -3;
        float expResult = -5;
        float result = Calculadora.add(a,b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddANegative() {
        System.out.println("Sumar a negativo");
        float a = -2;
        float b = 3;
        float expResult = 1;
        float result = Calculadora.add(a,b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testAddBNegative() {
        System.out.println("Sumar a negativo");
        float a = 2;
        float b = -3;
        float expResult = -1;
        float result = Calculadora.add(a,b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testDivPorCero() {
        System.out.println("Div Por Cero ");
        float a = 20F;
        float b = 0;
        float expResult = 0;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testRaizNegativo() {
        System.out.println("Raiz Negativo");
        float a = -9;
        float expResult = -1;
        float result = Calculadora.raiz(a);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testRaizCero() {
        System.out.println("Raiz Cero");
        float a = 0;
        float expResult = 0;
        float result = Calculadora.raiz(a);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testModNegativos() {
        System.out.println("Modulo con dos negativos");
        float a = -12;
        float b = -7;
        float expResult = -5;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testModaNegativo() {
        System.out.println("Modulo con un negativo");
        float a = -19;//-
        float b = 8;
        float expResult = 5;
        float result = Calculadora.mod(a, b);//-
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testModbNegativo() {
        System.out.println("Modulo con un negativo");
        float a = 19;//-
        float b = -8;
        float expResult = -5;
        float result = Calculadora.mod(a, b);//-
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testModCero() {
        System.out.println("Modulo con un negativo");
        float a = 10;
        float b = 5;
        float expResult = 0;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    
//-------------------------------------
    @Test
    public void testLogByZero(){
        System.out.println("Logaritmo de 0");
        float a = 0;
        float expResult = -1;
        float result = Calculadora.log(a);
        assertEquals(expResult,result,0.0);
    }
    
    @Test
    public void testLogByNegative(){
        System.out.println("Logaritmo de un numero negativo");
        float a = -1;
        float expResult = -1;
        float result = Calculadora.log(a);
        assertEquals(expResult,result,0.0);
    }
    
    
    @Test
    public  void testMultiplyByZero(){
        System.out.println("Multiplicar por cero");
        float a = 5F;
        float b = 0F;
        float expResult = 0F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result,0.0);
    }   
    
    @Test
    public  void testFacByZero(){
        System.out.println("Factorial de cero");
        float a = 0F;
        float expResult = 1F;
        float result = Calculadora.fac(a);
        assertEquals(expResult, result,0.0);                
    }
    
    @Test
    public  void testFactByNegative(){
        System.out.println("Factorial de un negativo");
        float a = -1.0F;
        float expResult = 1F;
        float result = Calculadora.fac(a);
        assertEquals(expResult, result,0.0);                
    }
    
    @Test
    public  void testDivByNegative(){
        System.out.println("Dividir por un negativo");
        float a = 5F;
        float b = -5F;
        float expResult = -1;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result,0.0);        
    }    

    @Test
    public  void testMultiplyByDecimal(){
        System.out.println("Multiplicar por un decimal");
        float a=5;
        float b=0.5F;
        float expResult = 2.5F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result,0.0);
    }    
    
    @Test
    public  void testMultiplyByNegativeDecimal(){
        System.out.println("Multiplicar por un decimal negativo");
        float a=5;
        float b=-0.5F;
        float expResult = -2.5F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result,0.0);
    }    

    
    @Test
    public  void testDivideByDecimal(){
        System.out.println("Dividir por un decimal");
        float a=5;
        float b=0.5F;
        float expResult = 10;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result,0.0);
    }
    
    
    @Test
    public  void testDivideByNegativeDecimal(){
        System.out.println("Dividir por un decimal negativo");
        float a = 5;
        float b = -0.5F;
        float expResult = -10;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result,0.0);
    }
    
    @Test
    public  void testLogByDecimal(){
        System.out.println("Logaritmo de un decimal");
        float a = 0.5F;
        float expResult = (float) Math.log10(a);
        float result = Calculadora.log(a);
        assertEquals(expResult, result,0.0);
    }

    @Test
    public  void testLogByDecimalNegative(){
        System.out.println("Logaritmo de un decimal negativo");
        float a = -0.5F;
        float expResult = -1;
        float result = Calculadora.log(a);
        assertEquals(expResult, result,0.0);
    }


    @Test
    public  void testAddDecimal(){
        System.out.println("Sumar un decimal a un entero");
        float a = 0.5F;
        float b = 5;
        float expResult = 5.5F;        
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result,0.0);
    }
            
    @Test
    public  void testAddDecimalNegative(){
        System.out.println("Sumar un decimal a un entero negativo");
        float a = -0.5F;
        float b = 5;
        float expResult = 4.5F;        
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result,0.0);
    }    


    @Test
    public  void testDivNegativeByNegative(){
        System.out.println("Dividir un negativo por un negativo");
        float a = -5;
        float b = -5;
        float expResult = 1;        
        float result = Calculadora.div(a, b);        
        assertEquals(expResult, result,0.0);
    }    
    
    @Test
    public  void testMultytNegativeByNegative(){
        System.out.println("Multiplicar un negativo con un negativo");
        float a = -5;
        float b = -5;
        float expResult = 25;        
        float result = Calculadora.multiply(a, b);        
        assertEquals(expResult, result,0.0);
    }       
     //_______________________________________________________
    @Test
    public void testLogByOne(){
        System.out.println("Logaritmo de 1");
        float a = 1;
        float expResult = 0;
        float result = Calculadora.log(a);
        assertEquals(expResult,result,0.0);
    }
    @Test
    public  void testMultytOne(){
        System.out.println("Multiplicar por 1");
        float a = 4;
        float b = 1;
        float expResult = 4;        
        float result = Calculadora.multiply(a, b);        
        assertEquals(expResult, result,0.0);
    }
    @Test
    public  void testFacByOne(){
        System.out.println("Factorial de uno");
        float a = 1F;
        float expResult = 1F;
        float result = Calculadora.fac(a);
        assertEquals(expResult, result,0.0);                
    }
    @Test
    public  void testFacByNumber(){
        System.out.println("Factorial de un numero");
        float a = 8F;
        float expResult = 40320F;
        float result = Calculadora.fac(a);
        assertEquals(expResult, result,0.0);                
    }
    @Test
    public  void testDivideByOne(){
        System.out.println("Dividir por un uno");
        float a=5;
        float b=1F;
        float expResult = 5;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result,0.0);
    }
    @Test
    public  void testDivideByMinusOne(){
        System.out.println("Dividir por menos uno");
        float a=5;
        float b=-1F;
        float expResult = -5;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result,0.0);
    }
    @Test
    public  void testAddZero(){
        System.out.println("Sumar 0 a 48");
        float a = 48;
        float b = 0;
        float expResult = 48F;        
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result,0.0);
    }
    @Test
    public void testPowNegativeNumber() {
        System.out.println("Potencia n??mero negativo");
        float a = 10F;
        float b = -3;
        float expResult = 0.001F;
        float result = Calculadora.pow(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testlPowDecimal() {
        System.out.println("Potencia de un decimal");
        float a = 10F;
        float b = 0.5F;
        float expResult = 3.1622777F;
        float result = Calculadora.pow(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testlPowNegativeDecimal() {
        System.out.println("Potencia de un decimal negativo");
        float a = 10F;
        float b = -0.5F;
        float expResult = 0.31622776F;
        float result = Calculadora.pow(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testlPowOne() {
        System.out.println("Potencia de 1");
        float a = 10F;
        float b = 1F;
        float expResult = 10F;
        float result = Calculadora.pow(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    public void testlPowZero() {
        System.out.println("Potencia de 0");
        float a = 10F;
        float b = 0F;
        float expResult = 1F;
        float result = Calculadora.pow(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testRaizDecimal() {
        System.out.println("Raiz de un decimal positivo");
        float a = 0.8F;
        float expResult = 0.8944272F;
        float result = Calculadora.raiz(a);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testRaizNehativeDecimal() {
        System.out.println("Raiz de un decimal negativo");
        float a = -0.8F;
        float expResult = -1;
        float result = Calculadora.raiz(a);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testModDecimal() {
        System.out.println("Modulo con un decimal");
        float a = 10F;//-
        float b = 0.5F;
        float expResult = 0F;
        float result = Calculadora.mod(a, b);//-
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testModTwoDecimals() {
        System.out.println("Modulo con dos decimales");
        float a = 0.7F;
        float b = 0.3F;
        float expResult = 0.099999964F;
        float result = Calculadora.mod(a, b);//-
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testModOne() {
        System.out.println("Modulo con 1");
        float a = 10F;
        float b = 1F;
        float expResult = 0F;
        float result = Calculadora.mod(a, b);//-
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testModZero() {
        System.out.println("Modulo A entero B 0");
        float a = 10F;
        float b = 0F;
        float expResult = -1;
        float result = Calculadora.mod(a, b);//-
        if(Float.isNaN(result)) result=-1;
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractZero() {
        System.out.println("Restar 0");
        float a = 15;
        float b = 0F;
        float expResult = 15F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractA() {
        System.out.println("Restar A positvo B Negativo ");
        float a = 10;
        float b = -10F;
        float expResult = 20F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractB() {
        System.out.println("Restar A Negativo B Positivo ");
        float a = -10F;
        float b = 10F;
        float expResult = -20F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractC() {
        System.out.println("Restar dos enteros negativos ");
        float a = -10F;
        float b = -10F;
        float expResult = 0;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testSubstractD() {
        System.out.println("Restar A entero B decimal ");
        float a = 10F;
        float b = 0.5F;
        float expResult = 9.5F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
    /*
    
    
    @Test
    public  void test(){
        System.out.println("");
        assertEquals(expResult, result,0.0);
    }
    
    
    */
    
    
    
    
}
