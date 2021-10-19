package br.com.murilosilva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.murilosilva.model.Parking;
@Repository
public interface ParkingRepository extends CrudRepository<Parking, Integer> {

}
