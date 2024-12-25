import logo from './BeautyHubLogo.svg';
import styles from './Header.module.scss';
import {
  AppBar,
  Toolbar,
  Typography,
  IconButton,
  Box,
  Menu,
  MenuItem,
} from "@mui/material";
import { useLocation, useNavigate } from "react-router-dom";
import { HeaderProps } from "../HeaderComp/HeaderProps";
import HeartIcon from "@mui/icons-material/FavoriteBorder";
import UserIcon from '@mui/icons-material/PersonOutlineOutlined';
import React, { useState, MouseEvent } from 'react';
import createTheme from '@mui/material/styles';

const HeaderBar: React.FC<HeaderProps> = () => {
  const location = useLocation();
  const navigate = useNavigate();

  const getActiveClass = (path: string) =>
    location.pathname === path ? styles.active : "";

  // Состояния для меню
  const [heartMenuAnchor, setHeartMenuAnchor] = useState<null | HTMLElement>(null);
  const [userMenuAnchor, setUserMenuAnchor] = useState<null | HTMLElement>(null);

  // Обработчики открытия и закрытия меню
  const handleMenuOpen = (event: MouseEvent<HTMLElement>, setAnchor: React.Dispatch<React.SetStateAction<HTMLElement | null>>) => {
    setAnchor(event.currentTarget);
  };

  const handleMenuClose = (setAnchor: React.Dispatch<React.SetStateAction<HTMLElement | null>>) => {
    setAnchor(null);
  };

  return (
    <AppBar position="static" className={styles.appBar} sx={{ boxShadow: "none" }}>
      <Toolbar className={styles.toolbar}>
        {/* Логотип */}
        <Box className={styles.logoContainer}>
          <img src={logo} alt="BeautyHub Logo" className={styles.logo} />
        </Box>

        {/* Кнопки с выпадающими меню */}
        <Box className={styles.menu}>
          {/* Кнопка "Сердечко" */}
          <IconButton
            onClick={(event) => handleMenuOpen(event, setHeartMenuAnchor)}
          >
            <HeartIcon className={styles.icon} sx={{fontSize: "30pt", color: "#8C7062"}} />
          </IconButton>
          <Menu
            anchorEl={heartMenuAnchor}
            open={Boolean(heartMenuAnchor)}
            onClose={() => handleMenuClose(setHeartMenuAnchor)}
            sx ={{'& .MuiPaper-root': {boxShadow: '0px 4px 12px rgba(0, 0, 0, 0.1)'}}}
          >
            <MenuItem onClick={() => { navigate('/profile'); handleMenuClose(setHeartMenuAnchor); }}>Профиль</MenuItem>
            <MenuItem onClick={() => { navigate('/favorites'); handleMenuClose(setHeartMenuAnchor); }}>Избранное</MenuItem>
            <MenuItem onClick={() => { navigate('/settings'); handleMenuClose(setHeartMenuAnchor); }}>Настройки</MenuItem>
            <MenuItem onClick={() => { navigate('/main'); handleMenuClose(setHeartMenuAnchor); }}>Выход</MenuItem>
          </Menu>

          {/* Кнопка "Пользователь" */}
          <IconButton
            onClick={(event) => handleMenuOpen(event, setUserMenuAnchor)}
          >
            <UserIcon className={styles.icon} sx={{fontSize: "30pt", color: "#8C7062"}} />
          </IconButton>
          <Menu
            anchorEl={userMenuAnchor}
            open={Boolean(userMenuAnchor)}
            onClose={() => handleMenuClose(setUserMenuAnchor)}
            className={styles.profileMenu}
            sx ={{'& .MuiPaper-root': {boxShadow: '0px 4px 12px rgba(0, 0, 0, 0.1)'}}}
          >
            <MenuItem onClick={() => { navigate('/login'); handleMenuClose(setUserMenuAnchor); }}>Вход</MenuItem>
            <MenuItem onClick={() => { navigate('/register'); handleMenuClose(setUserMenuAnchor); }}>Регистрация</MenuItem>
          </Menu>
        </Box>
      </Toolbar>

      {/* Разделитель */}
      <Box 
        sx={{
          display: "flex", 
          justifyContent: "center",
          width: "100%",
        }}
      >
        <Box
          sx={{
            height: "1px", 
            backgroundColor: "#AF9284", 
            width: "85%",
          }}
        />
      </Box>
    </AppBar>
  );
};

export default HeaderBar;
