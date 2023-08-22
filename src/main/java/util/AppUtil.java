package util;

import java8.EmployeeBean;

import java.util.ArrayList;
import java.util.List;

public class AppUtil {

    public static List<EmployeeBean> getEmpList(){
        EmployeeBean e1=new EmployeeBean("Raj","Patna","R&D","SSE",50000d);
        EmployeeBean e2=new EmployeeBean("Mohan","Mumbai","Software","SE",60000d);
        EmployeeBean e3=new EmployeeBean("Salman","Bangalore","R&D","Manager",70000d);
        EmployeeBean e4=new EmployeeBean("Amir","Bangalore","Gov","Arch",80000d);
        EmployeeBean e5=new EmployeeBean("Dharam","Patna","Railway","SSE",90000d);
        EmployeeBean e6=new EmployeeBean("Krish","Patna","Railway","Manager",100000d);
        EmployeeBean e7=new EmployeeBean("Marina","Bangalore","Railway","SSE",110000d);
        EmployeeBean e8=new EmployeeBean("Saloni","Patna","Railway","Manager",120000d);
        EmployeeBean e9=new EmployeeBean("Saloni","Patna","Railway","Manager",140000d);
        EmployeeBean e10=new EmployeeBean("Saloni","Patna","Railway","Manager",160000d);

        EmployeeBean e11=new EmployeeBean("Amir","Bangalore","Gov","Arch",170000d);
        List<EmployeeBean> employeeBeans=new ArrayList<>();
        employeeBeans.add(e1);
        employeeBeans.add(e2);
        employeeBeans.add(e3);
        employeeBeans.add(e4);
        employeeBeans.add(e5);
        employeeBeans.add(e6);
        employeeBeans.add(e7);
        employeeBeans.add(e8);

        employeeBeans.add(e9);
        employeeBeans.add(e10);
        employeeBeans.add(e11);


        return employeeBeans;

    }

    public static List<LpData> getLpData(){

        LpData e1=new LpData("LP1","Npaglue@gmail.com",11,90d,"2022-01-01","2022-01-01","Course_Name1");
        LpData e2=new LpData("LP1","Npaglue@gmail.com",11,40d,"2022-01-01","2022-01-01","Course_Name2");
        LpData e3=new LpData("LP1","Npaglue@gmail.com",11,60d,"2022-01-01","2022-01-01","Course_Name3");

        LpData e4=new LpData("LP2","Raj@gmail.com",12,90d,"2022-01-01","2022-01-01","Course_Name1");
        LpData e5=new LpData("LP2","Raj@gmail.com",12,90d,"2022-01-01","2022-01-01","Course_Name2");
        LpData e6=new LpData("LP2","Raj@gmail.com",12,90d,"2022-01-01","2022-01-01","Course_Name3");


        LpData e7=new LpData("LP2","Npaglue@gmail.com",12,90d,"2022-01-01","2022-01-01","Course_Name5");
        LpData e8=new LpData("LP2","Npaglue@gmail.com",12,50d,"2022-01-01","2022-01-01","Course_Name4");

        List<LpData> ee=new ArrayList<>();

        ee.add(e1);
        ee.add(e2);
        ee.add(e3);
        ee.add(e4);
        ee.add(e5);
        ee.add(e6);
        ee.add(e7);
        ee.add(e8);

        return ee;
    }
}
