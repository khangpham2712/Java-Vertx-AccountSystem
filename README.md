# Prerequisite

- Docker engine

# How to run

### To start db

- docker compose up -d

### To prefill data to the database

- make db

### To start the server

- make server

### Endpoint

- You can use bloomrpc or grpc client to send request to the server
- Add proto file in the ./src/main/proto folder
- Host 127.0.0.1
- Port 50051

### Example

#### createAccount

- Input

```json
{
    "name": "done",
    "password": "headingto",
    "dob": "2000-3-24"
}
```

- Output

```json
{
    "errorCode": "0",
    "msg": "successful",
    "account": {
        "id": "49",
        "name": "done",
        "password": "$2a$12$DZjd50H/1Nt2oB/vxB3bT.T2Fm3vGAquTjT/Ct2uqCw7KY6jTqf9C",
        "dob": "2000-03-24"
    }
}
```

#### updateAccount

- Input

```json
{
    "id": "49",
    "name": "khangpt3",
    "dob": "2000-12-27"
}
```

- Output

```json
{
    "errorCode": "0",
    "msg": "successful",
    "account": {
        "id": "49",
        "name": "khangpt3",
        "password": "$2a$12$DZjd50H/1Nt2oB/vxB3bT.T2Fm3vGAquTjT/Ct2uqCw7KY6jTqf9C",
        "dob": "2000-12-27"
    }
}
```

#### viewAccount

- Input

```json
{
    "id": "1"
}
```

- Output

```json
{
    "errorCode": "0",
    "msg": "found account 1",
    "account": {
        "id": "1",
        "name": "kkkkkkkk",
        "password": "$2a$12$Sa3BV0IpDrbNXlTXWV.RIOzRfgN/L1S5tZdwJJ5Pz1Y1R/QxVN5Ve",
        "dob": "1999-01-01"
    }
}
```
