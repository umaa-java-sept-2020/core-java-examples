package org.objects;

public class AdmissionFormMain {
    public static void main(String[] args) {


        AdmissionForm // Type Of Reference Variable To The Object
                admissionFormRabindra // This is reference variable =
               = new // java keyword, to create object
                        AdmissionForm() ; // invoking the constructor to create object of type AdmissionForm ;

        admissionFormRabindra.name = "Rabindra";
        admissionFormRabindra.gradMarksInPercentage = 65;
        admissionFormRabindra.yearOfGraduation = 2010;
        admissionFormRabindra.ojeeRank = 51; // state

        System.out.println(admissionFormRabindra.getScholarshipAmount()); // behaviour

        AdmissionForm admissionFormDebabrata = new AdmissionForm();
        admissionFormDebabrata.name = "Debabrata";
        admissionFormDebabrata.gradMarksInPercentage = 85;
        admissionFormDebabrata.yearOfGraduation= 2010;
        admissionFormDebabrata.ojeeRank = 250;// state

        System.out.println(admissionFormDebabrata.getScholarshipAmount()); // behaviour

        System.out.println(admissionFormRabindra.getClass());


        System.out.println(admissionFormRabindra == admissionFormDebabrata);

        AdmissionForm admissionFormRabindraAnotherVariable = admissionFormRabindra;

        System.out.println(admissionFormRabindraAnotherVariable == admissionFormRabindra);

        System.out.println(admissionFormRabindra);
        System.out.println(admissionFormRabindraAnotherVariable);

    }
}
