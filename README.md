# 🚀 Gemini AI Chat Service with Spring Boot

[![GitHub Repository](https://img.shields.io/badge/GitHub-GenAI__Integration-blue?logo=github)](https://github.com/sshekhar-04/GenAi_Integration)
[![Language](https://img.shields.io/badge/Language-Java-orange?logo=java)](https://www.java.com/)
[![Framework](https://img.shields.io/badge/Framework-Spring%20Boot-green?logo=springboot)](https://spring.io/projects/spring-boot)
[![AI Model](https://img.shields.io/badge/AI%20Model-Gemini-A020F0)](https://ai.google.com/gemini/api)

## 🌟 Overview

This project is a minimal, secure Spring Boot application that demonstrates the integration of the **Google Gemini Generative AI Model** using the **Spring AI** framework. It provides a simple, robust REST endpoint for external services to interact with the AI model.

The primary goal of this repository is to showcase proper dependency management and the secure handling of API keys using environment variables, avoiding GitHub Push Protection errors.

## ⚙️ Technology Stack

* **Core:** Java 17+
* **Framework:** Spring Boot 3
* **AI Abstraction:** Spring AI (`ChatClient`)
* **AI Provider:** Google GenAI (Gemini)

## 🔑 Prerequisites & Setup

### 1. Dependencies

Ensure your project includes the necessary Spring AI starters for Google GenAI:

* `spring-ai-bom` (in `dependencyManagement`)
* `spring-ai-google-genai-spring-boot-starter` (in `dependencies`)

### 2. Obtain and Set API Key

For security, the application retrieves the Gemini API Key from your system environment.

* **Action:** Get your key from [Google AI Studio](https://aistudio.google.com/).

* **Environment Variable Setup:**
    ```bash
    # Set this in your shell before starting the application
    export GEMINI_API_KEY="AIzaSy..." 
    ```

### 3. Application Configuration

Verify that your `src/main/resources/application.properties` file is configured to use the environment variable:

```properties
# Sets the API Key securely from the environment variable
spring.ai.google.genai.api-key=${GEMINI_API_KEY} 

# If you have other AI dependencies (like OpenAI), disable the unused one to avoid conflicts
# spring.ai.openai.chat.enabled=false
