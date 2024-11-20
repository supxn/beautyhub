import search from './search-icon.png'
import backgroundImg from './background.png';
import styles from './search.module.css'

function SearchBar() {
    return (
      <div className={styles.searchBox}>
        <p className={styles.searchTitle}>Лучшие мастера бьюти вашего города здесь!</p>
        <div className={styles.searchContainer}>
          <input type="text" className={styles.searchInput} placeholder='Мастера, салоны услуги...' />
          <button className={styles.searchButton}>
            <img className={styles.searchIcon} src={search} alt="search-icon"></img>
          </button>
        </div>
        <img src={backgroundImg} alt="backgroundimage" className="img"></img>
      </div>
    );
}

export default SearchBar