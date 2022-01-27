package ru.netology.radio;

//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/dataStationsNumber.csv")
    void shouldUseConstructer(String test, int numberOfStations, int expected) {
        Radio radio = new Radio(numberOfStations);
        radio.setNumberOfStations(numberOfStations);
        int actual = radio.getNumberOfStations();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data1.csv")
    void shouldSetCurrentStationForDefolt(String test, int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/data1-2.csv")
    void shouldSetCurrentStationForSetting(String test, int numberOfStations, int currentStation, int expected) {
        Radio radio = new Radio(numberOfStations);
        radio.setCurrentStation(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data2.csv")
    void shouldSetToNextStationForDefolt(String test, int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.setToNextStation();

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data2-2.csv")
    void shouldSetToNextStationForSetting(String test, int numberOfStation, int currentStation, int expected) {
        Radio radio = new Radio(numberOfStation);
        radio.setCurrentStation(currentStation);
        radio.setToNextStation();

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data3.csv")
    void setToPrevStationForDefolt(String test, int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.setToPrevStation();

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data3-3.csv")
    void setToPrevStationForSetting(String test, int numberOfStation, int currentStation, int expected) {
        Radio radio = new Radio(numberOfStation);
        radio.setCurrentStation(currentStation);
        radio.setToPrevStation();

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data4.csv")
    void shouldSetCurrentVolume(String test, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data5.csv")
    void shouldIncreaseVolume(String test, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data6.csv")
    void shouldDecreaseVolume(String test, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}