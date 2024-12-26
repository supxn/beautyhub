import aparatpic from './Аппаратный маникюр.jpg'
import combi from './Комби.jpg'
import narach from './Наращивание.jpg'
import spa from './спа.jpg'
import classicmanic from './классический маник.jpg'
import pedicure from './Педикюр.jpg'

import styles from './ManicureListing.module.scss'

const Manicure: React.FC = () => {
    return(
    <div className={styles.manicure}>
        <h3>Маникюр</h3>
        <p>от 600₽</p>
        <div className={styles.cards}>
          <div className={styles.card}>
            <img src={aparatpic} alt="Аппаратный маникюр" />
            <h4>Аппаратный маникюр</h4>
          </div>
          <div className={styles.card}>
            <img src={combi} alt="Комбинированный маникюр" />
            <h4>Комбинированный маникюр</h4>
          </div>
          <div className={styles.card}>
            <img src={narach} alt="Наращивание" />
            <h4>Наращивание</h4>
          </div>
          <div className={styles.card}>
            <img src={spa} alt="СПА-уход" />
            <h4>СПА-уход</h4>
            <ul>
              <li>Снятие покрытия гель-лак</li>
              <li>Покрытие гель-лак</li>
              <li>Коррекция маникюра</li>
            </ul>
          </div>
          <div className={styles.card}>
            <img src={classicmanic} alt="Классический маникюр" />
            <h4>Классический маникюр</h4>
            <ul>
              <li>Восстановление френч</li>
              <li>Детский маникюр</li>
              <li>Укрепление ногтей</li>
            </ul>
          </div>
          <div className={styles.card}>
            <img src={pedicure} alt="Педикюр" />
            <h4>Педикюр</h4>
            <ul>
              <li>Мужской маникюр</li>
              <li>Мужской педикюр</li>
              <li>Витражный маникюр</li>
            </ul>
          </div>
        </div>
    </div>
    );
}

export default Manicure;
