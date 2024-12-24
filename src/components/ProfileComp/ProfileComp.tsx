import { TextField, Button, Box, Typography } from "@mui/material";
import styles from "./ProfileComp.module.scss";

const ProfileForm = () => {
    return (
        <Box className={styles.container}>
        <Typography variant="h3" className={styles.topperTitle}>
          Мой профиль
        </Typography>
          <Box              //разделитель под шапкой 
            sx={{
              height: "1px", 
              backgroundColor: "#AF9284", 
              width: "100%" // Ширина разделителя
            }} 
          />

           <Box   //ячейка с профилем 
            className={styles.ProfileContainer}
            sx={{
                display: "flex", 
                justifyContent: "center", // Центрирует горизонтально
                width: "64%",            // контейнер занимает всю ширину
                border: "2px solid #E5CFB8"
              }}
          />
      </Box>


);
};

export default ProfileForm;