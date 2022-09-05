package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.HardwareAdapter;
public class Drivetrain extends SubsystemBase implements HardwareAdapter {
    public Drivetrain(){
        leftFollower.follow(leftLeader);
        rightFollower.follow(rightLeader);
        setBrakeMode();
    }    
    private void setBrakeMode() {
        leftLeader.setNeutralMode(NeutralMode.Brake);
        leftFollower.setNeutralMode(NeutralMode.Brake);

        rightLeader.setNeutralMode(NeutralMode.Brake);
        rightFollower.setNeutralMode(NeutralMode.Brake);
      }
    public void tankDrive(double left, double right){
        leftLeader.set(ControlMode.PercentOutput, left);
        rightLeader.set(ControlMode.PercentOutput, right);
    }
    public void arcadeDrive(double y, double x){
        leftLeader.set(ControlMode.PercentOutput, y - x);
        rightLeader.set(ControlMode.PercentOutput, y + x);
    }
}
