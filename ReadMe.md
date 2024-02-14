# Project Overview
This project demonstrates a simple implementation of a customer data access layer and its usage. It includes the following classes:

* ICustomerDal: An interface defining the contract for customer data access.
* MySqlCustomerDal: A class implementing the ICustomerDal interface, specifically for MySQL data access.
* CustomerManager: A class managing customer-related operations, taking an implementation of ICustomerDal as a dependency.
* Main: The main class demonstrating the usage of CustomerManager with a specific data access implementation (in this case, SqlServerDal).

 ## Usage

To use this project, follow these steps:
1. Clone the repository
2. Open the project in your preferred Java development environment.
3. Run the Main class to see the demonstration of adding a customer using the CustomerManager with a specific data access implementation (SqlServerDal in this case).

## Classes
1. ICustomerDal
   The ICustomerDal interface defines a method Add() that must be implemented by any class aiming to provide customer data access.

2. MySqlCustomerDal
   The MySqlCustomerDal class implements the ICustomerDal interface, providing a specific implementation for MySQL data access.

3. CustomerManager
   The CustomerManager class manages customer-related operations and takes an implementation of ICustomerDal as a dependency.

4. Main
   The Main class contains the main method and demonstrates the usage of CustomerManager with a specific data access implementation (SqlServerDal in this case).

## Dependencies
  *  This project has no external dependencies. It is a standalone demonstration of the usage of the customer data access layer.