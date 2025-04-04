package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubjectDTO {
    private Long id;
    private String subjectName;
    private String description;
	
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}


//package com.protonpreschool.schoolmanagement.dto;
//
//import lombok.Data;
//
//@Data
//public class SubjectDTO {
//    private Long id;
//    private String subjectName;
//    private Long classId; // Reference to SchoolClass
//    private String description;
//	
//    
//    public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getSubjectName() {
//		return subjectName;
//	}
//	public void setSubjectName(String subjectName) {
//		this.subjectName = subjectName;
//	}
//	public Long getClassId() {
//		return classId;
//	}
//	public void setClassId(Long classId) {
//		this.classId = classId;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//}
