<h1 align="center">
  Spring Boot with Transactions
</h1>

<p>
PT-BR | Este projeto tem como objetivo principal aprofundar o entendimento sobre transações no contexto de aplicações em tempo real, explorando como as transações são gerenciadas e executadas em um ambiente dinâmico, além de fornecer uma base sólida para o estudo e prática de implementações em tempo real.
</p>

<p>
ENGLISH-USA | The main goal of this project is to deepen the understanding of transactions in the context of real-time applications, exploring how transactions are managed and executed in a dynamic environment. Furthermore, it provides a solid foundation for the study and practical implementation of real-time scenarios.
</p>


## Technologies

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- [Lombok]()
- [MySQL](https://www.mysql.com)


A API poderá ser acessada em [localhost:8081](http://localhost:8081).

## API Endpoints


```
http POST :8081/bookFlightTicket


{
  passengerInfo: {
    "name": "basant",
    "email": "basant@gmail.com",
    "source": "Bangalore",
    "destination": "BBSR",
    "travelDate": "12-28-2023",
    "pickupTime": "4.0 AM",
    "arrivalTime": "6.0 PM",
    "fare": "18000.0",
  }
  "paymentInfo": {
    "accountNo": "acc1",
    "cardType": "DEBIT"
  }
}
```