package SWA.microservice.first.external.service;

import SWA.microservice.first.Entity.Subject;

public interface ISubjectService {
	public boolean validateSubject(Long id);
	public Subject getSubjectByIdRequest(Long id);
}
