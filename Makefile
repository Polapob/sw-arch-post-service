start_compose_all:
	docker-compose -f "./docker-compose/rabbitMQ-docker-compose.yml" up -d
	docker-compose -f "./docker-compose/docker-compose.yml" up -d --build

start_backend:
	docker-compose -f "./docker-compose/docker-compose.yml" up -d --build

start_message_broker:
	docker-compose -f "./docker-compose/rabbitMQ-docker-compose.yml" up -d

start_compose_dev:
	docker-compose -f "./docker-compose/docker-compose-db.yml" up -d 

stop_compose_dev:
	docker-compose -f "./docker-compose/docker-compose-db.yml" down

stop_compose_all:
	docker-compose -f "./docker-compose/docker-compose.yml" -f "./docker-compose/rabbitMQ-docker-compose.yml" down

remove_volume:
	docker volume rm docker-compose_broker_log docker-compose_broker_data