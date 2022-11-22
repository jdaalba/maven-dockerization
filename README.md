# maven-dockerization
Demo Spring Boot project using Docker, without Java or Maven installed.

## Requirements

* Docker 20.10.12 or above.
* docker-compose 1.25.0 or above.

## Run this project

After clonning this project, execute:
```shell
docker-compose build && docker-compose up
```

After app is initialized, try to make this request:
```curl
curl http://localhost:8080/hello?name=Foo
``` 
The answer body should be like:
```json
{
  "message": "Hello Foo!"
}
```
