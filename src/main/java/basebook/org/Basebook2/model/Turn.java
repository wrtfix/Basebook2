package basebook.org.Basebook2.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TURN")
public class Turn {

	private Date date;
	private Set<User> users = new HashSet<User>(0);
	
	private long turnId;
	
	@Id
	@Column(name = "TURN_ID")
	@GeneratedValue
	public long getTurnId() {
		return turnId;
	}

	public void setTurnId(long id) {
		this.turnId = id;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Turn(){
		
	}
	
	public Turn(Date date, Set<User> users){
		this.date = date;
		this.users = users;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "TURN_USER", joinColumns = { @JoinColumn(name = "TURN_ID") }, inverseJoinColumns = {@JoinColumn(name = "USER_ID") })
	public Set<User> getUsers(){
		return this.users;
	}
	

	public void setUsers(Set<User> users){
		this.users = users;
	}
	

	
}
