package com.aniket.makersharks;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<UserTable, Long> {
    @Query
    Boolean existsByUsername(String username);

    @Query
    UserTable findByUsername(String username);
}
