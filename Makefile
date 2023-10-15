start_compose_all:
	docker-compose -f "./docker-compose/rabbitMQ-docker-compose.yml" up -d
	docker-compose -f "./docker-compose/docker-compose.yml" up -d --build

stop_compose_all:
	docker-compose -f "./docker-compose/docker-compose.yml" -f "./docker-compose/rabbitMQ-docker-compose.yml" down