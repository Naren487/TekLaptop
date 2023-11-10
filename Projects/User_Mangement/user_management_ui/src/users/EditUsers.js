import React, { useState } from 'react'
import axios from "axios";
import {Link} from "react-router-dom";
import {useNavigate,useParams} from "react-router-dom";
import { useEffect } from 'react';
export const EditUser = () => {
    let navigate=useNavigate();
    const {id}=useParams();
    const [user,Setuser]=useState({
        name:"",
        username:"",
        email:""
    });
    const {name,username,email}=user;
    const onInputChange=(e)=>{
        Setuser({...user,[e.target.name]:e.target.value});

    }
    const onSubmit=async(e)=>{
        e.preventDefault();
        console.log("ASASAAS",id);
        await axios.put(`http://localhost:8080/editUser/${id}`,user)
        navigate("/")
    }
    useEffect(()=>{
        loadUser()
    },[]);

    const loadUser=async()=>{
        const result =await axios.get(`http://localhost:8080/getUser/${id}`)
        Setuser(result.data);
    }
  return (
    <div className='container'>
        <div className='row'>
            <div className='col-md-6 offset-md-3 text-center border rounded p-4 mt-2 shadow'>
                <h2 className='text-center m-4'>Edit User</h2>
                
                <form onSubmit={(e)=>onSubmit(e)}>
                <div className='mb-3'>
                    <label htmlFor='Name' className='form-label'>
                        Name
                    </label>
                    <input type='text'
                           className='form-control'
                           placeholder='Enter Your Name'
                           name='name'
                           value={user.name}
                           onChange={(e)=>onInputChange(e)}
                    />
                </div>
                <div className='mb-3'>
                    <label htmlFor='userame' className='form-label'>
                        Username
                    </label>
                    <input type='text'
                           className='form-control'
                           placeholder='Enter Your Username'
                           name='username'
                           value={user.username}
                           onChange={(e)=>onInputChange(e)}
                    />
                </div><div className='mb-3'>
                    <label htmlFor='email' className='form-label'>
                        Email
                    </label>
                    <input type='email'
                           className='form-control'
                           placeholder='Enter Your Email'
                           name='email'
                           value={user.email}
                           onChange={(e)=>onInputChange(e)}
                    />
                </div>
                <button type='submit' className='btn btn-outline-primary'>Submit</button>
                <Link to="/" className='btn btn-outline-danger mx-2'>Cancel</Link>
                </form>
            </div>
        </div>
    </div>
  )
}
