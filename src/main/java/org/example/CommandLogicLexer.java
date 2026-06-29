package org.example;

import java.util.ArrayList;
import java.util.List;

public class CommandLogicLexer {
    public record Variable(String name, String res) {}

    public static String command(String line) {
        List<String> commands_lists = new ArrayList<>(List.of("let ", "help"));

        for (String comm : commands_lists) {
            if (line.startsWith(comm)) {
                if (comm.equals("let ")) {
                    try {
                        String[] result = line.substring(4).split("=");

                        if (result.length != 2) {
                            System.err.println("Invalid let syntax. Usage: let <name>=<value>");
                            return "Error: Invalid syntax";
                        }

                        Main.variables.add(new Variable(result[0].trim(), result[1].trim()));
                        return "Variable " + result[0].trim() + " set to " + result[1].trim();
                    } catch (Exception e) {
                        System.err.println("Error parsing let command: " + e.getMessage());
                        return "Error: " + e.getMessage();
                    }
                } else if (comm.equals("help")) {
                    System.out.println("Available commands:");
                    System.out.println("  let name=value - define a variable");
                    System.out.println("  println text - print text or variable value");
                    System.out.println("  println: err text - print error message");
                    System.out.println("  base: url - set base URL");
                    System.out.println("  avatar: url - set avatar");
                    System.out.println("  auto: url - auto generate");
                    return "OK";
                }
            }
        }

        System.err.println("I don't know: " + line);
        return "Error: Unknown command";
    }
}