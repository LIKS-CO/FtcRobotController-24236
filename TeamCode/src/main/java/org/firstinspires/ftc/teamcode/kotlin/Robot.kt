package org.firstinspires.ftc.teamcode.kotlin

import dev.nextftc.robot.Mechanism
import dev.nextftc.robot.NextRobot
import org.firstinspires.ftc.teamcode.kotlin.mechanisms.Chassis
import org.firstinspires.ftc.teamcode.kotlin.mechanisms.Intake

class Robot: NextRobot {
    val chassis = Chassis()

    val intake = Intake()

    override val mechanisms = setOf(chassis, intake)

}