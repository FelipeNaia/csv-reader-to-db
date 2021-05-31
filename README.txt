PUT: localhost:8082/pessoa
{
    "nome": "Felipe Naia",
    "cpf": "05661733100",
    "nascimento": "2020-05-30T13:49:59.955418",
    "contatos": [
        {
            "nome": "Foo Novo",
            "telefone": "69696969",
            "email": "teste@teste"
        },
        {
            "nome": "Joao da Silva",
            "telefone": "69696969",
            "email": "testepi.@rambola"
        }
    ]
}

POST: localhost:8082/pessoa
{
    "id": 27,
    "nome": "Felipe Naia",
    "cpf": "05661733100",
    "nascimento": "2020-05-30T13:49:59.955418",
    "contatos": [
        {
            "id": 14,
            "nome": "Foo Novo 4",
            "telefone": "69696969",
            "email": "teste@teste"
        },
        {
            "id": 15,
            "nome": "Joao da Silva",
            "telefone": "69696969",
            "email": "testep@rambola"
        }
    ]
}

GET: localhost:8082/pessoa/{id}

GET: localhost:8082/pessoa/lista?page=0&size=5