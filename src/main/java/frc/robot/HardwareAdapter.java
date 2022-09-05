package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.PowerDistribution;
import edu.wpi.first.wpilibj.Solenoid;


public interface HardwareAdapter extends Constants {
    public static final PowerDistribution pdp = new PowerDistribution(); 
    public static final PneumaticsControlModule pcm = new PneumaticsControlModule();

    public final TalonSRX leftLeader= new TalonSRX(fL_Talon);
    public final TalonSRX leftFollower = new TalonSRX(bL_Talon);
    public final TalonSRX rightLeader = new TalonSRX(fR_Talon);
    public final TalonSRX rightFollower= new TalonSRX(bR_Talon);


    public final Solenoid left = new Solenoid(PneumaticsModuleType.CTREPCM, l_Solenoid);
    public final Solenoid middle = new Solenoid(PneumaticsModuleType.CTREPCM, m_Solenoid);
    public final Solenoid right = new Solenoid(PneumaticsModuleType.CTREPCM, r_Solenoid);
    
}
