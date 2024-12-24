import logo from './BeautyHubLogo.svg';
import heart from './Heart.svg';
import user from './User.svg';
import styles from './Header.module.scss'
import {
  AppBar,
  Toolbar,
  Typography,
  IconButton,
  Box
} from "@mui/material";
import { useLocation, useNavigate } from "react-router-dom";
import {HeaderProps} from "../HeaderComp/HeaderProps";
import HeartIcon from "@mui/icons-material/FavoriteBorder";
import UserIcon from '@mui/icons-material/PersonOutlineOutlined';


const HeaderMenuItems = [
  {
    path: "/register",
    icon: <HeartIcon className={styles.icon} />,
    
  },
  {
    path: "/login",
    icon: <UserIcon className={styles.icon} />,
  }
]

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
              {item.icon}
            </Typography>
          ))}
        </Box>
      </Toolbar>
      <Box 
        sx={{
          display: "flex", 
          justifyContent: "center", // Центрирует горизонтально
          width: "100%",            // Убедитесь, что родительский контейнер занимает всю ширину
        }}
        >
          <Box              //разделитель под шапкой 
            sx={{
              height: "2px", 
              backgroundColor: "#AF9284", 
              width: "95%" // Ширина разделителя
            }} 
          />
      </Box>
    </AppBar>
    
  )
};

export default HeaderBar
