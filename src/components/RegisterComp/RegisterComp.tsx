import React from "react";
import { TextField, Button, Box, Typography } from "@mui/material";
import styles from "./RegisterComp.module.scss";

const AuthForm = () => {
    return (
      <Box className={styles.container}>
        <Typography variant="h5" className={styles.title}>
          Регистрация
        </Typography>

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
  
        <form className={styles.form}>
          <TextField
            label="Имя"
            variant="outlined"
            fullWidth
            className={styles.input}
            margin="normal"
          />
          <TextField
            label="Фамилия"
            variant="outlined"
            fullWidth
            className={styles.input}
            margin="normal"
          />
          <TextField
            label="Отчество"
            variant="outlined"
            fullWidth
            className={styles.input}
            margin="normal"
          />
          <TextField
            label="Номер телефона"
            variant="outlined"
            fullWidth
            className={styles.input}
            margin="normal"
          />
          <TextField
            label="Email"
            variant="outlined"
            fullWidth
            className={styles.input}
            margin="normal"
          />
          <TextField
            label="Пароль"
            type="password"
            variant="outlined"
            fullWidth
            className={styles.input}
            margin="normal"
          />
          <TextField
            label="Повторите пароль"
            type="password"
            variant="outlined"
            fullWidth
            className={styles.input}
            margin="normal"
          />
          
          <Box className={styles.buttons}>
            <Button variant="outlined" className={styles.registerButton}>
              Зарегистрироваться
            </Button>
          </Box>
        </form>
      </Box>
    );
  };
  
  export default AuthForm;