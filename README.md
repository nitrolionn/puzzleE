# The puzzle game

by Shalaev Leonid

## Endpoints 

## Create a new player

```http request
POST http://localhost:8080/api/player
request body
{
    "name" : "Lion",
    "birthDate" : "1987-07-29"
}

response body
{
    "id": 1,
    "name": "Lion",
    "birthDate": "1987-07-29"
}
```

## Create a new puzzle

```http request
POST http://localhost:8080/api/puzzle
request body
{
    "numberOfItems" : 5
}

response body
{
    "id": 2,
    "numberOfItems": 5
}
```

## Send puzzle answers to server check, and get result 

```http request
POST http://localhost:8080/exam/check/2
request body
{
    "playerId" : 1,
    "itemsFound" : [
        0,
        3,
        4
    ]
}

response body
{
    "puzzleId": 2,
    "name": "Lion",
    "missingItems": [
        1,
        2
    ]
}
```