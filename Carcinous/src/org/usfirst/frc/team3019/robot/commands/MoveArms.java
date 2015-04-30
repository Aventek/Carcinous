package org.usfirst.frc.team3019.robot.commands;

import org.usfirst.frc.team3019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MoveArms extends Command {

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires(Robot.elevatorArms);
	}

	@Override
	protected void execute() {
		double speed = 0;
		if(Robot.oi.xbox.getRawAxis(2) > .2)
			speed = Robot.oi.xbox.getRawAxis(2);
		else if(Robot.oi.xbox.getRawAxis(3) > .2)
			speed = Robot.oi.xbox.getRawAxis(3);
		else
			speed = 0;
		Robot.elevatorArms.setSpeed(speed);
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
