import logo from './assets/BeautyHub Logo.jpg';
import backgroundImg from './assets/background.png';
import SearchBar from './Search/Search';
import './App.css'

// Компонент Header
function Header() {
  return (
    <header className="header">
      <img src={logo} alt="BeautyHub Logo" className="logo-image" />
        <nav className="nav">
          <ul>
            <li><a href="#">Регистрация</a></li>
            <li><a href="#">Вход</a></li>
          </ul>
        </nav>
    </header>
  );
}

function Separator() {
  return <hr className="separator" />;
}

function BackgroundImage() {
  return (
    <img src={backgroundImg} alt="backgroundimage" className="img"></img>
  );
}


function App() {
  return (
    <div className="app">
      <Header />
      <Separator/>
      <SearchBar/>
    </div>
  );
}

export default App
