package com.koden.igaz.desertwind.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStateRepository extends JpaRepository<UserState, Long> {
}
