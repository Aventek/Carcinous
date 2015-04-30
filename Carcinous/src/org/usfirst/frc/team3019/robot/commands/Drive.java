package org.usfirst.frc.team3019.robot.commands;

import org.usfirst.frc.team3019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires(Robot.driveTrain);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.driveTrain.arcadeDrive(Robot.oi.stick.getY(), Robot.oi.stick.getTwist());
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}