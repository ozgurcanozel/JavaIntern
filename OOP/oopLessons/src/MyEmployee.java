public class MyEmployee {
    public String name;
    public double salary;
    public int workHours, hireYear;

    MyEmployee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        } else {
            return this.salary;
        }
    }

    public double bonus() {
        int extraHours = this.workHours - 40;
        if (extraHours > 0) {
            return 30 * extraHours;
        }
        return 0.0;
    }

    public double increase(){
        int year = 2026 - hireYear;
        if (year <= 10){
            return this.salary * 0.5;
        }else if (year > 9 && year <= 20){
            return this.salary * 0.1;
        }else{
            return this.salary * 0.15;
        }
    }
    public void toString(MyEmployee emp){
        MyEmployee emp1 = new MyEmployee("Ozgur",2000,45,1985);
        System.out.println("Tax : " + emp1.tax());
        System.out.println("Bonus : " + emp1.bonus());
        System.out.println("Increase : " + emp1.increase());
    }
}
