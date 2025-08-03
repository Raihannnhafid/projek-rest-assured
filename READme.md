<h1 align="center">
  <em>🔍 REST API Testing with Rest Assured</em>
</h1>

<p align="center">
  <em>Automate Testing, Ensure Quality, Accelerate Innovation</em>
</p>

<p align="center">
  <img src="https://img.shields.io/github/last-commit/Raihannnhafid/projek-minggu-5-rest-assured?style=flat-square" />
  <img src="https://img.shields.io/github/languages/top/Raihannnhafid/projek-minggu-5-rest-assured?style=flat-square&logo=java&label=Java" />
  <img src="https://img.shields.io/github/languages/count/Raihannnhafid/projek-minggu-5-rest-assured?style=flat-square" />
</p>

<p align="center">
  <em>Built with the tools and technologies:</em>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-11-blue.svg" />
  <img src="https://img.shields.io/badge/RestAssured-5.5.0-brightgreen.svg" />
  <img src="https://img.shields.io/badge/TestNG-7.9.0-orange.svg" />
  <img src="https://img.shields.io/badge/Build-Maven-yellow.svg" />
</p>

---

## 📖 Project Description
This project is a simple but powerful example of automated REST API testing using **Java**, **Rest Assured**, and **TestNG**. It is built to demonstrate how to write clear and maintainable API test cases using modern tools in the Java ecosystem.

The goal of this project is to :
- Validate REST API endpoints efficiently.
- Automate test execution using Maven and TestNG.
- Learn industry-relevant skills for Quality Assurance and Backend Testing.

Whether you're just starting to learn about API automation or practicing for a QA engineer role, this project is a practical learning resource to help you understand the basic structure, libraries, and tools used in API testing.

## 🚀 Quick Installation

1. **Clone the repository**:

   ```bash
     git clone https://github.com/Raihannnhafid/projek-minggu-5-rest-assured.git
    ```
2. **Navigate to the project folder**:
    ```bash
    cd projek-minggu-5-rest-assured
    ```
3. **Open the project in VS Code:**:
    ```bash
    code .
    ```

---

## ▶️ Run All Tests
**To run all automated tests:**
```bash
mvn clean test
```

## 📁 Run Specific Test Suite
**To run tests using a specific suite (e.g., testng.xml):**
```bash
mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml
```

---

## ⚠️ Prerequisite: External API Required
This project depends on an external Django-based API service named **`simra-api`** to validate the tested endpoints.The login interface shown in the image above (`http://127.0.0.1:8000/admin`) belongs to the **simra-api** project.

To run this project successfully, make sure to:

1. Clone and run the simra-api project locally.
2. Ensure it's running on http://127.0.0.1:8000.
3. Use correct credentials to log in via the Django Admin panel.
3. Configure any API endpoints as needed in your test files.

