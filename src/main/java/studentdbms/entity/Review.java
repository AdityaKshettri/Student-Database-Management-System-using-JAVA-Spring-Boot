package studentdbms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review 
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = false)
	private String rating;

	@Column(nullable = false)
	private String description;
	
	@ManyToOne
	private Course course;

	public Review() {}
	
	public Review(String rating, String description) {
		this.rating = rating;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", rating=" + rating + ", description=" + description + ", course=" + course + "]";
	}

}
