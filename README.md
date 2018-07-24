# basic-facebook-login
This is a demo project showcasing Automation test using BDD framework.


# Steps
1. Open command prompt and type `git clone https://github.com/arghajit/basic-facebook-login.git`
2. Go inside the folder `cd basic-facebook-login/basicfacebooklogin`
3. Follow **Execution**

# Pre-req
Please go to `mytest.feature` file and change the facebook *username* and *password* with a valid ones.

# Execution
```
mvn clean test
```

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

# Stack
* Java
* Cucumber JVM (BDD framework)
* JUnit 4
* Maven
* Selenium
