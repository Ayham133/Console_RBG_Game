package com.mycompany.app;

/**
 * Command
 */
public class Command {

    private String cmd;

    public Command(String input) {
        cmd = input;
    }

    /**
     * Parses the command into something u can execute
     */
    public void parse() {
        if (cmd.isEmpty())
            return;

        final int MINIMUM_ARRAY_LENGHT_FOR_SET_COMMAND = 3;
        final int MINIMUM_ARRAY_LENGHT_FOR_DISPLAY_COMMAND = 2;

        final String SET_COMMAND = "SET";
        final String DISPLAY_COMMAD = "DISPLAY";
        final String DISPLAY_COMMAD_SHORT = "DIS";

        final String OPERAND; // the thing u want to edit;
        final String VALUE; // the value u want to assign to the operand.

        cmd.trim();
        String[] cmdParesed = cmd.split("\\s+");

        switch (cmdParesed[0].toUpperCase()) {

            case SET_COMMAND: {
                if (cmdParesed.length != MINIMUM_ARRAY_LENGHT_FOR_SET_COMMAND) {
                    throw new IllegalArgumentException("Unknown command");
                }
                OPERAND = cmdParesed[1];
                VALUE = cmdParesed[2];
                set_command(OPERAND, VALUE);
                break;
            }

            case DISPLAY_COMMAD:
            case DISPLAY_COMMAD_SHORT: {
                if (cmdParesed.length != MINIMUM_ARRAY_LENGHT_FOR_DISPLAY_COMMAND) {
                    throw new IllegalArgumentException("Unknown command");
                }

                OPERAND = cmdParesed[1];
                display_command(OPERAND);
                break;
            }

            default:
                throw new IllegalArgumentException("Unknown command");
        }
    }

    /**
     * Displays what the operand's toString is.
     */
    private void display_command(String operand) {
        final String PLAYER_NAME_OPERAND = "playerName";
        final String PLAYER_HEALTH_OPERAND = "playerHealth";
        final String SEED_OPERAND = "seed";

        switch (operand) {
            case PLAYER_NAME_OPERAND: {
                System.out.println("playerName: " + GameDefinition.player.getName());
                break;
            }

            case PLAYER_HEALTH_OPERAND: {
                System.out.println("playerHealth: " + GameDefinition.player.getHealth());
                break;
            }

            case SEED_OPERAND: {
                System.out
                        .println(
                                "seed: " + ((GameDefinition.seed != null) ? GameDefinition.seed : "not generated yet"));
                break;
            }

            default:
                throw new IllegalArgumentException("Unknown command");

        }

    }

    /**
     * Set command
     */
    private void set_command(String operand, String value) {
        final String PLAYER_NAME_OPERAND = "playerName";
        final String PLAYER_HEALTH_OPERAND = "playerHealth";
        final String SEED_OPERAND = "seed";

        switch (operand) {
            case PLAYER_NAME_OPERAND: {
                GameDefinition.player.setName(value);
                break;
            }

            case PLAYER_HEALTH_OPERAND: {
                double health;
                try {
                    health = Double.parseDouble(value);
                    GameDefinition.player.setPlayerHealth(health);
                } catch (Exception e) {
                    throw new IllegalArgumentException("Unknown command");
                }
                break;
            }

            case SEED_OPERAND: {
                Long seed = value.isEmpty() ? System.currentTimeMillis() : value.hashCode();
                GameDefinition.seed = seed;
                break;
            }

            default:
                throw new IllegalArgumentException("Unknown command");

        }

    }

}
