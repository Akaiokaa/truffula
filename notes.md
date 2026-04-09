# Truffula Notes
As part of Wave 0, please fill out notes for each of the below files. They are in the order I recommend you go through them. A few bullet points for each file is enough. You don't need to have a perfect understanding of everything, but you should work to gain an idea of how the project is structured and what you'll need to implement. Note that there are programming techniques used here that we have not covered in class! You will need to do some light research around things like enums and and `java.io.File`.

PLEASE MAKE FREQUENT COMMITS AS YOU FILL OUT THIS FILE.

## App.java
- Uses flags -h -nc, -h shows hidden files, -nc puts no color
- By defualt files are hidden, and color is enabled by default.
- Path argument is mandatory
- -h and -nc flag orders should not matter
- We will pass the args into a TruffulaOptions object passing it to a new TruffulaPrinter
- Finally we will call a method called printTree on TrufflaPrinter
## ConsoleColor.java
- Learn Enums
- review this section and its meaning "To apply a color, prepend the ANSI code to the text, and append the RESET code"
- Colors and their respective ANSI colors
- private final string code stores the Ansi escape color for the code
- getCode() returns the ANSI escape code as a string
-toString() also for ANSI code or the ENUM to be used driectly in print statments

## ColorPrinter.java / ColorPrinterTest.java

## TruffulaOptions.java / TruffulaOptionsTest.java

## TruffulaPrinter.java / TruffulaPrinterTest.java

## AlphabeticalFileSorter.java