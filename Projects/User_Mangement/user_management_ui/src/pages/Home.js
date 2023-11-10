import React, { useEffect, useState } from "react";
import axios from "axios";
import {Link } from "react-router-dom";
export default function Home() {

    const [users,setUsers]=useState([]);
    useEffect(()=>{
        loadUsers();
    },[])
    const loadUsers=()=>{
        axios.get('http://localhost:8080/getUsers')
        .then(response => setUsers(response.data));
    };
    const deleteUser=async(id)=>{
      await axios.delete(`http://localhost:8080/deleteUser/${id}`)
      loadUsers()
    }
  return (
    <div className="container ">
      <div className="py-5">
        <table className="table border shadow">
          <thead>
            <tr>
              <th scope="col">Sno</th>
              <th scope="col">Username</th>
              <th scope="col">Name</th>
              <th scope="col">Email</th>
              <th scope="col">Actions</th>
            </tr>
          </thead>
          <tbody>
            {users.map((user,index)=>(
            <tr key={user.id}>
              <th scope="row">{user.id}</th>
              <td>{user.username}</td>
              <td>{user.name}</td>
              <td>{user.email}</td>
              <td>
                <Link to={`editUser/${user.id}`} className="btn btn-primary mx-2">Edit</Link>
                <button className="btn btn-danger mx-2"
                onClick={()=>deleteUser(user.id)}
                >Delete</button>

              </td>
            </tr>

            ))
            }
            
          </tbody>
        </table>
      </div>
    </div>
  );
}
