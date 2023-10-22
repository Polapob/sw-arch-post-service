package SWA.microservice.first.Driven.MongoDB;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Component
public class MongoClientConnection implements IMongoClientConnection {
	@Value("${db.connection.string}")
	private String uri;

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
