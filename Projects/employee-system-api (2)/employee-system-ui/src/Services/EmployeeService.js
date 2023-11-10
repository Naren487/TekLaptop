import React from 'react'
import axios from 'axios'

const EMP_REST_API='http://localhost:8080/AddData';
class EmployeeService  {
    createEmployee(emp){
        // console.log(emp)
        return axios.post(EMP_REST_API,emp);
    }
    getEmployee(){
        return axios.get('http://localhost:8080/getData');
    }
}

export default new EmployeeService()