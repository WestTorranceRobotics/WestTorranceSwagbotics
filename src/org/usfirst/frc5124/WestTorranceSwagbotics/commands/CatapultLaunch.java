package org.usfirst.frc5124.WestTorranceSwagbotics.commands;

import org.usfirst.frc5124.WestTorranceSwagbotics.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CatapultLaunch extends Command {

    public CatapultLaunch() {
        requires(Robot.catapult);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.catapult.launch();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
