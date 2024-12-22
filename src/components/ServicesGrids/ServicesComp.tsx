import imgBrow from './brows.jpg'
import imgManic from './nails.jpg'
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
      '"Счастье для бровей"',
      "Классическая коррекция",
      "Ламинирование бровей",
      "Окрашивание бровей",
      "Вельвет",
      "Еще...",
    ],
    extras: ["Косметология", "Макияж", "Массаж"],
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
      <Typography variant="h3" className={styles.title}>
        Выбери услугу...
      </Typography>
      <Grid container spacing={4} className={styles.gridContainer}>
        {services.map((service, index) => (
          <Grid item sm={4} key={index} className={styles.serviceItem}>
            <Box className={styles.card}>
              <img src={service.image} alt={service.title} className={styles.serviceImage} />
              <Typography variant="h4" className={styles.serviceTitle}>
                {service.title}
              </Typography>
            </Box>
            <Box className={styles.textWrapper}>
              <p className={styles.serviceLabel}>
                {service.title === "Брови" ? "Коррекция бровей" : service.title === "Маникюр" ? "Ногти" : "Оформление ресниц"}
              </p>
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
            </Box>
          </Grid>
        ))}
      </Grid>
      <Typography variant="h5" className={styles.extraTitle}>
        Все услуги мастеров...
      </Typography>
    </Box>
  );
};

export default Services;
