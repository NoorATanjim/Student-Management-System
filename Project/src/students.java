/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
class students {
    private String id;
    private String name;
    private String department;
    private String cgpa;
    
    public students(String id,String name,String department,String cgpa)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }
    public String getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String getdepartment()
    {
        return department;
    }
    public String getcgpa()
    {
        return cgpa;
    }
}
