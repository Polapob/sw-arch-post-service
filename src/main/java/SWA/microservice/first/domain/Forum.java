package SWA.microservice.first.domain;

import java.util.UUID;

public class Forum {
	private String id;
	private String subjectId;
	private Integer year;
	private Integer semester;
	private Integer section;

	public Forum(String id, String subjectId, Integer year, Integer semester, Integer section) {
		this.id = id;
		this.subjectId = subjectId;
		this.year = year;
		this.semester = semester;
		this.section = section;
	}
	
	public Forum(String subjectId,Integer year,Integer semester,Integer section) {
		this.id = UUID.randomUUID().toString();
		this.subjectId = subjectId;
		this.year = year;
		this.semester = semester;
		this.section = section;	
	}

	public String getId() {
		return id;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public Integer getYear() {
		return year;
	}

	public Integer getSemester() {
		return semester;
	}

	public Integer getSection() {
		return section;
	}

	@Override
	public String toString() {
		return "Forum [id=" + id + ", subjectId=" + subjectId + ", year=" + year + ", semester=" + semester + "]";
	}

}
