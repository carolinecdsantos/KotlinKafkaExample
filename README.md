# KotlinKafkaExample

No diretório do projeto, executar :
- docker_compose up -d

No projeto:
- gradle clean build & gradle bootRun

docker exec -it kotlinkafkaexample_kafka_1 bash
cd /opt/kafka/bin/

Listando os tópicos criados
- ./kafka-topics.sh --bootstrap-server kafka:9092 --list

Executando o console producer: 
- ./kafka-console-producer.sh --broker-list localhost:9092 --topic simple-message

Execurando o console consumer:
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic simple-message --from-beginning


