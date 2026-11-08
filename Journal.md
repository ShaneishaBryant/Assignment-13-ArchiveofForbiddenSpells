# Journal
What did you accomplish in this phase, and what do you understand about the difference between checked exceptions (classes extending Exception) and unchecked exceptions (classes extending RuntimeException)?

In this phase, I implemented a custom checked exception hierarchy, used Random to simulate runtime outcomes, and tested the behavior using a try-catch block in the main method.

The primary difference between checked and unchecked exceptions involves how the compiler enforces handling during compilation. Checked exceptions require explicit handling or declaration, whereas unchecked exceptions extend RuntimeException and bypass mandatory compiler checks.



____________________


What happens to program execution when you place the try-catch block inside the loop versus wrapping the entire loop in a single try block? How does this choice affect error recovery?

Placing the try-catch block inside the loop allows the program to recover from an error and continue processing the remaining items in the loop, whereas wrapping the entire loop stops the execution on the first exception and skips all other iterations.
Inside the loop, each iteration is isolated; when an exception occurs, the catch block handles it locally, and the loop proceeds to the next item.



_____________________


How did you ensure that your file stream was properly closed even when an exception occurred during writing? What are the key benefits of using try-with-resources over manual closing in a finally block?

I used the try-with-resource statement to guarantee that the file stream closes automatically. Anything declared inside the parentheses of the try block closes when the block finishes executing, even for IOExceptions.
The key benefits of using try-with-resources over a finally block are that it eliminates repetitive code, lets the compiler handle resource cleanup automatically, and preserves the original exception to make debugging easier.



____________________


What did you accomplish in this phase? When reading from an external file, why does the Java compiler require you to handle FileNotFoundException or declare that it is thrown?

In this phase, I created a static method that reads a text file line by line, prints to the console, and handles errors gracefully. I also called readLog("spell_log.txt") to display the archive history and readLog("missing_grimoire.txt") to demonstrate error handling for a non-existent file.

Java requires you to handle FileNotFoundException or declare that it is thrown because external file operations depend on unpredictable factors, ensuring your code anticipates these issues rather than crashing unexpectedly.


_____________________



What issues or edge cases did you discover while testing your program? If you reviewed your work with an AI tutor, what suggestions did it provide, and how did they help you better understand exception handling and file I/O?

The only issue found was in SpellCaster.java, where the logToFile method was hardcoded with "spell_log.txt" instead of using the constant variable LOG_FILE. I made this update, and the program worked as expected. Gemini recommended introducing a timestamped audit trail, which was beyond the scope of what we covered so far, so I did not implement this recommendation. It also mentioned that the exception handling sequence in the program was properly ordered.