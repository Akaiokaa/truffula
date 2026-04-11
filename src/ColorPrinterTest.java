import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorPrinterTest {

  @Test
  void testPrintlnWithRedColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message);


    String expectedOutput = ConsoleColor.RED + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }
  
  @Test
  void testPrintlnWithBlueColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.BLUE);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message);


    String expectedOutput = ConsoleColor.BLUE + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintlnMultipleWithRGBColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    

    // Act: Print the message
    String redMessage = "This line is red";
    printer.setCurrentColor(ConsoleColor.RED);
    printer.println(redMessage);

    String greenMessage = "This line is green";
    printer.setCurrentColor(ConsoleColor.GREEN);
    printer.println(greenMessage);

    String blueMessage = "This line is blue";
    printer.setCurrentColor(ConsoleColor.BLUE);
    printer.println(blueMessage);


    String expectedOutput = ConsoleColor.RED + "This line is red" + System.lineSeparator() + ConsoleColor.RESET
    + ConsoleColor.GREEN + "This line is green" + System.lineSeparator() + ConsoleColor.RESET
    + ConsoleColor.BLUE + "This line is blue" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintlnResetFalse(){
     // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.BLUE);

    // Act: Print the message
    String message = "This is blue";
    printer.println(message, false);

    String stillBlueMessage = "This still should be blue";
    printer.println(stillBlueMessage);

    String expectedOutput = ConsoleColor.BLUE + "This is blue" + System.lineSeparator() + ConsoleColor.BLUE + "This still should be blue" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintlnBlueThenMessageAfterReset() {
     // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.BLUE);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message); // currentColor + message + ConsoleColor.RESET

    String messageAfter = "this should be defualt"; //currentColor + message + ConsoleColor.RESET
    printer.println(messageAfter);


    String expectedOutput = ConsoleColor.BLUE + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET + ConsoleColor.RESET + messageAfter + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintlnBlueThenMessageMultipleAfterReset() {
     // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.BLUE);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message); // currentColor + message + ConsoleColor.RESET

    String messageAfter = "this should be defualt"; //currentColor + message + ConsoleColor.RESET
    printer.println(messageAfter);

    String messageAfter2 = "this should be defualt"; //currentColor + message + ConsoleColor.RESET
    printer.println(messageAfter2);

    String messageAfter3 = "this should be defualt"; //currentColor + message + ConsoleColor.RESET
    printer.println(messageAfter3);

    String expectedOutput = ConsoleColor.BLUE + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET + ConsoleColor.RESET + messageAfter + System.lineSeparator() + ConsoleColor.RESET + ConsoleColor.RESET + messageAfter2 + System.lineSeparator() + ConsoleColor.RESET + ConsoleColor.RESET + messageAfter3 + System.lineSeparator()+ ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintlnWithRedColorAndNewLineAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act: Print the message
    String message = "I speak for the trees\n";
    printer.println(message);


    String expectedOutput = ConsoleColor.RED + "I speak for the trees\n" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }
  
   @Test
  void testPrintlnAlternatingColorsThenMessageMultipleAfterReset() {
     // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message); // currentColor + message + ConsoleColor.RESET

    printer.setCurrentColor(ConsoleColor.BLUE);
    String messageAfter = "this should be defualt"; //currentColor + message + ConsoleColor.RESET
    printer.println(messageAfter);

    printer.setCurrentColor(ConsoleColor.WHITE);
    String messageAfter2 = "this should be defualt"; //currentColor + message + ConsoleColor.RESET
    printer.println(messageAfter2);

    String messageAfter3 = "this should be defualt"; //currentColor + message + ConsoleColor.RESET
    printer.println(messageAfter3);



    String expectedOutput = ConsoleColor.RED + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET 
    + ConsoleColor.BLUE + messageAfter + System.lineSeparator() + ConsoleColor.RESET 
    + ConsoleColor.WHITE + messageAfter2 + System.lineSeparator() + ConsoleColor.RESET + ConsoleColor.RESET 
    + messageAfter3 + System.lineSeparator()+ ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }
}
