Сервис принимает POST запросом XML-документ, содержащий неотформатированные данные, <br> и форматирует их.<br>
Для тестирования end-point подключен **OpenApi** на который можно перейти по адресу {host:port}/swagger-ui.html


Для запуска сервиса можно использовать **Docker**

```shell
mvn clean install
docker build -t xml-converter .
docker-compose -f ./docker-compose.yml up
```
**Обратите внимание, что для запуска в Docker необходим файл с переменными**