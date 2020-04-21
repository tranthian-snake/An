import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSONTest {
    public static void main(String[] args) {
        //JSON parser object to parser read file
        JSONParser jsonParser= new JSONParser();
        try(FileReader reader= new FileReader("employees.json")){
            //Read JSON file
            Object obj= jsonParser.parse(reader);

            JSONArray employeeList=(JSONArray) obj;
            System.out.println(employeeList);

            //Iterate over employee array
            employeeList.forEach( emp -> parseEmployeeObject((JSONObject) emp ));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    public static void parseEmployeeObject(JSONObject employee) {
        //Get emloyee object within list
        JSONObject employeeObject=(JSONObject) employee.get("employee");

        //Get employee first name
        String firstName= (String) employee.get("firstName");
        System.out.println(firstName);
        //Get employee last name
        String lastName= (String) employee.get("lastName");
        System.out.println(lastName);
        //Get employee first name
        String website= (String) employee.get("website");
        System.out.println(website);
    }
}
