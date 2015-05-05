package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.RobotMap;
import org.usfirst.frc.team3019.robot.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem{
	Talon Right;
	Talon Left;
	RobotDrive drive;
	public DriveTrain() {
	// TODO Auto-generated constructor stub
	super();
		Right = new Talon(0);
		Left = new Talon(1);
		drive = new RobotDrive(Left, Right);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new Drive());
	}
	public void arcadeDrive(double moveValue, double rotateValue){
		drive.arcadeDrive(-moveValue * RobotMap.DRIVE_NERF, rotateValue * RobotMap.TURN_NERF);
	}
}
