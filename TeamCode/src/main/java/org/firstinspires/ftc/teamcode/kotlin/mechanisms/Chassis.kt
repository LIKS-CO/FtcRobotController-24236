package org.firstinspires.ftc.teamcode.kotlin.mechanisms

import com.qualcomm.robotcore.hardware.Gamepad
import dev.nextftc.hardware.actuators.NextMotor
import dev.nextftc.robot.Mechanism
import dev.nextftc.robot.drive.mecanumDrive
import dev.nextftc.robot.triggers.CommandGamepad

class Chassis: Mechanism {
    val lf = NextMotor("LF")
    val lb = NextMotor("LB").apply {direction = NextMotor.Direction.REVERSE }
    val rf = NextMotor("RF")
    val rb = NextMotor("RB").apply {direction = NextMotor.Direction.REVERSE }
    val inta = NextMotor("in")

    fun startDrive(gamepad: Gamepad) {
        mecanumDrive(lf, rf, lb, rb, gamepad).schedule()
    }
    fun parar()= instant {
        lf.throttle = 0.0
        lb.throttle = 0.0
        rf.throttle = 0.0
        rb.throttle = 0.0
    }

}