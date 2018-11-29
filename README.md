#Welcome to ObservePoint repo for LiveConnect Automation
This code uses ObservePoint's open API and shows how you can implement LiveConnect for UI Automation

src/test/java/UiTests.java contains example of implementation for Selenium:

in method annotated by @BeforeSuite:
    - creates folder with name: 'LiveConnectAutomation' in your ObservePoint account (if doesn't exist)
    - creates LiveConnect's device and journey with default values
    - attaches rules with provided names to created journey
    - starts journey recording

in method annotated by @AfterSuite:
    - Stops recording of LiveConnect Journey

in method annotated by @BeforeMethod:
    - creates step inside journey
    - creates instance of Selenium WebDriver with proxy settings of LiveConnect

in method annotated by @AfterMethod:
    - change step's name to test's name
    - close Selenium WebDriver


## Getting Started
- Download project to your machine

### Prerequisites
- Install Chrome browser
- Install JDK 1.8 in your system and configure global JAVA_HOME variable
- Install Maven 3 in your system and configure global MAVEN_HOME variable

##For running LiveConnect tests example do the following:
- Navigate to src/test/java/UiTests.java and fill fields:
    **apiKey** you can found it on https://app.observepoint.com/account/user
    **rules** input rule names from https://app.observepoint.com/rules which you want to attach to journey
- Open terminal, navigate to project's directory, execute command:
```
mvn clean install test -DsuiteFile=uiTests.xml
```

## Author
* **Alex Kokhanchuk**