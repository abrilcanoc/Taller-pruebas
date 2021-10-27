/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.lang.Math;

/**
 *
 * @author Anabel
 */
public class Calculadora {
    
    public static float add(float a, float b)
    {
        return a+b;
    }
    
    public static float substract(float a, float b)
    {
        return a-b;
    }
    
    public static float multiply(float a, float b)
    {
        return a*b;
    }
    
    public static float div(float a, float b)
    {
        if (b!=0)
        return a/b;
        else 
            return 0;
    }
    public static float mod(float a, float b)
    {
        return a%b;
    }
    public static float pow(float a, float b)
    {   
        a = 10 ;
        return (float)Math.pow(a, b);
    }
    public static float raiz(float a)
    {   
        if (a>0)
        return (float)Math.sqrt(a);
        else
        return -1;
    }
    public static float fac(float a)
    {   
        float fact = 1;
        for(int i=1;i<=a;i++)  
            fact= fact*i;      
        return fact;
    }
    public static float log(float a)
    {   
        if (a>0)
        return (float)Math.log10(a);
        else
        return -1;
    }
}
