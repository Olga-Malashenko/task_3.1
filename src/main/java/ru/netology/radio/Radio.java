package ru.netology.radio;

public class Radio {

    private int currentStation;                     // Поля
    private int numberOfStations = 10;
    private int maxStation = numberOfStations - 1; // не понимаю пока,
    // куда эту строчку воткнуть, чтоб не дублировать


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


    public void setToMaxStation(int maxStation) {
        this.currentStation = maxStation;
    }

//    public int getToMaxStation() {
//        return maxStation;
//    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
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
        this.currentStation = 0;
    }

    public void setToPrevStation() {
        if (currentStation > 0) {
            this.currentStation -= 1;
            return;
        }
        this.currentStation = maxStation;
    }

//    private int currentVolume;
//
//    public int getCurrentVolume() {
//        return currentVolume;
//    }
//
//    public void setCurrentVolume(int currentVolume) {
//        if (currentVolume < 0) {
//            return;
//        }
//        if (currentVolume > 10) {
//            return;
//        }
//        this.currentVolume = currentVolume;
//    }
//    // В задании нет этого метода,
//    // но я пришла к выводу, что он нобходим. Ход мыслей к комментариях к тесту.
//    // Правильные ли там рассуждения, или я до чего-то не додумалась?
//
//    public void increaseVolume() {
//        if (currentVolume == 10) {
//            return;
//        }
//        this.currentVolume += 1;
//    }
//
//    public void decreaseVolume() {
//        if (currentVolume == 0) {
//            return;
//        }
//        this.currentVolume -= 1;
//    }
}
