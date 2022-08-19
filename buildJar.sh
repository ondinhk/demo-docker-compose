#!/bin/bash
mvn clean package;
cp target/demo-docker-compose-0.0.1-SNAPSHOT.jar build-backend
echo "Build & move file success";