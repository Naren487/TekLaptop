import React, { useEffect, useState } from 'react'
import EmployeeService from '../Services/EmployeeService';
import { Link } from 'react-router-dom';

const ListEmployees = () => {
    const [employees,setEmployees]=useState([]);

    useEffect(()=>{
        EmployeeService.getEmployee().then((response)=>{
            setEmployees(response.data);
            console.log(response.data);
        }).catch(error=>{
            console.log(error);
        },[])
    })
  return (
        <div class="flex flex-col">
  <div class="overflow-x-auto sm:-mx-6 lg:-mx-8">
            <Link className='bg-green-600 px-3 py-3 mx-8 my-8' to="/addEmp">Add Employee</Link>
    {/* <button className='btn bg-green-900 px-3 py-3 mx-9'>Add Employee</button> */}
    <div class="inline-block min-w-full py-2 sm:px-6 lg:px-8">
      <div class="overflow-hidden">
        <table class="min-w-full text-left text-sm font-light">
          <thead
            class="border-b bg-white font-medium dark:border-neutral-500 dark:bg-neutral-600">
            <tr>
              <th scope="col" class="px-6 py-4">Sno</th>
              <th scope="col" class="px-6 py-4">First Name</th>
              <th scope="col" class="px-6 py-4">Last Name</th>
              <th scope="col" class="px-6 py-4">Email </th>
            </tr>
          </thead>
          <tbody>
            {employees.map(
                employee=>
                <tr key={employee.id}
              class="border-b bg-neutral-100 dark:border-neutral-500 dark:bg-neutral-700">
              <td class="whitespace-nowrap px-6 py-4 font-medium">{employee.id}</td>
              <td class="whitespace-nowrap px-6 py-4">{employee.firstName}</td>
              <td class="whitespace-nowrap px-6 py-4">{employee.lastName}</td>
              <td class="whitespace-nowrap px-6 py-4">{employee.emailId}</td>
            </tr>
            )}
           
          </tbody>
        </table>
      </div>
    </div>
  </div>
</div>
  )
}

export default ListEmployees