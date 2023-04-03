import { propTypes } from "react-bootstrap/esm/Image"

const Button = ({color,text,onClick}) =>{
    return(
       <button onClick={onClick} Style={{backgroundColor:red}}
       className='btn'>{text}
       </button>

    )
}

// Button.defaultProps ={
//     color:'black'
// }

// Button.propTypes = {
//     text: PropTypes.string,
//     color:PropTypes.string,
//     onClick:PropTypes.func,
// }

export default Button