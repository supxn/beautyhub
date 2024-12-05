import imgBrow from './brows.jpg'
import imgManic from './manicure.jpg'
import imgLashes from './lashes.jpg'

import styles from './servicesgrids.module.scss'

import React from "react";
import { Grid, Card, CardMedia, CardContent, Typography, Box } from "@mui/material";


const services = [
  {
    image: imgBrow,
    title: "Брови",
    label: "Коррекция бровей",
    description: [
      "Счастье для бровей",
      "Классическая коррекция",
      "Ламинирование бровей",
      "Окрашивание бровей",
      "Еще...",
    ],
    extras: ["Косметология", "Макияж", "Массаж", "Все услуги мастеров..."],
  },
  {
    image: imgManic,
    title: "Маникюр",
    label: "Ногти",
    description: [
      "Аппаратный маникюр",
      "Корейский маникюр",
      "Педикюр",
      "Наращивание ногтей",
      "Классический маникюр",
      "Еще...",
    ],
    extras: ["Парикмахеры", "Пирсинг", "Спа-процедуры"],
  },
  {
    image: imgLashes,
    title: "Ресницы",
    label: "Оформление ресниц",
    description: [
      "Наращивание ресниц",
      "Ламинирование ресниц",
      "Биозавивка",
      "Лифтинг",
      "Окрашивание",
      "Еще...",
    ],
    extras: ["Татуаж", "Татуировки", "Эпиляция"],
  },
];

const Services = () => {
  return (
    <Box className={styles.container}>
      <Typography variant="h4" className={styles.title}>
        Выбери услугу...
      </Typography>
      <Grid container spacing={3} className={styles.gridContainer}>
        {services.map((service, index) => (
          <Grid item xs={12} sm={4} key={index}>
            <Card className={styles.card}>
              <CardMedia
                component="img"
                height="140"
                image={service.image}
                alt={service.title}
                className={styles.cardImage}
              />
              <CardContent>
                <Typography variant="h6" className={styles.cardTitle}>
                  {service.title}
                </Typography>
                <Typography variant="h4" className={styles.cardLabel}>
                  {service.label}
                </Typography>
                <ul className={styles.descriptionList}>
                  {service.description.map((item, idx) => (
                    <li key={idx}>{item}</li>
                  ))}
                </ul>
                <ul className={styles.extraList}>
                  {service.extras.map((item, idx) => (
                    <li key={idx} className={styles.extraItem}>
                      {item}
                    </li>
                  ))}
                </ul>
              </CardContent>
            </Card>
          </Grid>
        ))}
      </Grid>
    </Box>
  );
};

export default Services;
