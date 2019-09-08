FROM debian:8

MAINTAINER Sverrir A. Berg <sab@keilir.com>

RUN apt-get update &&  apt-get install -y --no-install-recommends \
    jflex                       \
    ant                         \
    ant-optional                \
    openjdk-7-jdk               \
    texlive-latex-extra         \
    texlive-fonts-recommended

ENV JAVA_TOOL_OPTIONS "-Dfile.encoding=UTF8"

ADD . /icenlp

WORKDIR /icenlp/core/flex/icetagger
RUN ./compileRules.sh

WORKDIR /icenlp/core/flex/iceparser
RUN ./flexAll.sh

WORKDIR /icenlp/core
RUN ant

WORKDIR /icenlp/server
RUN ant

EXPOSE 1234

CMD ["/icenlp/server/sh/RunServerInDocker.sh"]
