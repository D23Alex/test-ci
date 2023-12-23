#!/bin/bash

start=$(date +"%s")

ssh ${SERVER_USER}@${SERVER_HOST} << 'ENDSSH'
docker pull d23alex/test-ci:latest

CONTAINER_NAME=test-ci-app
if [ "$(docker ps -qa -f name=$CONTAINER_NAME)" ]; then
    if [ "$(docker ps -q -f name=$CONTAINER_NAME)" ]; then
        echo "Container is running -> stopping it..."
        docker stop $CONTAINER_NAME;
    fi
fi

docker run -d --rm -p 8000:8000 --name $CONTAINER_NAME d23alex/test-ci:latest

exit
ENDSSH

if [ $? -eq 0 ]; then
  exit 0
else
  exit 1
fi

end=$(date +"%s")

diff=$(($end - $start))

echo "Deployed in : ${diff}s"
