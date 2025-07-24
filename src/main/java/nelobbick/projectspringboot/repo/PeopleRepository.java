package nelobbick.projectspringboot.repo;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import nelobbick.projectspringboot.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {


    Optional<Person> findPersonByFullName(@NotEmpty(message = "Имя не должно быть пустым") @Size(min = 2, max = 100, message = "Имя должно быть от 2 до 100 символов длиной") String fullName);
}
