package SWA.microservice.first.external.service;

import SWA.microservice.first.SubjectServiceGrpc.SubjectServiceBlockingStub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import SWA.microservice.first.Entity.Subject;
import SWA.microservice.first.GetSubjectByIdRequest;
import SWA.microservice.first.SubjectServiceGrpc;
import SWA.microservice.first.ValidateSubjectIdRequest;
import io.grpc.ManagedChannelBuilder;

@Component
public class SubjectService extends SubjectServiceGrpc.SubjectServiceImplBase implements ISubjectService {
	
	@Value("${subject.service.host}")
	private static String serviceHost;
	
	@Value("${subject.service.port}")
	private static Integer port;
	
	public boolean validateSubject(Long id) {
		var stub = createStub();
		var request = ValidateSubjectIdRequest.newBuilder().setId(id).build();
		var response = stub.validateSubjectId(request);
		return response.getValid();
	}
	private SubjectServiceBlockingStub createStub() {
		var channel = ManagedChannelBuilder.forAddress(serviceHost,port)
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
