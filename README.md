Hello World
=============================
УСТАНОВКА
------------

Чтобы скачать с гитхаба проект запускаем команду:

      git clone https://github.com/Zhanars/git-2.git


ТРЕБОВАНИЯ
------------
Java SE Development Kit 1.8 или выше. 
Maven автоматизации сборки проектов.
Проект был протестирован в операционных системах Windows и Linux.


БЫСТРЫЙ СТАРТ
-----------

В командной строке введите следующие команды:

        mvn install           
  
        target/demo2-0.0.1-SNAPSHOT.jar   

Вы можете получить к нему доступ со следующим URL-адресом:

        http://localhost:9091/



БАЗА ДАННЫХ
-----------

К базе данных можете получить к нему доступ со следующим URL-адресом:

        http://localhost:9091/h2-console

Вводим следующие данные

        JDBC URL: jdbc:h2:mem:testdb
        User Name: sa

Для изменения слова "Hello world" на "Sample Text" выполняем

        Update student set TEXT='Sample Text' where id=1

ОСТАНОВКА СЕРВЕРА
-----------


Вы можете остановить доступ со следующим URL-адресом:

        http://localhost:9091/get/stop