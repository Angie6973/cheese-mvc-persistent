package org.launchcode.models.data;


import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by LaunchCode
 */
@Repository
@Transactional
public interface CheeseDao extends CrudRepository<Cheese, Integer> {

    void deleteById(int cheeseId);

    Menu findById(int cheeseId);
}
