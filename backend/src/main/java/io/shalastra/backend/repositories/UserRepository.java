package io.shalastra.backend.repositories;

import io.shalastra.backend.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
