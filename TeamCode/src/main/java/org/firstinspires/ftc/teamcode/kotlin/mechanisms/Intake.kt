package org.firstinspires.ftc.teamcode.kotlin.mechanisms

import dev.nextftc.hardware.actuators.NextMotor
import dev.nextftc.robot.Mechanism

class Intake: Mechanism {
    val intake = NextMotor("intake").apply {direction = NextMotor.Direction.REVERSE}

    fun girar()= infinite {
        intake.throttle = 0.5
    }
    fun pararint()= instant {
        intake.throttle = 0.0
    }
}