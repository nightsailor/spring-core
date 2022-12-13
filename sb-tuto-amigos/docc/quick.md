```
sudo passwd shaikabdullah8045

echo $JAVA_HOME

export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64

mvn spring-boot:run

java -jar target/demo-0.0.1-SNAPSHOT.jar --server.port=8081

sudo service postgresql start

sudo -u postgres psql

\l

ALTER USER "postgres" WITH PASSWORD 'password';

CREATE DATABASE student;

GRANT ALL PRIVILEGES ON DATABASE "student" TO postgres;

\c student

\d

SELECT * FROM student;

```