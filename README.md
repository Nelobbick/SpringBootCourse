# 📚 Библиотека - Spring Boot/JPA веб-приложение


Учебный проект, перенесённый с голого Spring на Spring Boot. Реализует систему учета книг в библиотеке с возможностью:
- Назначения книг читателям
- Автоматического контроля сроков возврата
- Поиска и сортировки книг

## 🎯 Цель проекта

- Перенести существующее веб-приложение с **"голого" Spring** на **Spring Boot**
- Показать умение работать с **современными Java-стеками**
- Продемонстрировать понимание **JPA/Hibernate** и управления сущностями
- Реализовать полноценное приложение с **автоконфигурацией, лёгким запуском и готовыми решениями**

## 🛠 Технический стек

| Категория       | Технологии                          |
|-----------------|-------------------------------------|
| **Backend**     | Spring Boot, Spring MVC, Spring Data JPA, Hibernate |
| **База данных** | PostgreSQL (автогенерация схемы через `ddl-auto`) |
| **Frontend**    | Thymeleaf, HTML5, CSS3              |
| **Инструменты** | Maven, Git, IntelliJ IDEA |

## 🚀 Как запустить

### Предварительные требования
- Установите [Java 17+](https://adoptium.net/)
- Установите [PostgreSQL 14+](https://www.postgresql.org/download/)
- [Maven 3.8+](https://maven.apache.org/)

1.Клонируйте репозиторий:
git clone https://github.com/Nelobbick/SpringBootCourse.git

2.Настройте подключение к БД в файле
src/main/resources/application.properties

3.Создайте базу данных при помощи файла
src/main/resources/sql/sql

4.Запустите проект

Приложение будет доступно по адресу: http://localhost:8080

📌 Что я освоил в этом проекте

-Перенос приложения с "голого" Spring на Spring Boot

-Настройку подключения к БД через application.properties

-Автоматическую генерацию схемы с помощью spring.jpa.hibernate.ddl-auto=update

-Работу с Spring Data JPA и репозиториями

-Интеграцию PostgreSQL с Spring Boot
