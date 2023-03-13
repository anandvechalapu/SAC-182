@Entity
public class Employee {
    @Id
    private Long id;
    private String name;
    private String designation;

}

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}