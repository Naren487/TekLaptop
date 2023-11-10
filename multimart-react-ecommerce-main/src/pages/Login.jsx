import React, { useEffect } from 'react';
import "./assets/login.css";
import otp_icon from './assets/otp.png';
import email_icon from './assets/email.png';
import password_icon from './assets/password.png';
import { useState } from 'react';
import { Link } from 'react-router-dom';
import axios from 'axios';
const Login = () => {
    const [email,setemail]=useState("");
    const [password,setpassword]=useState("");
    const [users,Setusers]=useState([]);
    useEffect(()=>{
        axios.get('http://localhost:2000/users')
        .then(res=>{
            Setusers(res.data);
         })
    },[])

    const handleSubmit=()=>{
        // console.log("ASAS",users);
        users.map((user,index)=>{
            if(user["email"]===email && user["password"]===password){
                console.log(user);
            }
        });
    }
  return (
   <div className='container2'>
    <div className='header'>
        <div className='text'>
            Login
        </div>
        <div className='underline'></div>

    </div>
    <div className='inputs'>
        <div className='input'>
            <img src={email_icon} alt=''/>
            <input type='text' placeholder='Email' onChange={(e)=>{setemail(e.target.value)}}/>
        </div>
        
        <div className='input'>
            <img src={password_icon} alt='' />
            <input type='password'placeholder='Password' onChange={(e)=>{setpassword(e.target.value)}}/>
        </div>

        <div className='input'>
            <img src={otp_icon} alt=''/>
            <input type='number'placeholder='Email'/>
        </div>
    </div>
    {/* <div className="forget-password">Forget</div> */}
    <div className="submit-container">
        <div className="submit" onClick={handleSubmit}>Login</div>
        <Link className="submit gray" to="/register" >Go to Sign Up</Link>
    </div>
   </div>
  )
}

export default Login