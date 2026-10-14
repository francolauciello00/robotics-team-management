package com.example.roboticsteammanagement.model;

public class RoboticsTeam {

    private String teamName;
    private String teamNumber;
    private int numStudents;


    public RoboticsTeam(String teamName, String teamNumber, int numStudents) {

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

}
