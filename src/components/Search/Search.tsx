import {
  AppBar,
  Toolbar,
  Typography,
  IconButton,
  Box,
  Button,
  TextField
} from "@mui/material";
import search from './search-icon.png'
import styles from './search.module.css'

const SearchBar: React.FC = () => {
  return (
    <Box className={styles.searchBox}>
      <Typography className={styles.searchTitle}>
        Лучшие мастера бьюти вашего города здесь!
      </Typography>

      {/* Контейнер поиска */}
      <Box className={styles.searchContainer}>
        <TextField
          variant="standard"
          placeholder="Мастера, салоны, услуги..."
          InputProps={{ disableUnderline: true }}
          className={styles.searchInput}
        />
        <Button className={styles.searchButton}>
          <img className={styles.searchIcon} src={search} alt="search-icon" />
        </Button>
      </Box>
    </Box>
  );
};

export default SearchBar;