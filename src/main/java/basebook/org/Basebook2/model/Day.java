package basebook.org.Basebook2.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DAY")
public class Day {
	
	@Id @GeneratedValue
	private long dayId;
	private Time desde;
	private Time hasta;
		
	public Day(){
		
	}
	
	@Id
	@Column(name = "DAY_ID")
	@GeneratedValue
	public long getDayId() {
		return dayId;
	}

	public void setDayId(long dayId) {
		this.dayId = dayId;
	}
	

	public Time getDesde() {
		return desde;
	}

	public void setDesde(Time desde) {
		this.desde = desde;
	}

	public Time getHasta() {
		return hasta;
	}

	public void setHasta(Time hasta) {
		this.hasta = hasta;
	}
	
}
