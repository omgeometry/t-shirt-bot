package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
**/ 
public interface Constants {
	/***************
	 * VARIABLES *
	************** */

	
	/******************
	 * MOTOR CHANNELS *
	 ******************/
	// Ports for the talons
	public static final int fL_Talon = 9;
	public static final int fR_Talon = 6;
	public static final int bL_Talon = 8;
	public static final int bR_Talon = 7;
	public static final int lift_Talon = 5;

	/***************
	 * DIGITAL I/O *
	 ***************/
	// Ports for PDP feedback
	public static final int p_FL_Talon = 0;
	public static final int p_FR_Talon = 15;
	public static final int p_BL_Talon = 3;
	public static final int p_BR_Talon = 12;
	public static final int p_Lift_Talon = 13;

	/**************
	 * PNEUMATICS *
	 **************/
	// Ports for the solenoids
	public static final int l_Solenoid = 2;
		public static final int m_Solenoid = 1;
		public static final int r_Solenoid = 0;

	/******************
	 * JOYSTICK PORTS *
	 ******************/
	public static final int joystick_Drive = 0;

	/***********
	 * BUTTONS *
	 ***********/
	// Current control-scheme is temporary at best

	// Trigger and thumb-button are used for firing-functions
	public static final int toggle_Lights = 1;
	public static final int toggle_Sound = 2;

	// Buttons on top are used for controlling lights
	public static final int fire_Left = 5;
	public static final int fire_Middle = 3;
	public static final int fire_Right = 4;
	public static final int fire_Salvo = 6;

	/******************
	 * PID CONTROLLER *
	 ******************/

}
