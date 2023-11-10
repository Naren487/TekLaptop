import React from "react";
import { Link } from "react-router-dom";
const Navbar = () => {
  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
        <div className="container-fluid">
      <a className="navbar-brand" href="#">
        User Management 
      </a>
      <button
        className="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarNav"
        aria-controls="navbarNav"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span className="navbar-toggler-icon"></span>
      </button>
      {/* <Link to={"/addUser"}>Add User</Link> */}
      <Link className="btn btn-outline-light" to="/addUser">Add User</Link>
      </div>
    </nav>
  );
};

export default Navbar;
