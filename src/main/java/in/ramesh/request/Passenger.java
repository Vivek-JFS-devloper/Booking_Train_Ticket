package in.ramesh.request;

import lombok.Data;

@Data
public class Passenger {
	private Integer id;
	private String fname;
	private String sname;
	private String gender;
	private String from;
	private String to;
	private String trainName;
	private Long trainNumber;
	private double price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public Long getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(Long trainNumber) {
		this.trainNumber = trainNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", fname=" + fname + ", sname=" + sname + ", gender=" + gender + ", from=" + from
				+ ", to=" + to + ", trainName=" + trainName + ", trainNumber=" + trainNumber + ", price=" + price + "]";
	}

}
