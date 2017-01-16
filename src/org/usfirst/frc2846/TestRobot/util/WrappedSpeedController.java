package org.usfirst.frc2846.TestRobot.util;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class WrappedSpeedController implements SpeedController {

	final SpeedController speedController;
	final String name;

	public WrappedSpeedController(SpeedController speedController, String controllerName) {
		this.speedController = speedController;
		this.name = controllerName;
	}

	@Override
	public void pidWrite(double output) {
		speedController.pidWrite(output);
	}

	@Override
	public double get() {
		return speedController.get();
	}

	@Override
	public void set(double speed) {
		SmartDashboard.putNumber("Controller." + name, speed);
		speedController.set(speed);
	}

	@Override
	public void setInverted(boolean isInverted) {
		speedController.setInverted(isInverted);
	}

	@Override
	public boolean getInverted() {
		return speedController.getInverted();
	}

	@Override
	public void disable() {
		speedController.disable();
	}

	@Override
	public void stopMotor() {
		speedController.stopMotor();
	}

}
