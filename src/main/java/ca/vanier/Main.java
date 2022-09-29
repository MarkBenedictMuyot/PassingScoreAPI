package ca.vanier;

class Main {
    public static void main(String[] args) {
        var operator="";
      
        var num1=Integer.parseInt(args[0]);
        var num2=Integer.parseInt(args[1]);
        operator=args[2];
       
       

        var cal=new Calculator();
        var result=cal.calculate(num1, num2, operator);
        System.out.println(result);
        
        

    }
}
