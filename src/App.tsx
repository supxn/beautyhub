import SearchBar from './components/Search/Search';
import backgroundImg from './pics/background.png';
import BrowsComp from './components/ServicesGrids/ServicesComp'
import Header from './components/HeaderComp/Header'
import './App.css'
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Footer from './components/FooterComp/Footer'
//import {Provider} from "react-redux";

import MainPage from './pages/mainPage/mainPage'
import LoginPage from './pages/inlet/inlet'
import RegisterPage from './pages/register/register'
import ProfilePage from './pages/profile/profile'


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
          <Route path="profile" element={<ProfilePage/>}/>
        </Route>
      </Routes>
      <Footer/>
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
