Встроенная база данных Spring
=============================

1.Использованные технологии
------------
Spring  

Maven 

H2


2.Запуск
-----------

Чтобы запустить этот проект локально введите следующие команды:

        git clone https://github.com/Zhanars/git-2.git
        cd git-2
        mvn spring-boot:run   

Доступ со следующим URL-адресом:

        http://localhost:9091/

3.База данных
-----------

К базе данных можете получить к нему доступ со следующим URL-адресом:

        http://localhost:9091/h2-console

Вводим следующие данные

        JDBC URL: jdbc:h2:mem:testdb
        User Name: sa

Для изменения слова "Hello world" на "Sample Text" выполняем

        Update student set TEXT='Sample Text' where id=1

4.Остановка сервера
-----------

Вы можете остановить доступ со следующим URL-адресом:

        http://localhost:9091/get/stop