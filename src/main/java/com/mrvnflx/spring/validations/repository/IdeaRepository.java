package com.mrvnflx.spring.validations.repository;

import com.mrvnflx.spring.validations.model.Idea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mrvnf on 2/27/2017.
 */
@Repository
public interface IdeaRepository extends JpaRepository<Idea, Long> {
}
