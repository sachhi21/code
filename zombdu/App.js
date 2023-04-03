import React from 'react';
import logo from './logo.svg';
import './App.css';
import Login from './Components/Login.js'
import { useState, useEffect } from "react";

import Header from './Components/Header';
import products from './Components/products'
import create from './Components/create';
import { Route, Router, Routes } from 'react-router-dom';


function App() {

  const [showcreate, setShowcreate] = useState(false);
const [products, setproducts]= useState([])

  useEffect(()=> {
  const getproducts = async()=>{
    const dataFromServer = await fetchProducts()
    setproducts(dataFromServer)
  } 
  getproducts()
},[]
  )

  let data ;

  const fetchProducts = async() =>{
    const res = await fetch('http://localhost:3333/products')
     data = await res.json();
    console.log(data);
     return data;
    
 
  }

  return (
    <div><h1>E-Commerce WEbsite</h1></div>
    {
      
    }
    // <Router>
    //   <div className='container'>

    //     <Header onAdd={() => setShowcreate(!showcreate)} showcreate={showcreate}/>

    //        <Routes>
    //          <Route path='/' exact element ={
          
    //       <>
           
    //        {showcreate && <create onAdd={create}/>}
            
    //       </>
        
    //     }
    //      />


     



    //   </Routes>
    //   </div>
       
    // </Router> 
  );
}

export default App;