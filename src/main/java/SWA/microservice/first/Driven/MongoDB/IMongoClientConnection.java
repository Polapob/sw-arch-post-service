package SWA.microservice.first.Driven.MongoDB;

import com.mongodb.client.MongoClient;

public interface IMongoClientConnection {
	MongoClient createMongoClient() throws Exception;
}
