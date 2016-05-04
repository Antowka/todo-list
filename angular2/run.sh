#!/usr/bin/env bash

service docker restart
docker run -it --rm --name angular2-quickstart -v /home/anton/Desktop/Projects/JAVA/todolist/angular2:/usr/src/app -w /usr/src/app -p 3000:3000 -p 3001:3001 todo-angular npm run start