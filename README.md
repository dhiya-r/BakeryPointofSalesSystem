# Bakery Point of Sales (POS) System

## Overview
This is a Point of Sale (POS) System designed specifically for a bakery. It allows for efficient management of workers' information, products, sales, and reports. It also includes a feature for users to change their login password.

## Features
**Users Screen**: Allows for editing of the workers' information.
**Products Screen**: Allows for adding, editing, and deleting of products sold by the bakery.
**Sales Screen**: Allows workers to record sales and transactions.
**Reports Screen**: Allows for users to generate reports based on sales and information.
**Change Password**: Allows the user to change their login password.

## Technical Stack
The project is built on NetBeans.
It uses the UCanAccess file and its dependencies.

## Installation
**Download and Install NetBeans**: If not already installed, download and install the NetBeans IDE on your system.
**Clone the Project Repository**: Clone the project repository from the command line:
**Open the Project in NetBeans**: Open NetBeans and select `File > Open Project`. Navigate to the directory where you cloned the repository and select the project to open it.
**Resolve Dependencies**: Ensure that UCanAccess and all it's dependencies (Commons-lang, commons-logging, jackcess, and HSQLDB) are correctly set up in your project. You can manage your project's dependencies in NetBeans by right-clicking on the project name in the Projects window and selecting `Properties > Libraries > Compile > Classpath > Add Jar/Folder'.

## Usage
1. **Run the Project**: To run the project, right-click on the project name in the Projects window and select `Run`.

2. **Navigate the Application**: Use the main menu to navigate between different modules:
        - `Users`: Manage worker information.
        - `Products`: Handle product inventory.
        - `Sales`: Process sales transactions.
        - `Reports`: Create various reports.
        - `Change Password`: Update user login credentials.

3. **Exit the Application**: To exit the application, select `Logout` from the main menu.