package com.kctech.dayone;

public class ControlStatementsMo {

public void ifelseLoop() {
	int marks=75;  
    if(marks<50){
System.out.println("fail");  
    }  
    else if(marks>=50 && marks<60){
System.out.println("D grade");  
    }  
    else if(marks>=60 && marks<70){
System.out.println("C grade");  
    }  
    else if(marks>=70 && marks<80){
System.out.println("B grade");  
    }  
    else if(marks>=80 && marks<90){
System.out.println("A grade");  
}else if(marks>=90 && marks<100){  
System.out.println("A+ grade");  
}else{  
System.out.println("Invalid!");  
    }  
}  

public void forLoop() {
	int n, i;
	n=2;
	for(i=1;i<=10;i++)
	{  
		System.out.println(n+"*"+i+"="+n*i);  
	}  
}

public void switchLoop() {
	int day = 3; 
    String dayName; 
    switch (day) { 
    case 1: 
dayName = "Today is Monday"; 
        break; 
    case 2: 
dayName = "Today is Tuesday"; 
        break; 
    case 3: 
dayName = "Today is Wednesday"; 
        break; 
    case 4: 
dayName = "Today is Thursday"; 
        break; 
    case 5: 
dayName = "Today is Friday"; 
        break; 
    case 6: 
dayName = "Today is Saturday"; 
        break; 
    case 7: 
dayName = "Today is Sunday"; 
        break; 
    default: 
dayName = "Invalid day"; 
        break; 
    } 
System.out.println(dayName); 
}

public void whileLoop() {
	int i=1;  
	do
	{  
	System.out.println(i);  
	i++;  
	}while(i<=10);  
	    
}

public void breakLoop() {
	for(int i=1;i<=10;i++){  
        if(i==8){

            break;  
        }  
System.out.println(i);  	
    }  
}  

public void continueLoop() {
	for(int i=1;i<=10;i++){  
        if(i==8){

            continue;  
        }  
System.out.println(i);  	
    }  
} 

public static void main(String[] args) {
	// TODO Auto-generated method stub
	ControlStatementsMo a = new ControlStatementsMo();
	//a.ifelseLoop();
	//a.forLoop();
	//a.switchLoop();
	//a.whileLoop();
	//a.breakLoop();
	a.continueLoop();
}

}