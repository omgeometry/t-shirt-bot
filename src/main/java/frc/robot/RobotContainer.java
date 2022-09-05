// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.libs.SmoothJoystick;
import frc.robot.commands.Drive;
import frc.robot.commands.Pneumatics.FireAll;
import frc.robot.commands.Pneumatics.FireLeft;
import frc.robot.commands.Pneumatics.FireMiddle;
import frc.robot.commands.Pneumatics.FireRight;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Pneumatics;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer implements Constants{
  // The robot's subsystems and commands are defined here...
  public static final Pneumatics pn = new Pneumatics();
  public static final Drivetrain dt = new Drivetrain();
  public static final SmoothJoystick joystick = new SmoothJoystick(joystick_Drive);
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    new JoystickButton(joystick, 1).whenPressed(new FireLeft());
    new JoystickButton(joystick, 2).whenPressed(new FireRight());
    new JoystickButton(joystick, 3).whenPressed(new FireMiddle());
    new JoystickButton(joystick, 4).whenPressed(new FireAll(.5));

    dt.setDefaultCommand(new Drive());


  }
  
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
