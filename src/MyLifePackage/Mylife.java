package MyLifePackage;

/**
 * Created by farhana rashid on 7/29/2019.
 */
public class Mylife {
    int address = 12;
    String HouseName;
    String JobName ;


    public void MyEducation()
    {System.out.println("bsc in EEE");
    }

public void MyDaughter()
{System.out.println("my daughter's name is AMAYA");
}

public String getHouseName()
{
return HouseName;
}

    public void setHouseName(String NewHouse){
        this.HouseName= NewHouse;
    }
public String getJobName()
{
    return JobName;
}
    public void setJobName(String NewJob){
        this.JobName = NewJob;
    }


public int AgeCal(int BornYear,int CurrentYear)
{
    int Age = 0;
    Age = CurrentYear - BornYear;
    return Age;
 };
}