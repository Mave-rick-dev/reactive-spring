package com.maverick.reservationservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

@SpringBootApplication
public class ReservationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}

}

interface ReservationRepository extends ReactiveCrudRepository<Reservation, String>{}

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document
class Reservation{
	@Id
	private String id;
	private String name;
}