import React from "react";
import Button from './Button'


const Header =({title, onAdd , showcreate}) =>{
    return(
        <header className="header">
            <h1>title</h1>
            <Button
                color={showcreate ? 'red' : 'green'}
                text={showcreate ? 'exit' : 'Add'}
                onClick={onAdd}>
            </Button>

        </header>
    )
}

Header.defaultProps ={
    title:'E-Commerce Website'
}

export default Header