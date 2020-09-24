FROM alpine:3
ENV APP=springboot
RUN addgroup -S $APP && adduser -SDHs /sbin/nologin -G $APP $APP && mkdir -p /opt/$APP \
&& chown $APP:$APP /opt/$APP && apk update && apk add openjdk11-jre
USER $APP
ADD build/libs/* /opt/$APP/
WORKDIR /opt/$APP
ENTRYPOINT java -jar *.jar