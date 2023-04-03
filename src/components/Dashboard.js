
 import React from 'react'
import { Link } from 'react-router-dom'

const Dashboard = () => {
  return (
    <div>
        <h6>Welcome to dashboard</h6>
        <div>
          <from>
            <label for="name">username  :</label>
            <input type="text" ></input> <br></br>
            <label for="text">password  </label>
            <input type="text"></input>
          </from>  
          </div>
        <Link to='/'>Go Back</Link>
         
    </div> 
   
  )
}

export default Dashboard