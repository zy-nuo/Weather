package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Suggestion suggestion;

    public Now now;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
