# Demo project for Spring Boot
### Web Demo

git clone https://github.com/icooci/demo.git

cd demo

mvn package

docker build -t spc .

docker run -p 8080:8080 spc
