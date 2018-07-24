# basic-facebook-login
This is a demo project showcasing Automation test using BDD framework. 





# Steps
1. Open command prompt and take a pull of this repository.
```
git clone https://github.com/arghajit/basic-facebook-login.git
```
2. Go inside the root directory.
```
cd basic-facebook-login/basicfacebooklogin
```
3. Run the tests.
```
mvn clean test
```


# Pre-req
Please go to `mytest.feature` file and change the facebook *username* and *password* with a valid ones.



# Design
* This framework is build with **Page Object Model** format where each classes in `pages` dir defines an actual webpage.
* Tests are built with BDD flavour.
* At the time of execution JUnit runner bind the `Cucumber.class` and its subordinate feature files with `stepdefinations.java`. 
* `stepdefination.java` file initiates the `driver` instance and communicate with POM classes.

# Stack
* Java
* Cucumber JVM (BDD framework)
* JUnit 4
* Maven
* Selenium


# Structure
```
.
└── basic-facebook-login
    ├── README.md
    └── basicfacebooklogin
        ├── Report				# Generated Reports comes here
        │   └── ExtentReport.html
        ├── pom.xml
        └── src
            ├── main
            │   └── java
            │       ├── pages			# Page object models of Facebook
            │       │   ├── homepage.java
            │       │   └── newsfeed.java
            │       ├── stepdefinitions		# Step definations written for feature files
            │       │   └── steps.java
            │       └── utils
            │           └── BROWSER.java	# selenium driver init
            └── test
                └── java
                    ├── features		# feature files 
                    │   └── mytest.feature
                    └── tests
                        └── TestRunner.java	# JUnit Test file
```

