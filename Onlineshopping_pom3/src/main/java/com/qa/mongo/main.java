package com.qa.mongo;

import static org.testng.Assert.fail;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class main {

	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		MongoDatabase database = mongoClient.getDatabase("test");

		MongoCollection<Document> doc=database.getCollection("movie");
		
		Document document = new Document("title", "MongoDB")
				.append("description", "database");
				doc.insertOne(document);


		FindIterable<Document> iterDoc = doc.find(); 
	      Iterator it = iterDoc.iterator(); 
	      while (it.hasNext()) {  
	         System.out.println(it.next());  
	         
	       
	      }




	}
}
