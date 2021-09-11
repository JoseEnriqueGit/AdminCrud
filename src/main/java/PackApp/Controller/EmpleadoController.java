package PackApp.Controller;

import PackApp.Dao.EmpleadoDao;
import PackApp.Model.Empleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoDao empleadoDao;

    @GetMapping(value = {"/Empleados/{id}","/empleados/{id}"})
    public Empleados GetEmpleado(@PathVariable Long id) {
        Empleados Emp = new Empleados();
        Emp.setId(id);
        Emp.setName("Jose");
        Emp.setLastname("Ogando");
        Emp.setEmail("klk@gmail.com");
        Emp.setNumber("809");
        Emp.setSalary(20000);
        return Emp;
    }

    @GetMapping(value = {"/Empleados/L","/empleados/l"})
    public List<Empleados> GetEmpleado() {
        return empleadoDao.getUsuarios();
    }
}
