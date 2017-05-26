package org.usfirst.frc5124.WestTorranceSwagbotics.commands;

import org.usfirst.frc5124.WestTorranceSwagbotics.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CatapultLaunch extends Command {

    public CatapultLaunch() {
        requires(Robot.catapult);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.catapult.launch();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
