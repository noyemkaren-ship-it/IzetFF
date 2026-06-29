package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<CommandLogicLexer.Variable> variables = new ArrayList<>();

    public static void main(String[] args) {
        if (args.length == 1 && args[0].equals("--version")) {
            System.out.println("izetFF v1.0");
            System.exit(0);
        }

        if (args.length < 2) {
            System.err.println("Usage: izetFF <inputFile> <outputFile>");
            System.exit(404);
        }

        System.out.println("Start compilation");
        String filename = args[0];
        String writefile = args[1];
        System.out.println("I check file: " + filename + " to: " + writefile);

        Path path = Paths.get(filename);
        StringBuilder cods = new StringBuilder();

        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                if (line.startsWith("let ")) {
                    String result = CommandLogicLexer.command(line);
                    if (result.equals("Error")) {
                        System.err.println("Error in let command: " + line);
                    }
                    continue;
                }

                if (line.contains("println ")) {
                    String content = line.strip().substring(8).trim();

                    CommandLogicLexer.Variable var = findVariable(content);
                    if (var != null) {
                        Ut.print(var.res());
                    } else {
                        Ut.print(content);
                    }
                } else if (line.contains("base css black")) {
                    cods.append(Lexer.get(1)).append("\n");
                } else if (line.contains("base css white")) {
                    cods.append(Lexer.get(2)).append("\n");
                } else if (line.contains("base: ")) {
                    cods.append(Parser.get(line.substring(6).strip())).append("\n");
                } else if (line.contains("println: err ")) {
                    String errContent = line.substring(12).strip();
                    CommandLogicLexer.Variable var = findVariable(errContent);
                    if (var != null) {
                        Ut.err_print(var.res());
                    } else {
                        Ut.err_print(errContent);
                    }
                } else if (line.contains("avatar: ")) {
                    cods.append(Parser.getavatar(line.substring(7).strip())).append("\n");
                } else if (line.contains("auto: ")) {
                    String autoContent = line.substring(6).strip();
                    CommandLogicLexer.Variable var = findVariable(autoContent);
                    if (var != null) {
                        cods.append(Auto.get(var.res())).append("\n");
                    } else {
                        cods.append(Auto.get(autoContent)).append("\n");
                    }
                } else if (line.contains("auto ")) {
                    String autoContent = line.substring(5).strip();
                    CommandLogicLexer.Variable var = findVariable(autoContent);
                    if (var != null) {
                        cods.append(Auto.get(var.res())).append("\n");
                    } else {
                        cods.append(Auto.get(autoContent)).append("\n");
                    }
                } else if (line.contains("/1")) {
                    System.out.println("I sow /1");
                } else {
                    cods.append(line).append("\n");
                }
            }

            Files.writeString(Paths.get(writefile), cods.toString());
            System.out.println("Done. Written to: " + writefile);
            System.out.println("Variables defined: " + variables.size());

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static CommandLogicLexer.Variable findVariable(String name) {
        for (CommandLogicLexer.Variable var : variables) {
            if (var.name().equals(name)) {
                return var;
            }
        }
        return null;
    }
}