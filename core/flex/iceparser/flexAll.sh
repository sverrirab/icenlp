#!/usr/bin/env bash
set -e

./flexit.sh Preprocess
./flexit.sh Phrase_MWEP1
./flexit.sh Phrase_MWEP2
./flexit.sh Phrase_MWE
./flexit.sh Phrase_AdvP
./flexit.sh Phrase_AP
./flexit.sh Phrase_APs
./flexit.sh Phrase_NP
./flexit.sh Phrase_NP2
./flexit.sh Phrase_NPs
./flexit.sh Case_NP
./flexit.sh Case_AP
./flexit.sh Phrase_VP
./flexit.sh Phrase_PP
./flexit.sh Clean1
./flexit.sh Clean2
./flexit.sh Func_TIMEX
./flexit.sh Func_QUAL
./flexit.sh Func_SUBJ
./flexit.sh Func_SUBJ2
./flexit.sh Func_COMP
./flexit.sh Func_OBJ
./flexit.sh Func_OBJ2
./flexit.sh Func_OBJ3
./flexit.sh Phrase_Per_Line
./flexit.sh Phrase_FOREIGN
./flexit.sh TagDecoder
./flexit.sh TagEncoder
./flexit.sh Correction
./flexit.sh ErrDetect
