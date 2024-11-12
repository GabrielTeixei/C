#!/bin/bash
javac PdrawMain.java
java PdrawMain ../examples/p2.pdraw  > output_2.py
python3 output_2.py