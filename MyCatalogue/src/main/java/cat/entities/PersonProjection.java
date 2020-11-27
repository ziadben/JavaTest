package cat.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="P1", types= Person.class)
public interface PersonProjection {
	
	public String getBeruf();
	public Long getId();

}
