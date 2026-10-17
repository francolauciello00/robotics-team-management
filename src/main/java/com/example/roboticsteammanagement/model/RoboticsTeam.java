package com.example.roboticsteammanagement.model;

public class RoboticsTeam {

    private String teamName;
    private String teamNumber;
    private int numStudents;


    public RoboticsTeam(String teamName, String teamNumber, int numStudents) {

        if (numStudents < 0) {
            throw new IllegalArgumentException("Number of students cannot be negative");
        }

        this.teamName = teamName;
        this.teamNumber = teamNumber;
        this.numStudents = numStudents;

    }

    public String getTeamName() {
        return teamName;
    }
    public String getTeamNumber() {
        return teamNumber;
    }
    public int getNumStudents() {
        return numStudents;
    }
    public void setNumStudents(int numStudents) {
        if (numStudents > 0) {
            this.numStudents = numStudents;
        }else  {
            throw new IllegalArgumentException("Number of students cannot be negative");
        }
    }

}
