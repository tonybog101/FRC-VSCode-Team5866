/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.claw;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.RobotMap;

/**
 * Close the claw
 */
public class CloseClaw extends InstantCommand {

  public CloseClaw() {
    requires(RobotMap.m_claw);
  }

  @Override
  protected void initialize() {
    RobotMap.m_claw.close();
  }

}
