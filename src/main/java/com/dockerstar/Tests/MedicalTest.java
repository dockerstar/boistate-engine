package com.dockerstar.Tests;

import java.time.LocalDateTime;

public abstract class MedicalTest {
    private LocalDateTime testDate;
    private String laboratoryName;

    public MedicalTest(LocalDateTime testDate, String laboratoryName) {
        this.testDate = testDate;
        this.laboratoryName = laboratoryName;
    }

    public String getTest() {
        return String.format("%s : %s", testDate, laboratoryName);
    }
}
