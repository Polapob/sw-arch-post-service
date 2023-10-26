package SWA.microservice.first.external.service;

import SWA.microservice.first.SubjectServiceGrpc.SubjectServiceBlockingStub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import SWA.microservice.first.Entity.Subject;
import SWA.microservice.first.GetSubjectByIdRequest;
import SWA.microservice.first.SubjectServiceGrpc;
import SWA.microservice.first.ValidateSectionRequest;
import SWA.microservice.first.ValidateSubjectIdRequest;
import SWA.microservice.first.external.request.ValidateSectionParams;
import io.grpc.ManagedChannelBuilder;

@Component
public class SubjectService extends SubjectServiceGrpc.SubjectServiceImplBase implements ISubjectService {

	@Value("${subject.service.uri}")
	private String subjectUri;

	public boolean validateSubject(Long id) {
		var stub = createStub();
		var request = ValidateSubjectIdRequest.newBuilder().setId(id).build();
		var response = stub.validateSubjectId(request);
		return response.getValid();
	}
	
	public boolean validateSection(ValidateSectionParams params) {
		var stub = createStub();
		var request = ValidateSectionRequest.newBuilder()
				.setYear(params.year)
				.setSubjectId(params.subjectId)
				.setSectionNumber(params.sectionNumber)
				.setSemester(params.semester)
				.build();
		var response = stub.validateSection(request);
		return response.getValid();
	}

	private SubjectServiceBlockingStub createStub() {
		var channel = ManagedChannelBuilder.forTarget(subjectUri)
				.usePlaintext()
				.build();
		var stub = SubjectServiceGrpc.newBlockingStub(channel);
		return stub;
	}

	public Subject getSubjectByIdRequest(Long id) {
		var request = GetSubjectByIdRequest.newBuilder().setId(id).build();
		var stub = createStub();
		var response = stub.getSubjectById(request);
		return response.getSubject();
	}
}
