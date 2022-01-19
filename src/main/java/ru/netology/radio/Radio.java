package ru.netology.radio;

public class Radio {

    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setToNextStation() {
        if (currentStation < 9) {
            this.currentStation += 1;
            return;
        }
        this.currentStation = 0;
    }

    public void setToPrevStation() {
        if (currentStation > 0) {
            this.currentStation -= 1;
        }
        else this.currentStation = 9;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    // В задании нет этого метода,
    // но я пришла к выводу, что он нобходим. Ход мыслей к комментариях к тесту.
    // Правильные ли там рассуждения, или я до чего-то не додумалась?

    public void increaseVolume() {
        if (currentVolume == 10) {
            return;
        }
        this.currentVolume += 1;
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        }
        this.currentVolume -= 1;
    }
}