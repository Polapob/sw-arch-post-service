generate_subject_service_proto:
	protoc --proto_path=./src/main/java/SWA/microservice/first/proto/subject/ --java_out=./src/main/java entity.proto
	protoc --proto_path=./src/main/java/SWA/microservice/first/proto/subject/ --java_out=./src/main/java instructor.proto
	protoc --proto_path=./src/main/java/SWA/microservice/first/proto/subject/ --java_out=./src/main/java subject.proto 