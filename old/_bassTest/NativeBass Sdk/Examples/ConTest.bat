@echo off
java -Djava.library.path=../lib -classpath ./;NativeBass-Examples.jar;../lib/NativeBass.jar org.jouvieje.bass.examples.ConTest BASS.WAV
pause