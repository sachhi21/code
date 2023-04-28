class welcome{
    public static void main(String[] args) {
    // Code to be executed
    System.out.println("error");

int x = 10;
int ans = ++x;
System.out.println(ans); 
System.out.println(x); 

int y = 5;
int resul = x++;
System.out.println(resul); 
System.out.println(y);

int z= 5;
int resu = --x;
System.out.println(resu); 
System.out.println(z); 

int o = 5;
int res = x--;
System.out.println(res); 
System.out.println(o); 

int me= 5;
int yoy= 10;
boolean condition1 = (me> 3) && (yoy < 20);  
boolean condition2 = (me > 100) || (yoy < 20); 
boolean condition3 = !(me > 10);            

System.out.println(condition1);
System.out.println(condition2);
System.out.println(condition3);

int num = 5;

if (num > 10) {
    System.out.println("Number is greater than 10");
} else if (num > 5) {
    System.out.println("Number is greater than 5");
} else if (num > 0) {
    System.out.println("Number is greater than 0");
} else {
    System.out.println("Number is less than or equal to 0");
}

int a = 10;
int b = (a > 5) ? 20 : 30;
System.out.println(b); 

int dayOfWeek = 2;
String dayName;

switch (dayOfWeek) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    case 4:
        dayName = "Thursday";
        break;
    case 5:
        dayName = "Friday";
        break;
    case 6:
        dayName = "Saturday";
        break;
    case 7:
        dayName = "Sunday";
        break;
    default:
        dayName = "Invalid day";
        break;
}

System.out.println(dayName); 

for (int i = 1; i <= 5; i++) {
    System.out.println("I am " + i);
}


int i = 1;

while (i <= 5) {
    System.out.println("I am  " + i);
    i++;
}

// class basic building block for creating objects, which are instances of the class.
// A class encapsulates data and functionality, allowing you to create 
//multiple objects with similar characteristics and behaviors.

// object is real word entity using new keyword


}

}
//System.out.println("error");

