FROM openjdk:17
EXPOSE 9092
ADD target/hexagone-product.jar hexagone-product.jar
ENTRYPOINT ["java","-jar","/hexagone-product.jar.jar"]