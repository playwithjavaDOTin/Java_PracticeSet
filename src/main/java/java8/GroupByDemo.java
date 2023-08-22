package java8;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import util.AppUtil;

import java.util.List;

public class GroupByDemo {

    public static void main(String[] args) {

        List<EmployeeBean> empList= AppUtil.getEmpList();

        System.out.println(empList);

        covertInJSON(empList);



    }



    public static void covertInJSON(Object obj){
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonData=mapper.writeValueAsString(obj);
            System.out.println("#DATA :: "+jsonData);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}


