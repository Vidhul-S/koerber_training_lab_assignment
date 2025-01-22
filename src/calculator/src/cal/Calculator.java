package calculator.src.cal;

import calculator.src.subClasses.Add;
import calculator.src.subClasses.Div;
import calculator.src.subClasses.Mul;
import calculator.src.subClasses.Sub;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public int getadd(int a,int b){
        return Add.add(a,b);
    }
    public int getsub(int a,int b){
        return Sub.sub(a,b);
    }
    public int getmul(int a,int b){
        return Mul.mul(a,b);
    }
    public int getdiv(int a,int b){
        return Div.div(a,b);
    }
    public static void main(){
        Div.someInternalMethod();
    }
}