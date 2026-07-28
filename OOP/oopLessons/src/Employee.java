public class Employee {
    private final String name;
    private final double salary;
    private final int workHours;
    private final int hireYear;

    Employee(int hireYear, int workHours, double salary, String name){
        this.name = name;
        this.workHours = workHours;
        this.salary = salary;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary >= 1000 ){
            return salary * 0.3;
        }else{
            return 0.0;
        }
    }
    public double bonus(){
        return 30 * this.workHours;
    }
    public double increase(){
        int year = 2026 - this.hireYear;
        if (year < 10 ){
            return salary * 0.5;
        }else if(year >= 10 && year < 20){
            return salary * 0.10;
        }else{
            return salary * 0.15;
        }
    }
}
