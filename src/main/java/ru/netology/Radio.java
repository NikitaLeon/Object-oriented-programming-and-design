package ru.netology;
public class Radio {
    private int currentStation;
    private int currentVolume;
    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setNewCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void setNextCurrentStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        else {
            currentStation = 0;
        }
    }
    public void setPrevCurrentStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        else {
            currentStation = 9;
        }
    }
    public void setIncreaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        else {
            currentVolume = 100;
        }
    }
    public void  setDecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        else {
            currentVolume = 0;
        }
    }
}
