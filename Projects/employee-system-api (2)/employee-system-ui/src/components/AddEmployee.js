import React, { useState } from 'react'
import EmployeeService from '../Services/EmployeeService';
import axios from 'axios';
const AddEmployee = () => {
    const [firstName,setFirstName]=useState('');
    const [lastName,setLastName]=useState('');
    const [emailId,setemailId]=useState('');
    const saveEmployee=(e)=>{
        e.preventDefault();
        const emp={
            "firstName":firstName,
            "lastName":lastName,
            "emailId":emailId
        }
        EmployeeService.createEmployee(emp).then((response)=>{
            console.log(response.data);
        }).catch(error=>{
            console.log(error);
        })
        // axios.put('http://localhost:8080/api/v1/emp', emp)
        // .then(response => alert("data addred"));
    }
  return (
    <div className='flex max-w-2xl mx-auto shadow border-b'>
        <div className='px-8 py-8'>
            <div className='font-thin text-2xl tracking-wider mb-3  '>
                <h1 className=''>Add New Employee</h1>
            </div>
            <div className='items-center justify-center h-14 w-full'>
                <label className='block text-gray-600 text-sm font-normal'>First Name</label>
                <input type='text' name='firstName' value={firstName} onChange={(e)=>setFirstName(e.target.value)} className='h-10 w-96 boder mt-2 px-2 py-2'></input>
            </div>
            <div className='items-center justify-center h-14 w-full'>
                <label className='block text-gray-600 text-sm font-normal mt-4'>Last Name</label>
                <input type='text' name='lastName' value={lastName} onChange={(e)=>setLastName(e.target.value)} className='h-10 w-96 boder mt-2 px-2 py-2'></input>
            </div>
            <div className='items-center justify-center h-14 w-full'>
                <label className='block text-gray-600 text-sm font-normal mt-4'>Email</label>
                <input type='text' name='emailId' value={emailId} onChange={(e)=>setemailId(e.target.value)} className='h-10 w-96 boder mt-2 px-2 py-2'></input>
            </div>
            <div className='items-center justify-center h-14 w-full mt-6 space-x-4'>
                <button className='rounded text-white font-semibold bg-green-400 px-6 py-2 hover:bg-green-900 ' onClick={(e)=>saveEmployee(e)}>Save</button>
                <button className='rounded text-white font-semibold bg-red-400 px-6 py-2 hover:bg-red-900 '>Clear</button>
            </div>
        </div>
    </div>
  )
}

export default AddEmployee;