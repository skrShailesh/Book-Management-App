# Book Management App
 
### Book Store Management App

This repository contains the source code for a Book Store Management application developed using the Spring Framework. The application allows users to register new books, view available books, add books to their personal lists, edit book details, and delete books.

### Features

- **Book Registration**: Users can register new books by providing details such as name, author, and price.
- **Available Books**: Users can view a list of available books in the bookstore.
- **My Books**: Users can view a list of books they have added to their personal collection.
- **Edit Book Details**: Users can edit the details of existing books.
- **Delete Books**: Users can delete books from the bookstore inventory or their personal collection.

### Technologies Used

- **Spring Framework**: The application is built using Spring Boot, which provides a powerful framework for building Java-based applications.
- **Spring MVC**: The Model-View-Controller architecture is used to structure the application, with controllers handling HTTP requests and responses.
- **Spring Data JPA**: JPA (Java Persistence API) is used for database access, with Spring Data providing convenient repository abstractions.
- **Thymeleaf**: Thymeleaf is used as the templating engine for generating HTML pages, allowing for dynamic content rendering.
- **Bootstrap**: Bootstrap CSS framework is used for styling the user interface, providing a responsive and visually appealing design.

### Project Structure

- **Controller**: Contains Spring MVC controllers responsible for handling HTTP requests and coordinating the flow of data.
- **Entity**: Defines JPA entity classes representing the database tables (e.g., Book, MyBookList).
- **Repository**: Contains Spring Data JPA repositories for database CRUD operations.
- **Service**: Provides business logic and acts as an intermediary between controllers and repositories.
- **Views**: Thymeleaf HTML templates for rendering the user interface.

### Setup Instructions

1. Clone the repository to your local machine.
2. Import the project into your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
3. Configure the application properties file (`application.properties`) to specify the database connection details.
4. Run the application using your IDE's built-in tools or command-line interface.

### Contributing

Contributions to this project are welcome! If you find any bugs or have suggestions for improvements, please open an issue or submit a pull request.

