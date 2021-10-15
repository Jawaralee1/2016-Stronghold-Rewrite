package frc.robot.subsystem;

import frc.robot.io.hdw_io.IO;

public class ReadSwitches {

    public static void update () {

        IO.bottomSwitch.get();
        

        IO.middleSwitch.get();

        IO.upperSwitch.get();

        IO.redLed.set( IO.bottomSwitch.get());

        IO.blueLed.set(IO.middleSwitch.get());

        IO.yellowLed.set(IO.upperSwitch.get());
         
        
     
    }
}
