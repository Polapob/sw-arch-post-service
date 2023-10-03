package SWA.microservice.first.Driven.MongoDB;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoClientConnection implements IMongoClientConnection {
	private static String uri = "mongodb://root:example@localhost:27017";

	public MongoClient createMongoClient() throws Exception {
		ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();
		MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(new ConnectionString(uri))
				.serverApi(serverApi).build();
		try {
			return MongoClients.create(settings);
		} catch (MongoException ex) {
			throw new Exception("Failed to connect mongodb :" + ex.toString());
		}
	}
}
