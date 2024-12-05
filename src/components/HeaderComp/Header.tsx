import logo from './BeautyHub Logo.jpg';
import styles from './Header.module.scss'
import {
  AppBar,
  Toolbar,
  Typography,
  IconButton,
  Box
} from "@mui/material";
import { useLocation, useNavigate } from "react-router-dom";
import {HeaderProps} from "../HeaderComp/HeaderProps"


const HeaderMenuItems = [
  {
    path: "/register",
    label: "Регистрация",
  },
  {
    path: "/login",
    label: "Вход",
  }
]

function Separator() {
  return <hr className={styles.separator}/>;
}

const HeaderBar: React.FC<HeaderProps> = () => {
  const location = useLocation();
  const navigate = useNavigate();

  const getActiveClass = (path: string) =>
    location.pathname === path ? styles.active : "";

  return (
    <AppBar position="static" className={styles.appBar} sx={{ boxShadow: "none" }}>
      <Toolbar className={styles.toolbar}>
        {/* Логотип */}
        <Box className={styles.logoContainer}>
          <img src={logo} alt="BeautyHub Logo" className={styles.logo} />
        </Box>

        {/* Меню */}
        <Box className={styles.menu}>
          {HeaderMenuItems.map((item) => (
            <Typography
              key={item.path}
              className={`${styles.menuItem} ${getActiveClass(item.path)}`}
              onClick={() => navigate(item.path)}
            >
              {item.label}
            </Typography>
          ))}
        </Box>
      </Toolbar>
      <Box sx={{ height: "2px", backgroundColor: "#cccccc", width: "100%" }} />
    </AppBar>
    
  )
};

export default HeaderBar
