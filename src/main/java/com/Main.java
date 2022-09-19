package com;

import com.command.Command;
import com.command.CommandException;
import com.command.CommandUtils;
import com.plateau.Plateau;
import com.plateau.PlateauException;
import com.plateau.PlateauUtils;
import com.rover.RoverException;
import com.rover.RoverUtils;
import com.rover.Rover;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) throws IOException {

            try {
                ArrayList<String> inputs = parseTextFromFile(args[0]);
                Plateau plateau = PlateauUtils.buildPlateauFromFile(inputs.get(0));
                List<String> intructions = inputs.subList(1, inputs.size());

                for (int i = 0; i < intructions.size(); i = i+2) {
                    Rover rover = RoverUtils.buildRoverPosition(intructions.get(i), plateau);
                   if (!rover.isChecked()) {
                       System.out.println("Rover cannot start out of the plateau");
                   }
                    List<Command> commands = CommandUtils.getCommandsFromFile(intructions.get(i + 1));
                    rover.executeCommandList(commands);
                    printFinalPosition(rover);
                }

            } catch (PlateauException | RoverException | CommandException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You should enter a file name");
            }
        }

    /**
     * Parse text file containing line instructions to get Plateau dimensions and rover instructions
     * @param filename file name
     * @return list of instructions
     *
     * @throws IOException thrown if file doesn't exist
     */
    private static ArrayList<String> parseTextFromFile(String filename) throws IOException {
        ArrayList<String> instructions = new ArrayList<>();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(filename);
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        String st;

        while ((st = bufferedReader.readLine()) != null)
            instructions.add(st);

        bufferedReader.close();
        return instructions;
    }

    /**
     * Print final position of the rover
     * @param rover rover information
     */
    private static void printFinalPosition(Rover rover) {
        System.out.println(
                String.valueOf(rover.getCoordinateX())
                        + " "
                        + String.valueOf(rover.getCoordinateY())
                        + " "
                        + rover.getOrientation().getAcronym()
        );
    }
}

