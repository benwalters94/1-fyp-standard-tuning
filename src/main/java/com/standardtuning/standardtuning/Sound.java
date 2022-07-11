package com.standardtuning.standardtuning;
import javax.sound.midi.*;

public class Sound{

    Synthesizer synthesizer;
    Instrument[] instr;
    MidiChannel[] mChannels;

    public Sound() throws MidiUnavailableException {
        synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        instr = synthesizer.getDefaultSoundbank().getInstruments();
        mChannels = synthesizer.getChannels();
        synthesizer.loadInstrument(instr[1]);
        mChannels[0].programChange(25);
    }

    public void one(){

        mChannels[0].noteOn(40, 100);

    }

    public void two(){

        mChannels[0].noteOn(45, 100);

    }

    public void three(){

        mChannels[0].noteOn(50, 100);

    }

    public void four(){

        mChannels[0].noteOn(55, 100);

    }

    public void five(){

        mChannels[0].noteOn(59, 100);

    }

    public void six(){

        mChannels[0].noteOn(64, 100);

    }


}
