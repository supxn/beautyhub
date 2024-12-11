import React from 'react';
import { Grid, Typography, Box, List, ListItem } from '@mui/material';
import styles from './Footer.module.scss';

const Footer = () => {
    return (
      <footer className={styles.footer}>
        <Box className={styles.footerContainer}>
          <Grid container spacing={4} justifyContent="space-between">
            {/* Первая колонка */}
            <Grid item xs={12} sm={4} className={styles.footerColumn}>
              <Box className={styles.footerText}>
                <Typography variant="body1">© 2024 - 2025, BeautyHub</Typography>
                <Typography variant="body1">Мы в соцсетях</Typography>
                <Typography variant="body1">г. Саратов, ул. Вольская, 10А</Typography>
                <Typography variant="body1">+7 (937) Х-ХХХ-ХХХ</Typography>
                <Typography variant="body1">ежедневно с 9:00 до 21:00</Typography>
              </Box>
            </Grid>
  
            {/* Вторая колонка */}
            <Grid item xs={12} sm={4} className={styles.footerColumn}>
              <Box className={styles.footerText}>
                <Typography variant="h5">О нас</Typography>
                <ul>
                  <li><Typography variant="body1">Акции</Typography></li>
                  <li><Typography variant="body1">Новости</Typography></li>
                  <li><Typography variant="body1">Помощь</Typography></li>
                  <li><Typography variant="body1">О проекте</Typography></li>
                  <li><Typography variant="body1">Отзывы о проекте</Typography></li>
                  <li><Typography variant="body1">Политика конфиденциальности</Typography></li>
                </ul>
              </Box>
            </Grid>
  
            {/* Третья колонка */}
            <Grid item xs={12} sm={4} className={styles.footerColumn}>
              <Box className={styles.footerText}>
                <Typography variant="h5">Для мастеров</Typography>
                <ul>
                  <li><Typography variant="body1">Документация</Typography></li>
                  <li><Typography variant="body1">Зарегистрироваться</Typography></li>
                  <li><Typography variant="body1">Пункт 3</Typography></li>
                  <li><Typography variant="body1">Пункт 4</Typography></li>
                  <li><Typography variant="body1">Пункт 5</Typography></li>
                </ul>
              </Box>
            </Grid>
          </Grid>
        </Box>
      </footer>
    );
  };

export default Footer;
