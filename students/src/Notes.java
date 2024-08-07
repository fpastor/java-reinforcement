//
//  Notes.java
//  students
//
//  Created by Fernando Pastor on 06/08/2024
//

import java.util.HashMap;
import java.util.ArrayList;

public class Notes {

    private HashMap<Subject, ArrayList<Double>> reportCard = new HashMap<>();

    Notes() {
    }

    public Notes addQualification(Subject subject, double qualification) {
        if(reportCard.containsKey(subject)) {
            reportCard.get(subject).add(qualification);
        }
        else {
            ArrayList<Double> qualificationList = new ArrayList<>();
            qualificationList.add(qualification);
            reportCard.put(subject, qualificationList);
        }
        return this;
    }

    public Double getQualificationForSubject(Subject subject) {
        if (reportCard.containsKey(subject)) {
            ArrayList<Double> qualificationList = reportCard.get(subject);
            double qualificationSum = 0;
            for (Double d : qualificationList) {
                qualificationSum = qualificationSum + d;
            }
            return qualificationSum / qualificationList.size();
        }
        return null;
    }

    public Double getAverageQualification() {
        Subject[] subjects = Subject.values();
        double qualificationsSum = 0;

        for (Subject subject : subjects)
            qualificationsSum += getQualificationForSubject(subject);

        return qualificationsSum / subjects.length;
    }

    public Subject getSubjectWithHigherQualification() {
        Subject resultSubject = null;
        double resultQualification = Double.MIN_VALUE;

        for (HashMap.Entry<Subject, ArrayList<Double>> entry : reportCard.entrySet()) {
            Subject subject = entry.getKey();
            double qualification = this.getQualificationForSubject(subject);
            if (qualification > resultQualification) {
                resultQualification = qualification;
                resultSubject = subject;
            }
        }
        return  resultSubject;
    }

    public Subject getSubjectWithLowerQualification() {
        Subject resultSubject = null;
        double resultQualification = Double.MAX_VALUE;

        for (HashMap.Entry<Subject, ArrayList<Double>> entry : reportCard.entrySet()) {
            Subject subject = entry.getKey();
            double qualification = this.getQualificationForSubject(subject);
            if (qualification < resultQualification) {
                resultQualification = qualification;
                resultSubject = subject;
            }
        }
        return  resultSubject;
    }

    public double getHigherQualification() {
        double resultQualification = Double.MIN_VALUE;

        for (HashMap.Entry<Subject, ArrayList<Double>> entry : reportCard.entrySet()) {
            Subject subject = entry.getKey();
            double qualification = this.getQualificationForSubject(subject);
            if (qualification > resultQualification) {
                resultQualification = qualification;
            }
        }
        return  resultQualification;
    }

    public double getLowerQualification() {
        double resultQualification = Double.MAX_VALUE;

        for (HashMap.Entry<Subject, ArrayList<Double>> entry : reportCard.entrySet()) {
            Subject subject = entry.getKey();
            double qualification = this.getQualificationForSubject(subject);
            if (qualification < resultQualification) {
                resultQualification = qualification;
            }
        }
        return  resultQualification;
    }

    public static Notes clone(Notes notes) {
        Notes cloneNotes = new Notes();
        for (HashMap.Entry<Subject, ArrayList<Double>> entry : notes.reportCard.entrySet()) {
            Subject subject = entry.getKey();
            ArrayList<Double> qualifications = entry.getValue();
            for (double qualification : qualifications) {
                cloneNotes.addQualification(subject,qualification);
            }
        }
        return cloneNotes;
    }

}
