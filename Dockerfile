ARG MSVC_NAME=event-msvc-reports

FROM amazoncorretto:17-alpine-jdk as builder

ARG MSVC_NAME

COPY ./$MSVC_NAME/.mvn ./.mvn
COPY ./$MSVC_NAME/mvnw .
COPY ./$MSVC_NAME/pom.xml .

RUN ./mvnw clean package -Dmaven.test.skip -Dmaven.main.skip -Dspring-boot.repackage.skip && rm -r ./target/

COPY ./$MSVC_NAME/src ./src

RUN ./mvnw clean package -DskipTests

FROM amazoncorretto:17-alpine-jdk

ARG MSVC_NAME

WORKDIR /app

RUN mkdir ./logs

ARG TARGET_FOLDER=/target
ARG SPROFILE=default

ENV SPROFILE=${SPROFILE}

COPY --from=builder $TARGET_FOLDER/event-msvc-reports-0.0.1-SNAPSHOT.jar .

CMD java -jar event-msvc-reports-0.0.1-SNAPSHOT.jar --spring.profiles.active=$SPROFILE