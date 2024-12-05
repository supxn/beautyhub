import SearchBar from './components/Search/Search';
import backgroundImg from './pics/background.png';
import BrowsComp from './components/ServicesGrids/ServicesComp'
import Header from './components/HeaderComp/Header'
import './App.css'
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import {Provider} from "react-redux";

import MainPage from './pages/mainPage/mainPage'
import LoginPage from './pages/inlet/inlet'
import RegisterPage from './pages/register/register'


const AppContent: React.FC = () => {
  return(
    <Router>
      <Header/>
      <Routes>
        <Route path="/" element={<MainPage/>}/>
        <Route>
          <Route path="main" element={<MainPage/>}/>
          <Route path="login" element={<LoginPage/>}/>
          <Route path="register" element={<RegisterPage/>}/>
        </Route>
      </Routes>
    </Router>
  );
};

function BackgroundPic (){
  return (
    <img src={backgroundImg} alt="backgroundimage" className="img"></img>
  )
}

function App() {
  return (
    <div className="app">
        <AppContent/>
    </div>
  );
}

export default App
