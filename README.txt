This project is implement for 3 TCs as below:
1. Verify new customer can be created.
2. Verify to create new account based on the customer just created above.
3. Verify deposit function work fine with the account just created.

Project Structure:
- guru99.keywords
- guru99.pages
- objects
- testcases
- utilities
- TestSuite

Detail:
- guru99.keywords: This package defines keywords drivent. These keywords have the same behavior with human acction.
Ex: loginkeyword -> This acction is scripted as user logins behavior.

- guru99.pages: This package defines element in each page. These classes will define: Element location, Set value to element Method, Get value of element Method.

- objects: This package defines Test data as an object. These fields is converted to a property of object.

- testcases: This package defines Step by Step as manual Test Case content.

- utilities: This package contain Test Data Builder, helper and others.

- TestSuite: Define Test Cases will be run

Run Test Suite:
- Right click on testng.xml file and choose run with TestNG

Test result on Console may like log below and see detail report in /testpage/test-output/index.html

[RemoteTestNG] detected TestNG version 6.12.0
Starting ChromeDriver 2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a) on port 41851
Only local connections are allowed.
Dec 16, 2018 4:59:39 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
Starting ChromeDriver 2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a) on port 23495
Only local connections are allowed.
Dec 16, 2018 4:59:52 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
Starting ChromeDriver 2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a) on port 8607
Only local connections are allowed.
Dec 16, 2018 5:00:07 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS

===============================================
Test Suite
Total tests run: 3, Failures: 0, Skips: 0
===============================================

