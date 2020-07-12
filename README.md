# SpringBootGettingStarted
Repo used to monitor progress, as I go through some spring boot tutorials.

# Running
    gradle clean build bootRun

# Testing
## With Curl
Check status
```
curl localhost:8080/actuator/health
```
Send request
```
curl -d "{"""fruitType""":"""apple""", """fruitCount""":3}" -H "Content-Type:application/json" -X POST http://localhost:8080/sample_post
```