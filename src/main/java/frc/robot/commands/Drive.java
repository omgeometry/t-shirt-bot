package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.HardwareAdapter;
import frc.robot.RobotContainer;

public class Drive extends CommandBase implements HardwareAdapter {
    public Drive(){
        addRequirements(RobotContainer.dt);
    }
      // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double SPEED_MULTIPLIER = 0.49;
    double TURN_MULTIPLIER = 0.49;
    RobotContainer.dt.arcadeDrive(SPEED_MULTIPLIER * RobotContainer.joystick.getSmartX() , TURN_MULTIPLIER *  RobotContainer.joystick.getSmartY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

