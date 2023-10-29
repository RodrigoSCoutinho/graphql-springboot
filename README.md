<h1 align="center">
  Spring with GraphQL
</h1>



API que utiliza GraphQL como camada de consulta, permitindo que solicitem exatamente os dados de que precisam. Isso oferece maior flexibilidade e eficiência, reduzindo a sobrecarga de rede e aumentando o desempenho.

## Tecnologias

- [ x ] Spring Web R
- [ x ] Spring GraphQL
- [ x ] H2Database
- [ x ] Spring Dev Tools
- [ x ] Lombok

## Como Executar

- Clonar repositório git
```
git clone https://github.com/RodrigoSCoutinho/graphql-springboot.git
```
- Construir o projeto:
```
./mvnw clean package
```


A API poderá ser acessada em [localhost:8081](http://localhost:8081).

## API Endpoints


```
http POST :8081/graphiql


{
   {
  "data": {
    "addCategory": {
      "name": "Informatica",
      "id": "c76d0378-5632-4fab-a70a-a680ffa77685"
       }
     }
   }
}
```


