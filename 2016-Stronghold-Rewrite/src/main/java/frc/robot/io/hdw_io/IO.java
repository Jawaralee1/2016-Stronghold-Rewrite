package frc.robot.io.hdw_io;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.PWMSpeedController;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

// import com.revrobotics.ColorSensorV3;

/* temp to fill with latest faults */
import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;

public class IO {
    // PDP
    public static PowerDistributionPanel pdp = new PowerDistributionPanel(21);

    // Air
    public static Compressor compressor = new Compressor(22);
    public static Relay compressorRelay = new Relay(0);

    // Drive
    public static PWM leftDrv = new PWM(0); // Cmds left wheels
    public static PWM rightDrv = new PWM(1); // Cmds right wheels
    //public static DifferentialDrive diffDrv = new DifferentialDrive(leftDrv, leftDrv);
    
    public static DigitalInput bottomSwitch = new DigitalInput(0);
    public static Solenoid redLed = new Solenoid(6);
    public static DigitalInput middleSwitch = new DigitalInput(1);
    public static Solenoid blueLed = new Solenoid(0);
    public static DigitalInput upperSwitch = new DigitalInput(2);
    public static Solenoid yellowLed = new Solenoid(7);

    // Snorfler
    // public static Victor snorfFeedMain = new Victor(9);
    // public static Victor snorfFeedScdy = new Victor(6);
    // public static ISolenoid snorflerExt = new InvertibleSolenoid(22, 6); // Extends both feeders
    // public static InvertibleDigitalInput snorfHasBall = new InvertibleDigitalInput(2, false);

    // // Climb
    // public static Victor climberHoist = new Victor(3); // Extends climber
    // public static ISolenoid climberExt = new InvertibleSolenoid(22, 7);

  
    // public static ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);

    // Initialize any hardware here
    public static void init() {
    }

    public static void update() {
        
    }

}
