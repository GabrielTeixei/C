#!/bin/bash
javac PdrawMain.java
java PdrawMain ../examples/p5.pdraw  > output_5.py
python3 output_5.py