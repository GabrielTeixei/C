#!/bin/bash
javac PdrawMain.java
java PdrawMain ../examples/p1.pdraw  > output_1.py
python3 output_1.py