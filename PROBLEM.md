## Problem Statement: Implementing CRUD operations on NoSQL Document database in AWS DocumentDB

In this assignment, base code for the PatientApplication has been provided. You need to provision the DocumentDB
database cluster on AWS cloud with TLS disabled and complete the functionality for performing CRUD operations on the database in the given 
PatientApplication.

### Note
AWS DocumentDB does not have an API for public access. To access the DocumentDB from your local machine, A EC2 instance has
to be created in the same VPC as DocumentDB cluster. The AWS DocumentDB can be accessed from your local machine 
by creating an SSH tunnel with port forwarding to EC2 instance.

**Refer the documentation links provided in the `Reference` section below for detailed instructions**
 
### The following tasks needs to be completed as part of this assignment 
  - Create a DocumentDB cluster with TLS disabled on AWS Cloud using AWS console
  - Create an EC2 instance in the same VPC as the DocumentDB cluster
  - Create an SSH Tunnel from your local machine to the EC2 instance 
  - Implement the functionality based on the comments provided in base code
  - Respective classes/files contain the **TODO** comments for the code/task to be completed
  - Ensure that all Test cases provided are successful for assignment completion

## Reference 
   - [Creating a DocumentDB cluster on AWS](https://docs.aws.amazon.com/documentdb/latest/developerguide/getting-started.launch-cluster.html) 
   - [Launch an Amazon EC2 Instance](https://docs.aws.amazon.com/documentdb/latest/developerguide/getting-started.launch-ec2-instance.html)
   - [Creating an SSH tunnel from your local machine to EC2 instance](https://docs.aws.amazon.com/documentdb/latest/developerguide/connect-from-outside-a-vpc.html)
   - [Connecting programmatically to DocumentDB](https://docs.aws.amazon.com/documentdb/latest/developerguide/connect_programmatically.html)
   - [Documentation for CRUD with POJO using Mongo Java Driver](https://mongodb.github.io/mongo-java-driver/3.12/driver/getting-started/quick-start-pojo/)

## Instructions
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Ensure your code compiles without any errors/warning/deprecations 
- Check for code smells using SonarLint plugin from STS/IntelliJ IDE
- Follow best practices while coding