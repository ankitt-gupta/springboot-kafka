# springboot-kafka
Kafka Learnings

Kafka workflow:
![Kafka-infra-image](https://github.com/user-attachments/assets/3fc7445f-9a25-4981-b3da-c8bb791e9fdc)

Topics Image:
![image](https://github.com/user-attachments/assets/a2f90cf7-9420-442a-a0a5-84596d8659da)

Start Kafka broker version: :
//Add latter
a. kafka-server-start.bat ..\..\config\server.properties

#### After Kafka broker started:
#### step1: create topic
![image](https://github.com/user-attachments/assets/19c7f520-f10e-4b16-8851-aebafcd80709)

G:\kafka\kafka_2.13-4.0.0>   bin\windows\kafka-topics.bat --create --topic user-topic --bootstrap-server localhost:9092
--create --topic <topic-name> -bootstrap-server <locahost:9092>

![image](https://github.com/user-attachments/assets/f3acef87-889e-43d7-a88a-8d73ce35c041)

#### Step2:
kafka Producer:
bin\windows\kafka-console-producer.bat --topic user-topic --bootstrap-server localhost:9092

![image](https://github.com/user-attachments/assets/02cd71cd-6848-47b6-a133-a01613d840ce)

#### Step3:
Kafka Connsumer:
G:\kafka\kafka_2.13-4.0.0\bin\windows>kafka-console-consumer.bat --topic user-topic --from-beginning --bootstrap-server localhost:9092

#### Step4: Checking and playing around messages
Before sending message:
![image](https://github.com/user-attachments/assets/377373df-35a5-4076-bbe7-cd312d11440f)

After:
![image](https://github.com/user-attachments/assets/cf04343f-5f5a-411f-924d-eebbb2471f43)








