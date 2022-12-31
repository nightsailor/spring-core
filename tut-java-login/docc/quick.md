```
sudo find / -type d -wholename '*.vscode'

sudo passwd shaikabdullah8045

readlink -f $(which java)

java -version

javac -version

echo $JAVA_HOME

export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64

mvn clean package

mvn clean install

mvn spring-boot:run

java -jar target/demo-0.0.1-SNAPSHOT.jar --server.port=8081

sudo service postgresql start

sudo -u postgres psql

sudo -u postgres createdb registration

sudo -u postgres psql -d registration

sudo -u postgres psql -c "ALTER USER postgres PASSWORD 'password';"

\l

ALTER USER postgres PASSWORD 'password';

CREATE DATABASE registration;

GRANT ALL PRIVILEGES ON DATABASE registration TO postgres;

\c registration

\d

SELECT * FROM registration;

```