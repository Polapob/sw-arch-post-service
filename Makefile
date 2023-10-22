start_compose_all:
	docker-compose -f "./docker-compose/rabbitMQ-docker-compose.yml" up -d
	docker-compose -f "./docker-compose/docker-compose.yml" up -d --build

stop_compose_all:
	docker-compose -f "./docker-compose/docker-compose.yml" -f "./docker-compose/rabbitMQ-docker-compose.yml" down

start_compose_dev:
	docker-compose -f "./docker-compose/docker-compose-db.yml" up -d 

down_compose_down:
	docker-compose -f "./docker-compose/docker-compose-db.yml" down

remove_volume:
	docker volume rm docker-compose_broker_log docker-compose_broker_data