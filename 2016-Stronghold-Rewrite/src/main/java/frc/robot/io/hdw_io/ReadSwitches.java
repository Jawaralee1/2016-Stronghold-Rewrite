package frc.robot.io.hdw_io;

public class ReadSwitches {

    public static void update () {

        frc.robot.Robot.bottomSwitch.get();

        frc.robot.Robot.middleSwitch.get();

        frc.robot.Robot.upperSwitch.get();

        frc.robot.Robot.redLed.set( frc.robot.Robot.bottomSwitch.get());

        frc.robot.Robot.blueLed.set(frc.robot.Robot.middleSwitch.get());

        frc.robot.Robot.yellowLed.set(frc.robot.Robot.upperSwitch.get());
         
        
     
    }
}
