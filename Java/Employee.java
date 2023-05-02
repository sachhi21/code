

public class Employee {
    int eId;
    String name;
    int salary;

    public static void main(String[] args) {
        
       // int nums[] = {1, 2,3,4,5};

        //int nums1[] =new int[5];

       /*  for(int i=0;i< nums.length;i++) {
            System.out.println(nums[i]);
        }  */



        Employee e1 = new Employee();
        e1.eId= 1;
        e1.name = "sachin";
        e1.salary = 111;

        
        Employee e2 = new Employee();
        e2.eId= 2;
        e2.name = "me";
        e2.salary = 1000;

        
        Employee e3 = new Employee();
        e3.eId= 3;
        e3.name = "pkdebug";
        e3.salary = 10000;

        Employee empArr[] = new Employee[3];
        empArr[0] = e1;
        empArr[1] = e2;
        empArr[2] = e3;

        for (Employee employee : empArr) {
            System.out.println(employee);
            System.out.println(employee.eId + " " + employee.name + " "+ employee.salary);
        }

    }
} 
