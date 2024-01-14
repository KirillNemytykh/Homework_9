package ru.netology.javaqa;

public class Radio {
    private int radioStation;
    private int volumeLevel;
    private int numberOfStations = 10;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }
    public Radio() {
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation >= numberOfStations) {
            newRadioStation = numberOfStations -1;
        }
        if (newRadioStation <= 0) {
            newRadioStation = 0;
        }
        radioStation = newRadioStation;

    }

    public void next() {
        if (radioStation == numberOfStations - 1) {
            radioStation = 0;
        } else {
            radioStation++;
        }
    }

    public void prev() {
        if (radioStation <= 0 ) {
            radioStation = numberOfStations - 1;
        } else {
            radioStation = radioStation - 1;
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int newVolumeLevel) {
        if (newVolumeLevel >= 100) {
            newVolumeLevel = 100;
        }
        if (newVolumeLevel <= 0) {
            newVolumeLevel = 0;
        }
        volumeLevel = newVolumeLevel;
    }


    public void volumeUp() {
        if (volumeLevel == 100) {
            volumeLevel = 100;
        } else {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (volumeLevel == 0) {
            volumeLevel = 0;
        } else {
            volumeLevel = volumeLevel - 1;
        }
    }
}





