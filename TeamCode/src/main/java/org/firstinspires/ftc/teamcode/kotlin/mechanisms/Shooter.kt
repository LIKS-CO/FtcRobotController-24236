package org.firstinspires.ftc.teamcode.kotlin.mechanisms

import dev.nextftc.hardware.actuators.NextMotor
import dev.nextftc.robot.Mechanism

class Shooter: Mechanism {
    val shooter = NextMotor("shooter")

    fun disparar()= infinite {
        shooter.throttle = 0.9
    }
    fun altoAlFuego()= instant {
        shooter.throttle = 0.0
    }
}