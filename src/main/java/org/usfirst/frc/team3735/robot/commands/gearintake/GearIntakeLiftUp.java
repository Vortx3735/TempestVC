package org.usfirst.frc.team3735.robot.commands.gearintake;

import org.usfirst.frc.team3735.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class GearIntakeLiftUp extends InstantCommand {

    public GearIntakeLiftUp() {
        super();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        //requires(Robot.gearIntake);
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.gearIntake.liftUp();
    }

}
