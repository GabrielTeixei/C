#!/bin/bash
javac PdrawMain.java
java PdrawMain ../examples/p4.pdraw  > output_4.py
python3 output_4.py