package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.commands.Elevate;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator  extends Subsystem{

	Talon bottom;
	public Elevator() {
		// TODO Auto-generated constructor stub
	super();
		bottom = new Talon(2);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new Elevate());
	}
	public void setSpeed(double speed){
		bottom.set(speed);
	}
}
