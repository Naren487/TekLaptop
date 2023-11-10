import logo from './logo.svg';
import './App.css';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import { AddUser } from './users/AddUser';
import { BrowserRouter as Router ,Routes,Route } from 'react-router-dom';
import { EditUser } from './users/EditUsers';
function App() {
  return (
    <>
   <Router>
    <Navbar/>
    <Routes>
      <Route  exact path='/' element={<Home/>}/>
      <Route  exact path='/adduser' element={<AddUser/>}/>
      <Route  exact path='/editUser/:id' element={<EditUser/>}/>

    </Routes>
   </Router>
    </>
  );
}

export default App;
