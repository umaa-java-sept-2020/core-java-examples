package org.objects;

public class AdmissionFormMain {
    public static void main(String[] args) {

        int x = 10; // x is a vraible of type int

        AdmissionForm // Type Of Reference Variable To The Object
                admissionFormRabindra // This is reference variable =
               = new // java keyword, to create object
                        AdmissionForm() ; // invoking the constructor to create object of type AdmissionForm ;

        admissionFormRabindra.name = "Rabindra";
        admissionFormRabindra.gradMarksInPercentage = 65;
        admissionFormRabindra.yearOfGraduation = 2010;
        admissionFormRabindra.ojeeRank = 51; // state

        System.out.println(admissionFormRabindra.getScholarshipAmount()); // behaviour

        //----------------------------------------------------------------------
        AdmissionForm admissionFormDebabrata = new AdmissionForm();
        admissionFormDebabrata.name = "Debabrata";
        admissionFormDebabrata.gradMarksInPercentage = 85;
        admissionFormDebabrata.yearOfGraduation= 2010;
        admissionFormDebabrata.ojeeRank = 250;// state

        System.out.println(admissionFormDebabrata.getScholarshipAmount()); // behaviour

        // --------------------------------------------------------------------
        System.out.println(admissionFormRabindra.getClass());


        System.out.println(admissionFormRabindra == admissionFormDebabrata); // false
        System.out.println("rabindra: "+admissionFormRabindra.hashCode());
        System.out.println("debabrata: "+admissionFormDebabrata.hashCode());

        AdmissionForm admissionFormRabindraAnotherVariable = admissionFormRabindra;

        System.out.println(admissionFormRabindraAnotherVariable == admissionFormRabindra); // true

        System.out.println(admissionFormRabindra.hashCode());
        System.out.println(admissionFormRabindraAnotherVariable.hashCode());

    }
}
