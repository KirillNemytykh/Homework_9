package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setRadioStation(10);
        int actual = radio.getRadioStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationAcceptable() {
        Radio radio = new Radio();
        radio.setRadioStation(7);
        int actual = radio.getRadioStation();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationLowerMin() {
        Radio radio = new Radio();
        radio.setRadioStation(-10);
        int actual = radio.getRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLevelAccepteble() {
        Radio radio = new Radio();
        radio.setVolumeLevel(54);
        int actual = radio.getVolumeLevel();
        int expected = 54;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLevelLowerMin() {
        Radio radio = new Radio();
        radio.setVolumeLevel(-10);
        int actual = radio.getVolumeLevel();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLevelAboveMax() {
        Radio radio = new Radio();
        radio.setVolumeLevel(140);
        int actual = radio.getVolumeLevel();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextButtonAcceptableRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStation(6);
        radio.next();
        int actual = radio.getRadioStation();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextButtonOverMaxRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.next();
        int actual = radio.getRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevButtonAcceptableRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStation(6);
        radio.prev();
        int actual = radio.getRadioStation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevButtonLowerMinRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prev();
        int actual = radio.getRadioStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpButtonAcceptableRVolumeLevel() {
        Radio radio = new Radio();
        radio.setVolumeLevel(55);
        radio.volumeUp();
        int actual = radio.getVolumeLevel();
        int expected = 56;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpButtonOverAcceptableVolumeLevel() {
        Radio radio = new Radio();
        radio.setVolumeLevel(100);
        radio.volumeUp();
        int actual = radio.getVolumeLevel();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownButtonLowerAcceptableVolumeLevel() {
        Radio radio = new Radio();
        radio.setVolumeLevel(0);
        radio.volumeDown();
        int actual = radio.getVolumeLevel();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownButtonAcceptableVolumeLevel() {
        Radio radio = new Radio();
        radio.setVolumeLevel(44);
        radio.volumeDown();
        int actual = radio.getVolumeLevel();
        int expected = 43;
        Assertions.assertEquals(expected, actual);
    }

}
