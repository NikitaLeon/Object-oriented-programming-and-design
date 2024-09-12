package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio rad = new Radio();

        rad.setNewCurrentStation(7);

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationMore() {
        Radio rad = new Radio();

        rad.setNewCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationLess() {
        Radio rad = new Radio();

        rad.setNewCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationAfterMax() {
        Radio rad = new Radio();

        rad.setNewCurrentStation(9);
        rad.setNextCurrentStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStation() {
        Radio rad = new Radio();

        rad.setNewCurrentStation(2);
        rad.setNextCurrentStation();

        int expected = 3;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationAfterLess() {
        Radio rad = new Radio();

        rad.setNewCurrentStation(0);
        rad.setPrevCurrentStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStation() {
        Radio rad = new Radio();

        rad.setNewCurrentStation(2);
        rad.setPrevCurrentStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(55);
        rad.setIncreaseVolume();

        int expected = 56;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeAfterMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.setIncreaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(53);
        rad.setDecreaseVolume();

        int expected = 52;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolumeLessMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeAfterMaxIf() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);
        rad.setIncreaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
