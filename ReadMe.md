# 🚀 Final Project – E2E Web UI Automation

## 📌 Overview
This project delivers a **comprehensive End-to-End Test Automation Suite** for the [Automation Exercise](https://automationexercise.com/) website, focusing exclusively on **Web UI testing**.  
The suite validates the complete **user journey** – from browsing products to checkout, contact form submission, and logout/session handling.

---

## 🛠 Tech Stack
- **Language:** Java
- **Frameworks:** Selenium WebDriver + TestNG
- **Design Pattern:** Page Object Model (POM)
- **Reporting:**
    - Extent Reports (with Screenshots)
    - Allure Reports (advanced visualization & history)
- **Logging:** Log4j / SLF4J (configurable)
- **Build Tool:** Maven / Gradle

---

## 📂 Project Structure
```
E2E-WebUI-Automation/
│── src/test/java/
│   ├── pages/          # Page Object Models
│   ├── tests/          # Test classes
│   ├── utils/          # Helpers (drivers, configs, waits, etc.)
│   ├── listeners/      # TestNG listeners (logs, screenshots, retries)
│── src/test/resources/
│   ├── config.properties
│   ├── log4j2.xml      # Logging configuration
│── reports/
│   ├── allure-results/
│   ├── allure-report/
│   ├── extent-report.html
│── logs/
│   ├── execution.log
│── pom.xml
│── README.md
```

---

## ✅ Scope of Work

### 1. Browse Products
- Navigate to Products page → Validate items load.
- Search product (e.g., **"T-shirt"**) → Verify results.
- Open product details → Validate **Name, Category, Price, Description**.

### 2. Add to Cart
- Add **Product A (qty: 2)** → Verify success message.
- Add **Product B** → Ensure cart badge updates.
- Navigate to Cart → Validate products, quantities, prices, totals.

### 3. Checkout & Place Order
- Checkout → Verify shipping address.
- Add optional **Order Comment**.
- Enter payment details → Confirm order.
- Validate **"Order Placed Successfully!"** message.

### 4. Contact Us ✉️
- Submit query (**Name, Email, Subject, Message**).
- Verify confirmation message.

### 5. Logout & Session Validation
- Log out.
- Try accessing account page → Must redirect to **Login Page**.

---

## ⚡️ Test Execution

### Run with Maven
```bash
mvn clean test
```

### Generate Allure Report
```bash
# Serve live report
mvn allure:serve

# Or generate static report
mvn allure:report
```

### Open Extent Report
After execution → `reports/extent-report.html`

### Logs
Execution logs are stored in:
```
logs/execution.log
```

---

## 📊 Reporting

### 🔹 Extent Reports
- Provides **detailed HTML report** with screenshots on failure.

### 🔹 Allure Reports
- Rich **visual test history & graphs**.
- Shows **steps, attachments, and logs** for each test.

### 🔹 Logs (Log4j)
- Captures test lifecycle events.
- Easy debugging of failures.

---

## 🧪 CI/CD Integration (Optional)
- Can be integrated with **Jenkins / GitHub Actions** for continuous execution.
- Reports & logs automatically archived in pipeline artifacts.

---

## 📬 Deliverables
- ✅ Fully automated test suite covering all E2E flows
- ✅ POM-based maintainable framework
- ✅ Extent + Allure reports with screenshots
- ✅ Execution logs for debugging
- ✅ Hosted on GitHub for collaboration  
