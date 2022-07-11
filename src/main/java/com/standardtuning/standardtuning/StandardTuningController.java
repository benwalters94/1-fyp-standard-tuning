package com.standardtuning.standardtuning;


import javafx.fxml.FXML;

import javax.sound.midi.MidiUnavailableException;

public class StandardTuningController {

    Sound sound;

    public StandardTuningController() throws MidiUnavailableException {

        sound = new Sound();

    }

    @FXML
    protected void stringOne(){

        sound.one();

    }

    @FXML
    protected void stringTwo(){

        sound.two();

    }

    @FXML
    protected void stringThree(){

        sound.three();

    }

    @FXML
    protected void stringFour(){

        sound.four();

    }

    @FXML
    protected void stringFive(){

        sound.five();

    }

    @FXML
    protected void stringSix(){

        sound.six();

    }

}