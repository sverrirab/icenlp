#!/bin/bash
cd `dirname $0`
java -Xms64m -Xmx512m -classpath ../dist/IceNLPServer.jar is.iclt.icenlp.server.runner.Runner --config=../configs/server.conf
		
