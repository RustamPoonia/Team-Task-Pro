# Contributing to Team Task Pro

Thank you for considering contributing to Team Task Pro 🎉  
We welcome contributions from developers of all experience levels.

Team Task Pro is a Spring Boot-based team management system that includes authentication, role-based authorization, task assignment, and email verification.

------------------------------------------------------------

## 🚀 Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Security (JWT)
- Spring Data JPA
- MySQL
- Maven
- Swagger (if enabled)

------------------------------------------------------------

## 📌 How to Contribute

### 1️⃣ Fork the Repository

Click the Fork button on GitHub.

Then clone your fork:

git clone https://github.com/your-username/team-task-pro.git
cd team-task-pro

------------------------------------------------------------

### 2️⃣ Create a Branch

Always create a new branch before making changes:

git checkout -b feature/your-feature-name

Branch naming conventions:

- feature/...
- bugfix/...
- refactor/...
- docs/...

Example:
git checkout -b feature/add-pagination

------------------------------------------------------------

### 3️⃣ Setup the Project Locally

Make sure you have:

- Java 17+
- MySQL installed
- Maven installed

Update your application.properties with your local DB credentials.

Run the project:

mvn spring-boot:run

OR

./mvnw spring-boot:run

------------------------------------------------------------

### 4️⃣ Coding Guidelines

- Follow clean architecture (Controller → Service → Repository)
- Use meaningful variable names
- Avoid hardcoding values
- Write reusable and modular code
- Handle exceptions properly
- Follow REST standards for APIs
- Add validation where necessary

------------------------------------------------------------

### 5️⃣ Writing Commit Messages

Use clear commit messages.

Good example:
Add pagination support to user listing API

Avoid:
Updated code
Fixed bug
Changes done

------------------------------------------------------------

### 6️⃣ Before Creating Pull Request

Please ensure:

- Code compiles successfully
- No unnecessary files are committed
- Application runs without errors
- Changes are tested
- No sensitive data (DB passwords, secrets) are committed

------------------------------------------------------------

### 7️⃣ Creating Pull Request

Push your branch:

git push origin feature/your-feature-name

Then create a Pull Request on GitHub.

In PR description, mention:

- What changes you made
- Why they were needed
- Screenshots (if UI change)
- Related issue number (if any)

------------------------------------------------------------

## 🟢 Good First Issues

If you're new to the project, start with issues labeled:

- good first issue
- help wanted
- documentation

These are beginner-friendly tasks.

------------------------------------------------------------

## 🐛 Reporting Bugs

If you find a bug:

- Open an issue
- Provide steps to reproduce
- Mention expected behavior
- Add screenshots if possible

------------------------------------------------------------

## 💡 Feature Requests

We welcome suggestions.

Please:

- Explain the feature clearly
- Mention use case
- Keep scope realistic

------------------------------------------------------------

## 📜 Code of Conduct

- Be respectful
- Keep discussions constructive
- No spam or abusive behavior

------------------------------------------------------------

## 🙌 Thank You

Your contribution helps improve Team Task Pro and supports open-source learning.

Happy coding 🚀
