const express = require('express');
const jwt = require('jsonwebtoken');
const app = express();
app.get('/api', (req, res) => {
    res.json({
        message:"welcome"
    })
})

const Employee={
    id:1,
    username:'sachin',
    email:'sachin@gmail.com'
}


const manager ={
    id:0,
    name:'nitesh',
    email:'nkdebug@gmail.com'
}

app.post('/api/login', verifyToken, (req, res)=> {
    
    jwt.verify(req.token, 'secretkey', (err, data) => {
        if(err) {
            res.sendStatus(403).json({message:'error creating leave request'});
        } else {
            res.json({
                Employee: "Login Employee",
                data
            })
        }
    })
})

app.post('/api/loginsuccessfull', (req, res) => {
    const success ={
        Message: "login Successfull"
    }
    jwt.sign({success}, 'secretkey', (err, token) =>{
        res.json({
            token
        })
    })
})


app.post('/api/leave', verifyToken, (req, res)=> {
    jwt.verify(req.token, 'secretkey', (err, data) => {
        if(err) {
            res.sendStatus(403).json({message:'error creating leave request'});
        } else {
            res.json({
                Employee: "I need a Leave ",
                data
            })
        }
    })
})


app.post('/api/approval', (req, res) => {
 
    const approve ={
        Manager: "leave is approved"
    }
    jwt.sign({approve}, 'secretkey', (err, token) =>{
        res.json({
            token
        })
    })
})
app.post('/api/reject', (req, res) => {
   
    const rejection ={
        Manager: "Leave is rejected"
    }
    jwt.sign({rejection}, 'secretkey', (err, token) => {
        res.json({
            token
        })
    })
})
function verifyToken(req, res, next){
    const bearerHeader = req.headers['authorization'];
    if(typeof bearerHeader !== 'undefined'){
        const bearer = bearerHeader.split(' ');
        const bearerToken = bearer[1];
        // set the toeken
        req.token = bearerToken;
        next();
    }
    else{
        res.sendStatus(403);
    }
}
app.listen(5000, ()=> {
    console.log("server is running");
})