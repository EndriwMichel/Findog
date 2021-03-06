package com.example.endriw.map_v21;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

/**
 * Created by Endriw on 01/06/2016.
 */
public class ownCachorro {

    private String latitude;
    private String longitude;
    private String dogData;
    private String dogFoto;
    private String dogNome;
    private String dogHash;
    private String dogCor;
    private String dogPorte;
    private String dogCel;

    public ownCachorro(){
    }

    public ownCachorro(String latitude, String longitude, String dogData, String dogFoto, String dogNome, String dogHash, String dogCor,  String dogPorte, String dogCel){
        this.latitude  = latitude;
        this.longitude = longitude;
        this.dogData   = dogData;
        this.dogFoto   = dogFoto;
        this.dogNome   = dogNome;
        this.dogHash   = dogHash;
        this.dogCor    = dogCor;
        this.dogPorte  = dogPorte;
        this.dogCel    = dogCel;
    }


    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getDogData() {
        return dogData;
    }

    public String getDogFoto() {
        return dogFoto;
    }

    public String getDogNome() {
        return dogNome;
    }

    public String getDogHash() {
        return dogHash;
    }

    public String getDogCor() {
        return dogCor;
    }

    public String getDogPorte() {
        return dogPorte;
    }

    public String getDogCel() {
        return dogCel;
    }
}
