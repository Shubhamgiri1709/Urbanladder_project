# 🛋️ Urban Ladder Website Automation

This project automates end-to-end testing of the [Urban Ladder](https://www.urbanladder.com/) e-commerce website using **Selenium WebDriver**, **Cucumber (BDD)**, and **Java** 

---

## ✅ Features Automated

- ✅ Verify Home Page Loads
- 🔍 Search for a Product ("Sofa")
- 🧰 Apply Filters on Search Results
- 🛒 Add Product to Cart
- 💳 Proceed to Checkout (with dummy shipping info)

---

## 🛠️ Tech Stack

- **Java**
- **Selenium WebDriver**
- **Cucumber (Gherkin)**
- **JUnit/TestNG**
- **WebDriverManager**
- **Maven**

---

## 📁 Project Structure
~~
Urbanladder_project/ ├── src/ │ ├── test/ │ │ ├── java/ │ │ │ ├── stepDefinitions/ # Cucumber step definitions │ │ │ ├── pageObjects/ # POM classes (HomePage, CartPage, etc.) │ │ │ ├── runners/ # Test Runner class │ │ │ └── utils/ # WebDriver setup (BaseClass) │ │ └── resources/ │ │ └── features/ # .feature file(s) in Gherkin syntax ├── pom.xml # Maven build file └── README.md ~~
