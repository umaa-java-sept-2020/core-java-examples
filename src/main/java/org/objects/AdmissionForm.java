package org.objects;

public class AdmissionForm {

    public String name;
    public Integer gradMarksInPercentage;
    public Integer yearOfGraduation;
    public Integer ojeeRank;

    // no system.out.println statements
    public Integer getScholarshipAmount()
    {
        if(ojeeRank >=1 && ojeeRank <= 100)
        {
            return 70;
        }

        if(ojeeRank >=101 && ojeeRank <= 200)
        {
            return 50;
        }

        if(ojeeRank >=201 && ojeeRank <= 300)
        {
            return 30;
        }

        if(ojeeRank >=301 )
        {
            return 0;
        }

        return 0;
    }

}
