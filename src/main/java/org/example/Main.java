package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start compilation");

        if (args.length < 2) {
            System.err.println("Usage: java Main <inputFile> <outputFile>");
            System.exit(404);
        }

        String filename = args[0];
        String writefile = args[1];
        System.out.println("I check file: " + filename + " to: " + writefile);

        Path path = Paths.get(filename);
        StringBuilder cods = new StringBuilder();

        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                if (line.contains("prinln ")) {
                    Ut.print(line.strip().substring(6));
                } else if (line.contains("base css black")) {
                    cods.append(Lexer.get(1));
                } else if (line.contains("base css white")){
                    cods.append(Lexer.get(2));
                }else if (line.contains("base: ")) {
                    cods.append(Parser.get(line.substring(6)));
                }else if (line.contains("println: err ")) {
                    Ut.err_print(line.substring(12));
                } else if (line.contains("avatar: ")) {
                    cods.append(Parser.getavatar(line.substring(7).strip()));
                } else if (line.contains("auto ")){
                    cods.append(Auto.get(line.substring(6)));
                }else  {
                    cods.append(line);
                }
            }

            Files.writeString(Paths.get(writefile), cods.toString());
            System.out.println("Done. Written to: " + writefile);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}