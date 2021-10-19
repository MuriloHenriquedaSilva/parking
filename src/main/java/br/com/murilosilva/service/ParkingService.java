package br.com.murilosilva.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.murilosilva.model.Parking;
import br.com.murilosilva.repository.ParkingRepository;

@Service
public class ParkingService {
	@Autowired
	private ParkingRepository parkingRepository

	public Parking insert(Parking parking) {
		return parkingRepository.save(parking);
	}

	public Parking update(Parking parking) {
		return parkingRepository.save(parking);

	}

	public List<Parking> findAll() {
		List<Parking> parking = new ArrayList<>();
		parkingRepository.findAll().forEach(parking::add);
		return parking;
	}

	public Optional<Parking> findOne(Integer id) {
		parkingRepository.findById(id);
	}

	public void remove(Integer id) {
		parkingRepository.deleteById(id);
	}
}
