package SWA.microservice.first.dto.topic;

public class CreateTopicRequestDTO {
	private String description;
	private String subjectId;
	private Integer year;
	private Integer section;
	private String creatorId;
	private Integer semester;

	public CreateTopicRequestDTO(String description, String subjectId, Integer year, Integer section, String creatorId,
			Integer semester) {
		this.description = description;
		this.subjectId = subjectId;
		this.year = year;
		this.section = section;
		this.creatorId = creatorId;
		this.semester = semester;
	}

	public String getDescription() {
		return description;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public Integer getYear() {
		return year;
	}

	public Integer getSection() {
		return section;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public Integer getSemester() {
		return semester;
	}

	@Override
	public String toString() {
		return "CreateTopicRequestDTO [description=" + description + ", subjectId=" + subjectId + ", year=" + year
				+ ", section=" + section + ", creatorId=" + creatorId + ", semester=" + semester + "]";
	}

}
