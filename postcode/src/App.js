import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
import Post from './pages/Post';
import SingUp from './pages/SignUp';


function App() {
  return (
   <>
   <Router>
    <Routes>
      <Route path='/' element={<SingUp />} />
      <Route path='/Post' element={<Post />} />
      </Routes>
   </Router>
   </>
  );
}

export default App;
