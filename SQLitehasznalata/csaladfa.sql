/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  diak
 * Created: 2023. okt. 3.

 *  szemelyek(az*, nev, szdatum, szhely)
 *  gyerekek(sorszam*, az, anya, apa)
 *  hazassagok(sorszam*, ferj, feleseg, eskuvo, megszunes)
 *  temetesek(az*, idopont, helyszin)
 */

CREATE TABLE szemelyek(
    az INTEGER PRIMARY KEY AUTO_INCREMENT,
    nev VARCHAR(30),
    szdatum DATE,
    szhely VARCHAR(25)
);
CREATE TABLE gyerekek(
    sorszam INTEGER PRIMARY KEY AUTO_INCREMENT,
    az INTEGER,
    anya INTEGER,
    apa INTEGER,
    FOREIGN KEY (az) REFERENCES szemelyek(az),
    FOREIGN KEY (anya) REFERENCES szemelyek(az),
    FOREIGN KEY (apa) REFERENCES szemelyek(az)
);

