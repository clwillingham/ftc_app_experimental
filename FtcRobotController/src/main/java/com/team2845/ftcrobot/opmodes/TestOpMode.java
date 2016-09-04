package com.team2845.ftcrobot.opmodes;

import com.qualcomm.ftcrobotcontroller.opmodes.Register;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by chris on 9/3/16.
 */
@Register("TestMode")
public class TestOpMode extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor leftDrive = hardwareMap.dcMotor.get("leftDrive");
        DcMotor rightDrive = hardwareMap.dcMotor.get("rightDrive");
        waitForStart();
        leftDrive.setPower(1);
        rightDrive.setPower(-1);
        Thread.sleep(1000);
        leftDrive.setPower(0);
        rightDrive.setPower(0);
    }
}
