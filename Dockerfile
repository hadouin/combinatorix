FROM openjdk:latest

WORKDIR /app

COPY Combinatorix.java /app

RUN javac Combinatorix.java

CMD ["java", "Combinatorix"]