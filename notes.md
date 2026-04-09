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
--ColorPrinter.java
- handles printing colored text to a PrintStream 
- ConsoleColor is the color used for printing
- printStream will decide the colored output will be written
- getCurrentColor() returns the current color set for the printer
- void setCurrentColor(ConsoleColor color) sets color and for subsquent print operations until it is changed or reset
- println(String message) prints message followed by a newline in the current color
- println(String message, boolean reset) about the same but allows for reset color functionality
- this(printStream, ConsoleColor.WHITE); review weird format
--ColorPrinterTest.java
- Contains tests for ColorPrinter.java
- Learn how ByteArrayOutputSteam and PrintStream interact
- ColorPrinter class is called and tested with the printStream as output
- Uses printer object to test the Color
- ConsoleColor.RESET;? Review these
- assertEquals(expectedOutput, outputStream.toString()) compares expectedOutput with the outputStream
## TruffulaOptions.java / TruffulaOptionsTest.java
- controls how the tree is displayed base on flags
- flags -h -nc path required
- TruffulaOptions() stores the root showHidden and useColor
- Tests check if the TruffulaOptions object works properly
- Tests use a temp direcotry to test
## TruffulaPrinter.java / TruffulaPrinterTest.java
- TruffulaPrinter is responsible for printing directory with optional colored output
- options determine how the tree is printed
- review private static final List<ConsoleColor> DEFAULT_COLOR_SEQUENCE = List.of(
      ConsoleColor.WHITE, ConsoleColor.PURPLE, ConsoleColor.YELLOW
  );
  -review java.io
## AlphabeticalFileSorter.java