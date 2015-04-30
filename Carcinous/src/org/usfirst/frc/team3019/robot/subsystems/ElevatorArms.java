package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.commands.MoveArms;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ElevatorArms  extends Subsystem{

	Talon ElevatorArms;
	public ElevatorArms() {
		// TODO Auto-generated constructor stub
	super();
		ElevatorArms = new Talon(3);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new MoveArms());
	}
	public void setSpeed(double speed){
		ElevatorArms.set(speed);
	}

}
