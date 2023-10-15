generate_subject_service_proto:
	protoc --proto_path=./src/main/java/SWA/microservice/first/proto/subject/ --java_out=./src/main/java entity.proto
	protoc --proto_path=./src/main/java/SWA/microservice/first/proto/subject/ --java_out=./src/main/java instructor.proto
	protoc --proto_path=./src/main/java/SWA/microservice/first/proto/subject/ --java_out=./src/main/java subject.proto 

start_compose_all:
	docker-compose -f "./docker-compose/rabbitMQ-docker-compose.yml" up -d
	docker-compose -f "./docker-compose/docker-compose.yml" up -d --build

stop_compose_all:
	docker-compose -f "./docker-compose/docker-compose.yml" -f "./docker-compose/rabbitMQ-docker-compose.yml" down