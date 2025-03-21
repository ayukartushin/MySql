# ✅ Чек-лист паттернов проектирования

| ✅ | Паттерн                 | Проблема                                                                                      | Решение                                                                                                   |
|----|-------------------------|-----------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| ☐  | **DAO**                 | Бизнес-логика зависит от SQL-запросов и структуры БД, что делает код сложным для тестирования | Изоляция доступа к данным через методы DAO, упрощая взаимодействие с БД и тестирование.                   |
| ✅  | **DTO**                 | Передача сырых данных может привести к ошибкам и зависимости от структуры БД                  | Использование DTO для чёткой и безопасной передачи данных между слоями.                                   |
| ✅ | **Singleton**           | Нужно использовать один объект (например, соединение с БД) во многих местах                   | Гарантирует единственный экземпляр объекта и централизованный доступ к нему.                              |
| ☐  | **Service Layer**       | Смешение бизнес-логики и DAO ведет к сложному, дублирующемуся коду                           | Отделяет бизнес-логику от доступа к данным, улучшая структуру и масштабируемость приложения.              |
| ☐  | **Factory**             | Жёсткое создание объектов напрямую делает код негибким и сложным для расширения              | Скрывает создание объектов, позволяя гибко управлять зависимостями и менять реализации.                   |
| ☐  | **Dependency Injection**| Жёсткие зависимости внутри классов мешают тестированию и модификации                         | Внедрение зависимостей извне упрощает тестирование и позволяет гибко подменять реализации.                |
