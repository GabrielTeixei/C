#!/bin/bash
javac PdrawMain.java
java PdrawMain ../examples/p3.pdraw  > output_3.py
python3 output_3.py