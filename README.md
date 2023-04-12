<h1><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOWdut794eIE4UCGs7dZflfwFwIDQsj3Ma_A&usqp=CAU" width="50" height="50"/> Taxi Service <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOWdut794eIE4UCGs7dZflfwFwIDQsj3Ma_A&usqp=CAU" alt="My Image" width="50" height="50"/></h1>

This project is designed to function as a simplified version of a real taxi service.
Authenticated users have the ability to add or delete
information pertaining to cars, manufacturers, and drivers.
Additionally, users can check for the existence of specific entities within the system as needed.

## Features
<ul>
  <li>Authentication</li>
  <li>Add or delete drivers</li>
  <li>Add or delete manufacturers</li>
  <li>Add or delete cars</li>
  <li>Add drivers to specific car</li>
  <li>Retrieve all cars currently assigned to the authenticated driver</li>
  <li>Retrieve all drivers, manufacturers, or cars</li>
</ul>

## Get Started
<ul>
  <li>Clone the project repository onto your local machine</li>
  <li>Run the SQL script located in <code>src/main/resources/init_db.sql</code> to initialize the database on your local machine</li>
  <li>Replace the values of the <code>URL</code>, <code>USERNAME</code>, <code>PASSWORD</code> and <code>JDBC_DRIVER</code> properties 
  with the appropriate values for your database setup</li>
  <li>Build the project using Maven: <code>mvn clean install</code></li>
  <li>Deploy the WAR file that was generated to a servlet container, such as Tomcat</li>
</ul>

## Structure

<ul>
<li>controller: Servlets designed to manage HTTP requests and responses</li>
  <ul>
    <li>IndexController - <code>GET /</code> - show all corresponding pages</li>
    <li>LoginController - <code>POST /login</code> - authentication</li>
    <li>LogoutController - <code>GET /logout</code> - invalidate current session</li>
    <li>GetAllDriversController - <code>GET /drivers</code> - views all drivers</li>
    <li>AddDriverController - <code>POST /drivers/add</code> - adds a driver</li>
    <li>DeleteDriverController - <code>GET /drivers/delete</code> - deletes driver</li>
    <li>GetAllManufacturersController - <code>GET /manufacturers</code> - views all manufacturers</li>
    <li>AddManufacturersController - <code>POST /manufacturers/add</code> - adds new manufacturer</li>
    <li>DeleteManufacturerController - <code>GET /manufacturers/delete</code> - deletes manufacturer</li>
    <li>GetAllCarsController - <code>GET /cars</code> - views all cars</li>
    <li>AddCarController - <code>POST /cars/add</code> - adds a new car</li>
    <li>DeleteCarController - <code>GET /cars/delete</code> - deletes car</li>
    <li>GetMyCurrentCarsController - <code>GET /drivers/cars</code> - views all cars for the current driver</li>
    <li>AddDriverToCarController - <code>POST /cars/drivers/add</code> - adds a driver to a certain car</li>
  </ul>
<li>filter: Servlet Filters employed to intercept incoming requests and responses</li>
<li>service: Service interfaces and their implementations that perform business logic</li>
<li>dao: Data Access Object interfaces and their implementations</li> 
<li>model: Java objects that are used to hold or represent data</li>
<li>util: Utility class used in a project to create a database connection</li>
<li>resources: Non-Java files that may include database scripts and various configurations</li> 
<li>webapp: Contains web resources such as CSS, and JSP files</li>
<li>WEB-INF: Contains configuration files for the web application</li>
<li>views: Contains JSP files used as views in the application and css files</li>
</ul>

## Used technologies:

<ul>
<li>Java <code>v.17.0.6</code></li>
<li>Maven <code>v.3.9.1</code></li>
<li>JDBC <code>v.4.2</code></li>
<li>MySql <code>v.8.0.22</code></li>
<li>Java Servlets <code>v.4.0.1</code></li>
<li>Tomcat <code>v.9.0.73</code></li>
</ul>

## Authors

Oleh Sarapuk
