package SWA.microservice.first.external.service;

import SWA.microservice.first.SubjectServiceGrpc.SubjectServiceBlockingStub;
import SWA.microservice.first.SubjectServiceGrpc.SubjectServiceImplBase;
import SWA.microservice.first.Entity.Subject;
import SWA.microservice.first.GetSubjectByIdRequest;
import SWA.microservice.first.SubjectServiceGrpc;
import SWA.microservice.first.ValidateSubjectIdRequest;
import io.grpc.ManagedChannelBuilder;

public class SubjectService extends SubjectServiceImplBase implements ISubjectService {
	public boolean validateSubject(Long id) {
		var stub = createStub();
		var request = ValidateSubjectIdRequest.newBuilder().setId(id).build();
		var response = stub.validateSubjectId(request);
		return response.getValid();
	}
	private SubjectServiceBlockingStub createStub() {
		var channel = ManagedChannelBuilder.forAddress("localhost", 8080)
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
