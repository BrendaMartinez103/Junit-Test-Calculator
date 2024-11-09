import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    private final Calculator calculator= new Calculator();
    @Test
    public void additionTest(){
        int result= calculator.addition(3,2);
        assertEquals(5,result);
    }
    @Test
    public void additionWithNegativeNumber(){
        int result= calculator.addition(-3,2);
        assertEquals(-1,result);
    }
    @Test
    public void subtractionTest(){
        int result= calculator.subtraction(3,2);
        assertEquals(1,result);
    }
    @Test
    public void divideTestWithDifferentThan0(){
        int result= calculator.divide(6,3);
        assertEquals(2,result);
    }
    @Test
    public void divideTestWithEquals0(){
        int result= calculator.divide(6,0);
        assertEquals(0,result);
    }
    @Test
    public void multiplyTest(){
        int result= calculator.multiply(2,3);
        assertEquals(6,result);
    }
    @Test
    public void esParTest(){
        boolean result= calculator.esPar(4);
        assertTrue(result);
    }
    @Test
    public void esParConNumeroImparTest (){
        boolean result= calculator.esPar(3);
        assertFalse(result);
    }
    @Test
    public void moduloTest(){
        int result= calculator.modulo(5,2);
        assertEquals(1,result);
    }
    @Test
    public void potenciaTest(){
        int result= calculator.potencia(2,3);
        assertEquals(8,result);
    }
    @Test
    public void potenciaTestV2(){
        int result= calculator.potencia(2,0);
        assertEquals(1,result);
    }
    @Test
    public void AbsoluteWithNegativeTest(){
        int result= calculator.absolute(-3);
        assertEquals(3,result);
    }
    @Test
    public void AbsoluteWithPositiveTest(){
        int result= calculator.absolute(3);
        assertEquals(3,result);
    }
    @Test
    public void xmayorIgualAYTruetest(){
        boolean result= calculator.XmayorIgualaY(9,8);
        assertTrue(result);
    }
    @Test
    public void xmayorIgualAYFalsetest(){
        boolean result= calculator.XmayorIgualaY(7,8);
        assertFalse(result);
    }
    @Test
    public void esPrimoNegativeTest(){
        boolean result= calculator.esPrimo(-5);
        assertFalse(result);
    }
    @Test
    public void esPrimoONETest(){
        boolean result= calculator.esPrimo(1);
        assertFalse(result);
    }
    @Test
    public void esPrimoTrueTest(){
        boolean result= calculator.esPrimo(2);
        assertTrue(result);
    }
    @Test
    public void esPrimoTrueTest2(){
        boolean result= calculator.esPrimo(7);
        assertTrue(result);
    }
    @Test
    public void esPrimoFalseTest(){
        boolean result= calculator.esPrimo(24);
        assertFalse(result);
    }
    @Test
    public void convertirAmetrosTest(){
        double result= calculator.convertirCmAMetros(150);
        assertEquals(1.50,result);
    }
    @Test
    public void convertirAmetrosTestV2(){
        double result= calculator.convertirCmAMetros(15);
        assertEquals(0.15,result);
    }

}
