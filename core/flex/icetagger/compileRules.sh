#!/usr/bin/env bash

set -e

jflex genIceRules.flex
javac genIceRules.java
java genIceRules IceRules.rul > ../../src/is/iclt/icenlp/core/icetagger/IceLocalRules.java

