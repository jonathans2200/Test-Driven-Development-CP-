package ec.edu.ups.calculator;

public class Calculator {

    private int ans;

   
    public int substraction(int i, int j) {
        return i - j;
    }

    public int division(int i, int j) {
        return i / j;
    }

    public int multiplication(int i, int j) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        return i * j;
    }


    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public int addition(int a, int b) {
        return a + b;

    }


}
