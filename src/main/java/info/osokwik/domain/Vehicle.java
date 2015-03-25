package info.osokwik.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Vehicle {

	@Id
	@GeneratedValue
	private long id;
	
	private String nickname;
	private int mileagePerMonth;

	@OneToOne
	private Model model;	
	private int mileage;

	private List<MaintRecord> records = new ArrayList<MaintRecord>();

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the mileagePerMonth
	 */
	public int getMileagePerMonth() {
		return mileagePerMonth;
	}

	/**
	 * @param mileagePerMonth the mileagePerMonth to set
	 */
	public void setMileagePerMonth(int mileagePerMonth) {
		this.mileagePerMonth = mileagePerMonth;
	}

	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	/**
	 * @return the records
	 */
	public List<MaintRecord> getRecords() {
		return records;
	}

	/**
	 * @param records the records to set
	 */
	public void setRecords(List<MaintRecord> records) {
		this.records = records;
	}
}
