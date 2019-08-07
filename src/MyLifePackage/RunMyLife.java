package MyLifePackage;

/**
 * Created by farhana rashid on 7/29/2019.
 */
public class RunMyLife {
    public static void main (String[]args)
    {


        Mylife MyLife1 = new Mylife();

        MyLife1.MyEducation();
        MyLife1.MyDaughter();
        MyLife1.setHouseName("ABCD");
        System.out.println(MyLife1.getHouseName());
        MyLife1.setJobName("CVS");
        System.out.println(MyLife1.getJobName());
        //MyLife1.AgeCal(1990,2019);

            int MyAge =MyLife1.AgeCal(1990,2019);
        System.out.println(MyAge);

     }
}

