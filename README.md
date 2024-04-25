Hei! 

Dette er en kort demo som viser hvordan man setter opp JDBC med Maven. 
Dere har helt lov å benytte dette som et grunnlag for å løse oppgaver.
Ignorer docker-comppose.yaml, er noe jeg benytter for å ha tilgang til MySQL.

For dere som ønsker en oppgave å jobbe med til neste uke!
Pluss jeg kommer å gjøre en code along for å løse denne Tirsdag 16. April.
Løsningsforslaget kommer etter på GitHub etter code along Tirsdag 16. April.

Address Book Application:
- Create a simple address book application where users can add, update, delete, and search for contacts.
- Use JDBC to connect to a database to store and retrieve contact information.
- Implement basic CRUD (Create, Read, Update, Delete) operations using JDBC statements.

Her kode fasiten til oppgaven:
[JdbcPhoneContact](https://github.com/Errons1/JdbcPhoneContact)



Det ble etterspurt flere oppgaver man kan jobbe med for å øve på med JDBC og inheritance. Oppgaven er skrevet åpent for at dere kan lage applikasjonen etter egen evne og utfordre dere selv 
hvor dere føler passer. OPS OPS! Denne kan bli ganske komplisert hvis man blander inn brukere, men kan gi ei god utfordring! 

Bank Account Management System
Design and implement a bank account management system using Java, JDBC for database interaction, and inheritance for representing different types of bank accounts.
Database Schema Design:
- Create a database schema with tables for storing information about bank accounts.
- Include tables for Accounts and any additional tables as needed (e.g., Customers, Transactions, etc.).
- Define appropriate relationships between tables using primary and foreign keys.

Java Classes:
- Implement a superclass BankAccount with properties like accountNumber, balance, accountType, etc.
- Create subclasses like SavingsAccount, CheckingAccount, etc., inheriting from BankAccount.
- Each subclass should have specific attributes and methods, such as interestRate for SavingsAccount and overdraftLimit for CheckingAccount.

Database Interaction:
- Write JDBC code to interact with the database.
- Implement methods to perform operations like creating new accounts, depositing and withdrawing money, transferring funds between accounts, etc.
- Ensure that database connections are properly managed, and transactions are handled appropriately.



Her er linkene til artiklene jeg benyttet når jeg gikk igjennom teori
[https://medium.com/@cancerian0684/what-are-four-basic-principles-of-object-oriented-programming-645af8b43727](What are four basic principles of Object Oriented Programming?)
[https://medium.com/@bindubc/association-aggregation-and-composition-in-oops-8d260854a446](Association, aggregation, and composition in OOPs)


Lykke til og happy coding!
