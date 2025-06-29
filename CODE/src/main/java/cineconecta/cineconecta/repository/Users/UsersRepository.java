package cineconecta.cineconecta.repository.Users;

import cineconecta.cineconecta.model.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsersRepository extends JpaRepository<User, UUID> {}
