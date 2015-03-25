package info.osokwik.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class MaintWork {

	@Id
	@GeneratedValue
	private long id;
	
	@OneToOne
	private WorkType type;
	private String workLog;
	private int amountCharged;
	/**
	 * @return the workLog
	 */
	public String getWorkLog() {
		return workLog;
	}
	/**
	 * @param workLog the workLog to set
	 */
	public void setWorkLog(String workLog) {
		this.workLog = workLog;
	}
	/**
	 * @return the amountCharged
	 */
	public int getAmountCharged() {
		return amountCharged;
	}
	/**
	 * @param amountCharged the amountCharged to set
	 */
	public void setAmountCharged(int amountCharged) {
		this.amountCharged = amountCharged;
	}
}
