package frc.libs;

import edu.wpi.first.wpilibj.Joystick;

public class SmoothJoystick extends Joystick {
    private static double throttle;
    public SmoothJoystick(int port){
        super(port);
    }
    public double getSmartX() {
		getThrottle();
		return Math.pow(super.getRawAxis(0), 3) * throttle;
	}
	
	public double getSmartY() {
		getThrottle();
		return Math.pow(super.getRawAxis(1), 3) * throttle;
	}

	// Gets the rotation of the joystick along the Z-axis
	public double getSmartZ() {
		getThrottle();
		return Math.pow(super.getRawAxis(2), 3) * throttle ; // May need to switch to getZ()
	}

	// Gets the magnitude of the joystick, cubes it, and multiplies it by 4
	public double getSmartMag() {
		return (Math.pow(super.getMagnitude(), 3) * 4);
	}
	
	public double getThrottle(){
		return throttle = (super.getRawAxis(3) + 1) / 2;
	}
}
