package PackApp.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Empleados {

    @Id
    @Getter @Setter @Column(name = "EMPLOYEED_ID")
    private Long Id;

    @Getter @Setter @Column(name = "FIRST_NAME")
    private String Name;

    @Getter @Setter @Column(name = "SECOND_NAME")
    private String Lastname;

    @Getter @Setter @Column(name = "PHONE_NUMBER")
    private String Number;

    @Getter @Setter @Column(name = "EMAIL")
    private String Email;

    @Getter @Setter @Column(name = "SALARY")
    private int Salary;


}
