package ru.netology.radio;

public class Radio {

    private int currentStation;                     // Поля
    private int numberOfStations = 10;
    private final int minStation = 0;
    private int maxStation = numberOfStations - 1;

    private int currentVolume;
    private final int minVolute = 0;
    private final int maxVolume = 100;


    public Radio() {                            //  Конструкторы
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.maxStation = numberOfStations - 1;
    }


    public void setNumberOfStations(int numberOfStations) {             // Методы
        if (numberOfStations <= 0) {
            this.numberOfStations = 10; // устанавливаем на этот случай дефолтное значение
            return;
        }
        this.numberOfStations = numberOfStations ;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }


//    public void setToMaxStation(int maxStation) {
//        this.currentStation = maxStation;
//    }

//    public int getToMaxStation() {
//        return maxStation;
//    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setToNextStation() {
        if (currentStation < maxStation) {
            this.currentStation += 1;
            return;
        }
        this.currentStation = minStation;
    }

    public void setToPrevStation() {
        if (currentStation > minStation) {
            this.currentStation -= 1;
            return;
        }
        this.currentStation = maxStation;
    }



    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {  // метод нужен для тестирования
        if (currentVolume < minVolute) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume == maxVolume ) {
            return;
        }
        this.currentVolume += 1;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolute) {
            return;
        }
        this.currentVolume -= 1;
    }
}
