public class obj {
    public static void main(String[] args){
        Calculator calc= new Calculator();
        int num=10;
        int num2=4;
        int res = calc.calculator(num,num2,6);
        System.out.println(res);
    }
}

class Calculator{
    public  int calculator(int a,int b){
        return a+b;
    }
    public  int calculator(int a,int b,int c){
        return a+b+c;
    }
}