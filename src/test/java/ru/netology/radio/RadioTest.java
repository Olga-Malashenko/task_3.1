//package ru.netology.radio;
//
////import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class RadioTest {
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "/data1.csv")
//    void shouldSetCurrentStation(String test, int currentStation, int expected) {
//        Radio radio = new Radio();
//        radio.setCurrentStation(currentStation);
//
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "/data2.csv")
//    void shouldSetToNextStation(String test, int currentStation, int expected) {
//        Radio radio = new Radio();
//        radio.setCurrentStation(currentStation);
//        radio.setToNextStation();
//
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "/data3.csv")
//    void setToPrevStation(String test, int currentStation, int expected) {
//        Radio radio = new Radio();
//        radio.setCurrentStation(currentStation);
//        radio.setToPrevStation();
//
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "/data4.csv")
//    void shouldSetCurrentVolume(String test, int currentVolume, int expected) {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(currentVolume);
//
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "/data5.csv")
//    void shouldIncreaseVolume(String test, int currentVolume, int expected) {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(currentVolume);
//        radio.increaseVolume();
//
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "/data6.csv")
//    void shouldDecreaseVolume(String test, int currentVolume, int expected) {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(currentVolume);
//        radio.decreaseVolume();
//
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//}