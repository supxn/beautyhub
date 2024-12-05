import React from "react";
import styles from "./mainPage.module.scss";
import { Box } from "@mui/material";

import Search from "../../components/Search/Search"
import BrowsComp from "../../components/ServicesGrids/ServicesComp"

const mainPage: React.FC = () => {
    return(
        <Box className={styles.search}>
            <Search />
            <BrowsComp />
        </Box>
    );
}

export default mainPage;
