Queries--------------------Updated

select * from clients;

select name from clients;

select name from clients order by name;

select city from clients where name = "kwideo";

select * from payment_methods;

select name, phone  from clients where client_id =5;

select * from clients order by client_id DESC;

select distinct name from clients ;

select name , unit_price , unit_price*18 as new_price  from clients ;

select * from  Customcustomersers where points>3000;

select * from clients where state <> 'CA';

select * from clients where state = 'CA'  ||  state ='NY';

select * from clients where not(state = 'NY' and state = 'CA');

select * from Clients where state = 'NA'; 

select * from Clients where state not IN('NY', 'CA'); 

select * from Clients where client_id between 2 and 5;


select * from Clients where name Like 'Y%';

select * from Clients where name not Like  'Y%';


select * from Clients where name Like '%Y';


select * from Clients where name Like '%Y%';


-- regex
select * from clients where name regexp 'aryan|sachin';

select * from clients order by name , state ASC;

select * from clients limit  4;

select * from clients limit  3,4;

use sql_hr;

select * from employees;

select * from  offices;

select distinct first_name, last_name from employees;


SELECT * FROM sql_store.customers;

select * from products;

select * from products where quantity_in_stock in(14,26,49);

select name quantity_in_stock where unit_price >= 1.21;

use sql_store;

select * from customers limit 100;

select * from order_item_notes;

select * from  order_statuses;

select * from order_items;

select * from  orders;

select * from products;

select * from shippers;

use sql_hr;

select * from employees;
select * from  offices;

select distinct first_name, last_name from employees;


08-05-2023------------------------------------------

    insert into Customers(first_name, last_name, birth_date,
    address,city,state) 
    values( 'him' , 'blr' , '1999-01-01',
     '615-641-4759' , 
    '50 Lillian Crossing', 'IN');
    
    update Customers
    set city = 'chennai'
    where customer_id = 11;
    
    select * from orders where customer_id IN 
    (select customer_id from customers where customer_id =5);
    
    delete from customers
    where customer_id = 11;
    
    select * from customers;  
    
    -- joins

 select  order_id , o.customer_id  
 from orders o
 join customers c
              on o.customer_id =c.customer_id;
              
              
              
-- joing tw0 databases

 select * from order_items oi
     join sql_inventory.products p
     on oi.product_id = p.product_id;
    use sql_hr;
    
    
      select 
       e.employee_id,
       e.first_name,
	   m.first_name AS manager
       from employees e
       join employees m
       on e.reports_to = m.employee_id;
    select * from employees;
    
    use sql_store;
        
    select order_id ,
    order_date,
    'Active' As status
    from orders
    where order_date >= '2019-01-01'
    union
    
        select order_id ,
    order_date,
    'Archived' As status
    from orders
    where order_date < '2019-01-01';
    
    
   alter
    


