package org.arrays;

public class Employee implements Comparable<Employee> {

    private Integer id;
    private String name;
    private String companyName;

    public Employee() {
    }

    public Employee(Integer id, String name, String companyName) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    // sorting logic tightly coupled with the Employee.
    // no code change in employee class.
    @Override
    public int compareTo(Employee o) {
        int result = -1;
        result =  sortByName(o); //sortByName(o);
        return result;
    }

    private int sortByCompanyName(Employee e) {
        String companyName1 = this.getCompanyName();
        String companyName2 = e.getCompanyName();
        return companyName1.compareTo(companyName2);
    }

    private int sortByName(Employee e) {
        String name1 = this.getName();
        String name2 = e.getName();
        return name1.compareTo(name2);
    }

    // when name is same, reverse the order of company name
    private int sortByNameWithReverseOrderCompanyName(Employee e)
    {
        int result = -sortByName(e);
        if(result == 0)
        {
            result = -sortByCompanyName(e); // reverseOrder -
        }
        return result;
    }
}
