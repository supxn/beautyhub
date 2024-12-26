import botox from './Ботокс.jpg'
import laminir from './Ламинирование.jpg'
import narachlash from './Наращивание.jpg'

import styles from './LashesListing.module.scss'

const Lashes: React.FC = () => {
    return(
    <div className={styles.lashes}>
        <h3>Оформление ресниц</h3>
        <p>от 600₽</p>
        <div className={styles.cards}>
          <div className={styles.card}>
            <img src={botox} alt="Ботокс" />
            <h4>Ботокс</h4>
            <ul>
              <li>Биозавивка</li>
              <li>Нанопластика</li>
            </ul>
          </div>
          <div className={styles.card}>
            <img src={laminir} alt="Ламинирование" />
            <h4>Ламинирование</h4>
            <ul>
              <li>Цветное ламинирование</li>
              <li>Наращивание</li>
            </ul>
          </div>
          <div className={styles.card}>
            <img src={narachlash} alt="Наращивание" />
            <h4>Наращивание</h4>
            <ul>
              <li>Молекулярное восстановление</li>
            </ul>
          </div>
        </div>
    </div>
    );
}

export default Lashes;
