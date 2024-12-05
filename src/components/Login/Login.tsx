import React from "react";
import { TextField, Button, Box, Typography } from "@mui/material";
import styles from "./login.module.scss";

const AuthForm = () => {
  return (
    <Box className={styles.container}>
      <Typography variant="h5" className={styles.title}>
        Авторизация
      </Typography>

      <form className={styles.form}>
        <TextField
          label="Номер телефона или Email"
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
        
        <Box className={styles.buttons}>
          <Button variant="contained" className={styles.submitButton}>
            Вход
          </Button>
          <Button variant="outlined" className={styles.registerButton}>
            Регистрация
          </Button>
        </Box>
      </form>
    </Box>
  );
};

export default AuthForm;