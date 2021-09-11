package PackApp.Dao;

import PackApp.Model.Empleados;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmpleadoImpDao implements EmpleadoDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Empleados> getUsuarios() {
        String query = "FROM Empleados";
        return entityManager.createQuery(query).getResultList();
    }
}
