package org.firstinspires.ftc.teamcode.kotlin

import dev.nextftc.robot.Mechanism
import dev.nextftc.robot.NextRobot
import org.firstinspires.ftc.teamcode.kotlin.mechanisms.Chassis
import org.firstinspires.ftc.teamcode.kotlin.mechanisms.Intake
import org.firstinspires.ftc.teamcode.kotlin.mechanisms.Shooter

class Robot: NextRobot {
    val chassis = Chassis()

    val intake = Intake()
    val shooter = Shooter()

    override val mechanisms = setOf(chassis, intake, shooter)

}