# Algorithms Assignment 1 2016
Basic autocomplete java programme with CLI interface

###Outline
This programme reads in values from a list of values aand stores them in memory. Then the user can search against these terms for a prefix such
as "Hel" for the word "Hello".
You can also specify the mode to use (quick or brute force).
It has been designed to be easy to use, implementing a basic CLI for interaction

###How to use

Simply run Main.java in Eclipse. The user will then see a CLI with the following options
1: Specify a URL
2: Enter prefix 
3: Change autocomplete mode (not working)

These options are self-explanatory and very basic, the actual sorting algorithms are the real focus of this project. This project has two sorting algorithms, BruteAutoComplete and QuickAutoComplete.

####BruteAutoComplete
Uses a for loop to iterate through all of the terms in the ./wiki.txt file in the root of the programme and matches the input terms with the terms stored in the file. Basic but very time consuming for larger data sets.

####QuickAutoComplete (not implemented fully)
Uses Java's built in BinarySearch algorithm to perform searches against the ./wiki.txt file. Very fast but requires that the input list is sorted alphabetically.
