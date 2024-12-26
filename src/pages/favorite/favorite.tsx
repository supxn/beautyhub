import styles from "./favorite.module.scss";
import rose from "./rose.png"

const FavoritePage: React.FC = () => {
    return(
        <div>
            <img src={rose} alt="Простите..." style={{ width: '50%', height: 'auto', paddingLeft: '4%'}} />
            <h3 style={{paddingLeft: '4%'}}>упс... Страница в разработке!!!1!</h3>
        </div>
    );
}

export default FavoritePage