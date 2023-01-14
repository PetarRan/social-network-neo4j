# Travel Social Network - Backend

This is the backend of a social network application for travelers called **dabble** built using Spring and Neo4J as the graph database. The main focus of the project is to showcase the power of graph databases in handling complex relationships and data in a social media context.

## Features
- Create a profile and follow other travelers
- Search for other travelers traveling to the same destination
- Create and join groups for specific locations
- Utilize Neo4J's powerful graph data model for efficient management of complex relationships between users and locations
- Securely handle user authentication and authorization

## Getting Started

### Prerequisites
- Java 8 or later
- Neo4J 4 or later

### Installation
1. Clone the repository
 `git clone https://github.com/PetarRan/social-network-neo4j.git`
2. Set up a Neo4J graph database and configure the application to connect to it by modifying the application.properties file
3. Build the project using Gradle or Maven
 `./gradlew build` or `mvn clean install`
4. Run the Spring Boot application
`./gradlew bootRun` or `java -jar target/travel-social-media-backend-0.0.1-SNAPSHOT.jar`

5. Use the API endpoints to interact with the application

## Built With
- [Spring](https://spring.io/) - The web framework used
- [Neo4J](https://neo4j.com/) - The graph database used

## Contributing

Please read [CONTRIBUTING.md](https://github.com/PetarRan/social-network-neo4j/blob/main/CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Authors

- **Petar** - [PetarRan](https://github.com/PetarRan)

See also the list of [contributors](https://github.com/PetarRan/social-network-neo4j/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/PetarRan/social-network-neo4j/blob/main/licence) file for details.

## Acknowledgments

- Hat tip to anyone whose code was used
- Inspiration
- etc
