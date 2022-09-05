// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.HardwareAdapter;

public class Pneumatics extends SubsystemBase implements HardwareAdapter {

/** Creates a new ExampleSubsystem. */
  public Pneumatics() {
    CloseValves();
  }

  public void FireLeft(){
    left.set(false);
    left.set(true);
  }
  
  public void FireRight(){
    right.set(false);
    right.set(true);
  }
  public void FireMiddle(){
    middle.set(false);
    middle.set(true);
  }
  public void CloseValves(){
    middle.set(true);
    left.set(true);
    right.set(true);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
