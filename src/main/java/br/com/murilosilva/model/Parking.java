package br.com.murilosilva.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parking")
public class Parking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String model;
	private String board;
	private String color;
	private int parkingSpace;

	public Parking(String model, String board, String color, int parkingSpace) {
		this.model = model;
		this.board = board;
		this.color = color;
		this.parkingSpace = parkingSpace;
	}

	public Parking() {

	}

	public String getModel() {
		return model;
	}

	public String getBoard() {
		return board;
	}

	public String getColor() {
		return color;
	}

	public int getParkingSpace() {
		return parkingSpace;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setParkingSpace(int parkingSpace) {
		this.parkingSpace = parkingSpace;
	}

}
