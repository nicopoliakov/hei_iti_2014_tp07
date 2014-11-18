package tp07.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "slide")
public class SlideEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "indexh")
	private int indexh;

	@Column(name = "indexv")
	private int indexv;

	@Column(name = "indexf")
	private int indexf;

	public SlideEntity(int indexh, int indexv, int indexf) {
		this.indexh = indexh;
		this.indexv = indexv;
		this.indexf = indexf;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getIndexh() {
		return indexh;
	}

	public void setIndexh(int indexh) {
		this.indexh = indexh;
	}

	public int getIndexv() {
		return indexv;
	}

	public void setIndexv(int indexv) {
		this.indexv = indexv;
	}

	public int getIndexf() {
		return indexf;
	}

	public void setIndexf(int indexf) {
		this.indexf = indexf;
	}

}
