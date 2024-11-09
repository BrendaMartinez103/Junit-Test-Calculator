public class Calculator {
    public int addition(int x, int y){
        return x + y;
    }
    public int subtraction(int x, int y){
        return x - y;
    }
    public int divide(int x, int y){
        if(y==0)
            return 0;
        else
            return x / y;
    }

    public int multiply(int x, int y){
        return x * y;
    }
    public boolean esPar(int x){
        return x%2==0;
    }
    public int modulo(int x, int y) {
        return x % y;
    }
    public int potencia(int x, int y) {
        int result = 1;
        for(int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
    public int absolute(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }
    public boolean XmayorIgualaY(int x, int y) {
        return x >= y;
    }
    public boolean esPrimo(int x) {
        if (x <= 1)
            return false;
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
    public double convertirCmAMetros(double cm) {
        return cm / 100.0;
    }
}
