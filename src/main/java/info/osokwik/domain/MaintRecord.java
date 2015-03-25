package info.osokwik.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class MaintRecord {

	@Id
	@GeneratedValue
	private long id;
	
	@OneToMany
	private List<MaintWork> items = new ArrayList<MaintWork>();
	
	private int mileagePerformed;

	/**
	 * @return the mileagePerformed
	 */
	public int getMileagePerformed() {
		return mileagePerformed;
	}

	/**
	 * @param mileagePerformed the mileagePerformed to set
	 */
	public void setMileagePerformed(int mileagePerformed) {
		this.mileagePerformed = mileagePerformed;
	}
}
