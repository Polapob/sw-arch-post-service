# Topic service

## Welcome to topic service

This service is all about topic. There are 3 important domain vocabs.

1. Forum -> The forum is the place that store related topics.
2. Topic -> The discussion of a specific issue anyone can open the topic.
3. Comment -> In each discussion, users who want to discuss about the specific topic can give comments.

Service Responsibility

1. A user can create topic that relate to the forum.
2. A comment cannot created if the topic isn't exist.
3. Forum will be create after the topic is created and the topic cannot create if the subject isn't valid in subject service.
4. A user can see all of the comments in every topic.

## Relationship diagram between domain vocabs.

![Getting Started](./images/model_relationship.png)

## Starting project

Version 1 : We don't connect with Subject service

### Step 1: Run subject service

Go to this repository https://github.com/jKulrativid/CU-Overflow-Subject-Service

### Step 2: Run message broker

```
make start_message_broker
```

### Step 3: Run topic service

```
make start_backend
```

If you finish this step, you can run every endpoint except endpoint that support message broker [/publishEvent]

### Step 4: Run topic worker

Go to this repository https://github.com/Polapob/sw-arch-topic-worker

## Api documentation

Detail api documentation via swagger -> swagger path = TBD

## System architecture

![System architecture](./images/system_architecture.png)

## FAQ

TBD
