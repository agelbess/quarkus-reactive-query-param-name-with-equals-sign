mvn compile quarkus:dev

curl localhost:8080/start

responds with
{"p1":"1","p2":"2","p3":"3","p4":"4","p5":null,"p6":"6"}

"p5" is the query param with name "p5="
