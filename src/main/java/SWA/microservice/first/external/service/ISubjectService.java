package SWA.microservice.first.external.service;

import SWA.microservice.first.Entity.Subject;
import SWA.microservice.first.external.request.ValidateSectionParams;

public interface ISubjectService {
	public boolean validateSubject(Long id);
	public boolean validateSection(ValidateSectionParams params);
	public Subject getSubjectByIdRequest(Long id);
}
