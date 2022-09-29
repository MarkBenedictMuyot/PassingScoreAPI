package ca.vanier;

 class Calculator {
    int calculate(int a, int b, String operator){
		int result=0;
    switch (operator) {
		
		case "add": result= a+b;break;
		case "minus":result= a-b;break;
		case "multiply":result= a*b;break;
		case "divide":result= a/b;break;
		default: System.out.print("Operator not recognized!");
    }
	return result;

} 
}
