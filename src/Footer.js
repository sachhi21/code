
const Footer = () =>{
    const year= new Date().getFullYear();
    return (
        
        <div className="login">
          <div>     <h1>Please Log In</h1>
          
      <form>
        <label>
          <p>Username</p>
          <input type="text" />
        </label>
        <label>
          <p>Password</p>
          <input type="password" />
        </label> 
        <br></br>
         <br></br>

        <div>
          <button type="submit">Submit</button>
        </div>
      </form>
    
      </div> 
        
    <div className="footer">
            
    <footer >{`copy @ sachin ${year}`}</footer>
    </div>
    </div>
    );
}


export default Footer;


// const style=
// {   footer:{
//     position:fixed
    
// }
// }