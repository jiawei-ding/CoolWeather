package com.example.coolweather.db;
import org.litepal.crud.LitePalSupport;

public class Country extends LitePalSupport {
    //Country类，用来存放县的数据信息
    //countryName:县名
    //weatherId:天气
    //cityId:城市id
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(){
        this.id=id;
    }

    public String getCountryName(){
        return countryName;
    }

    public void setCountryName(String countryName){
        this.countryName=countryName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
