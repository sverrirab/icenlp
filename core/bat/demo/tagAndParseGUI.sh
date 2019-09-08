#!/usr/bin/env bash
set -e

java -Xmx512M -classpath ../../dist/IceNLPCore.jar is.iclt.icenlp.runner.TagAndParse $1 $2
