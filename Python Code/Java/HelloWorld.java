java_code = """
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from Java in Colab!");
    }
}
"""

# Save the Java code to a file
with open("CommonClass.java", "w") as file:
    file.write(java_code)
