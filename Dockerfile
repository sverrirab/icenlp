FROM debian:8

MAINTAINER Sverrir A. Berg <sab@keilir.com>

RUN apt-get update
RUN apt-get install -y openjdk-7-jdk
RUN apt-get install -y jflex
RUN apt-get install -y ant
RUN apt-get install -y texlive-latex-extra
RUN apt-get install -y texlive-fonts-recommended

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

CMD ["/icenlp/server/sh/RunServer.sh"]

