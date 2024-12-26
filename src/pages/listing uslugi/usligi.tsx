import React from 'react';
import { Link } from 'react-router-dom'; // Импортируем Link для перехода
import styles from './uslugi.module.scss';
import flowpic from './цветы.svg';
import { Box } from '@mui/material';

import Manicure from '../../components/ManicureListing/ManicureListing';
import Lashes from '../../components/LashesListing/LashesListing';
import Brows from '../../components/BrowsListing/BrowsListing'

const Services: React.FC = () => {
  return (
    <section className={styles.services}>
      <div className={styles.header}>
        <img src={flowpic} alt="Цветы" className={styles.flowpic} width="200" />
        <h2>УСЛУГИ</h2>
      </div>
      <Box // разделитель под шапкой
        sx={{
          height: '1px',
          backgroundColor: '#AF9284',
          width: '95%',
          margin: '10px auto 20px auto', // Отступы сверху и снизу
        }} 
      />
      <Manicure/>
      <Lashes/>
      <Brows/>
    </section>
  );
};

export default Services;
