mini console java application 

Bus Booking System 
  ->Source
  ->Destination
  ->Available buses
  ->book available bus 
  ->Print ticket

inheritance

abstraction

polymorphism



// types of interface
regural interface
fuctional interface (lambda)
marker interface
exceptions

//Exception
Compile time error // IDE
runtime exception -> Exception handling  ex: / 0
handle with try catch 
multiple catch statements 


most exception in the first catch statements
generic after thhat


exception Runtime exception SQL exception IO exception


collections
set tree list
array


collections api

list -> ArrayList
set->
map


int[] = new int[5];


ArrayList// dynamic - default size 16
ArrayList<Integer> list = new ArrayList<>;
List.add(1);


LinkedList

{
    head
    Node data;
}

set- -> unique elements only


[key:value]

currency>ap.put("India", "INR"),
("US" , "USD")
("UK" , "GBP")

queue
Dequeue class

Set(HS, LinkedList)
iterable class
iterator<T>

HashMap ->key is always unique

//ConcurrentHashMap -> multithreading enviroment->better performance
//synchronized  keyword

//collections.synchrozedMap(collectionname  );

Collections.sort();
Collections.sort();
Comparator for object sort

Comparator <integer> comp = new Comparator<Integer>(){
    @Override

    public int compare(Integer o1 , Integer o2)
       if(o1%10 > 02%10){
        return 1;
       }else{
        return -1;
       }

}

Comparable Comparator can be used for object sort

for class level Comparable

Runtime exception -> NullPointerExc , Arit , Numberformate
exception , array index=> unchecked exception

checked exception -  SQL IO

error
outof memory error
IO error
virtual machime error
stackoverflow error


throw keyword to handle using compiler



public class cusomexception extends Exception{
    
}
in try
throw new cusomexceptiom("inavalid");
