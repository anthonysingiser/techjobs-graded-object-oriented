package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

     
    public Job() {
        this.id = nextId;
        nextId++;
    }

    
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // calling the first constructor to initialize id
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    // Custom equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Custom toString method
    @Override
    public String toString() {
        return System.lineSeparator() +
                "ID: " + this.getId() + System.lineSeparator() +
                "Name: " + (this.getName().isEmpty() ? "Data not available" : this.getName()) + System.lineSeparator() +
                "Employer: " + (this.getEmployer().getValue().isEmpty() ? "Data not available" : this.getEmployer().getValue()) + System.lineSeparator() +
                "Location: " + (this.getLocation().getValue().isEmpty() ? "Data not available" : this.getLocation().getValue()) + System.lineSeparator() +
                "Position Type: " + (this.getPositionType().getValue().isEmpty() ? "Data not available" : this.getPositionType().getValue()) + System.lineSeparator() +
                "Core Competency: " + (this.getCoreCompetency().getValue().isEmpty() ? "Data not available" : this.getCoreCompetency().getValue()) + System.lineSeparator();
    }
}
