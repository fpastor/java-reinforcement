//
//  Student.java
//  students
//
//  Created by Fernando Pastor on 06/08/2024
//

public class Student {


    private String name;
    private int age;
    private Gender gender;
    private double height;
    private double weight;
    private Notes notes;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.height = builder.height;
        this.weight = builder.weight;
        this.notes = builder.notes;
    }

    public static class Builder {
        private String name;
        private int age;
        private Gender gender;
        private double height;
        private double weight;
        private Notes notes;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setNotes(Notes notes) {
            this.notes = notes;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public String getName() {
        return name;
    }

    public Notes getNotes() {
        return notes;
    }

    public double getIMC() {
        return weight / Math.pow(height,2);
    }

    public double getAverageQualification() {
        return notes.getAverageQualification();
    }

}
