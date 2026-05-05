package com.dockerstar.Tests;

import java.time.LocalDateTime;

public class UrineTest extends MedicalTest implements AnalysisResult{
    public UrineTest(LocalDateTime testDate, String laboratoryName) {
        super(testDate, laboratoryName);
    }

    @Override
    public String interpret() {
        return "Анализы мочи в норме!";
    }
}
