package cat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;
@Entity
public class Person implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String vorname;
    @Temporal(TemporalType.DATE)
    @Past
    private Date geburtstag;
    private String beruf;
    
	public Person() {
		super();
	}

	public Person(Long id, String name, String vorname, Date geburtstag, String beruf) {
		super();
		this.id = id;
		this.name = name;
		this.vorname = vorname;
		this.geburtstag = geburtstag;
		this.beruf = beruf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public Date getGeburtstag() {
		return geburtstag;
	}

	public void setGeburtstag(Date geburtstag) {
		this.geburtstag = geburtstag;
	}

	public String getBeruf() {
		return beruf;
	}

	public void setBeruf(String beruf) {
		this.beruf = beruf;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", vorname=" + vorname + ", geburtstag=" + geburtstag
				+ ", beruf=" + beruf + "]";
	}
	
	
    
    
}
