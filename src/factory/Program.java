package factory;

public class Program {
    public static void main(String[] args) {
   DeveloperFactory developerFactory =  createDeveloperBySpeciality("php");
   Developer developer =  developerFactory.createDeveloper();
   developer.writeCode();


    }
    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if(speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        }
        else if(speciality.equalsIgnoreCase("c++"))  return new CppDeveloeprfactory();
        else if(speciality.equalsIgnoreCase("php"))  return new PHPdeveloperfactory();
        else  {
            throw  new RuntimeException("unknows speciality");
        }


    }
}
