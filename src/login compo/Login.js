import React from 'react';
import './Login.css'

export default function Login() {
  return(
    <div className="login">
      <h1>Please Log In</h1>
      <form>
        <label>
          <p>Username</p>
          <input type="text" />
        </label>
        <label>
          <p>Password</p>
          <input type="password" />
        </label> <br></br>

        <div>
          <button type="submit">Submit</button>
        </div>
      </form>
    </div>
  )
}