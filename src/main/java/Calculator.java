public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNumber1(){
        return this.num1;
    }

    public int getNumber2(){
        return this.num2;
    }

    public void setNumber1(int newNum){
        this.num1 = newNum;
    }

    public void setNumber2(int newNum){
        this.num2 = newNum;
    }

    public int addNumbers(){
        return (num1 + num2);
    }
    public int subtractNumbers(){
        return num1 - num2;
    }

    public int multiplyNumbers(){
        return num1 * num2;
    }

    public double divideNumbers(){
        double num1 = (double) this.num1;
        double num2 = (double) this.num2;

        return num1/num2;
    }

}
