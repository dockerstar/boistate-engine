package com.dockerstar.Tests;

import java.time.LocalDateTime;

public class BloodTest extends MedicalTest implements AnalysisResult {

    public BloodTest(LocalDateTime testDate, String laboratoryName) {
        super(testDate, laboratoryName);
    }


    @Override
    public String interpret() {
        return "Анализы крови в норме";
    }
}
