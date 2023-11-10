import { BrowserRouter, Routes, Route } from "react-router-dom";
import "./App.css";
import AddEmployee from "./components/AddEmployee";
import ListEmployees from "./components/ListEmployees";
import Navbar from "./components/Navbar";

function App() {
  return (
    <>
    <Navbar />
  <BrowserRouter>
      <Routes>
        <Route path="/" element={<ListEmployees />}/>
          <Route path="/addEmp" element={<AddEmployee />} />
            
      </Routes>
    </BrowserRouter>
  {/* <AddEmployee/> */}
  </>
  );
}

export default App;
