# Journal
What did you accomplish in this phase, and what do you understand about the difference between checked exceptions (classes extending Exception) and unchecked exceptions (classes extending RuntimeException)?

In this phase, I implemented a custom checked exception hierarchy, used Random to simulate runtime outcomes, and tested the behavior using a try-catch block in the main method.

The primary difference between checked and unchecked exceptions involves how the compiler enforces handling during compilation. Checked exceptions require explicit handling or declaration, whereas unchecked exceptions extend RuntimeException and bypass mandatory compiler checks.



____________________


What happens to program execution when you place the try-catch block inside the loop versus wrapping the entire loop in a single try block? How does this choice affect error recovery?

Placing the try-catch block inside the loop allows the program to recover from an error and continue processing the remaining items in the loop, whereas wrapping the entire loop stops the execution on the first exception and skips all other iterations.
Inside the loop, each iteration is isolated; when an exception occurs, the catch block handles it locally, and the loop proceeds to the next item.