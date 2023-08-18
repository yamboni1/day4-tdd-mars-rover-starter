package com.afs.tdd;

import java.util.List;

public class MarsRover {

    private Location location;


    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        if (givenCommand == Command.MOVE) {
            executeCommandMove();
        } else if (givenCommand == Command.TURN_RIGHT) {
            executeCommandTurnRight();
        } else if (givenCommand == Command.TURN_LEFT) {
            executeCommandTurnLeft();
        }
    }

    private void executeCommandMove() {
        int moveUp = location.getY() + 1;
        int moveDown = location.getY() - 1;
        if (location.getDirection() == Direction.NORTH) {
            location.setY(moveUp);
        } else if (location.getDirection() == Direction.EAST) {
            location.setX(moveUp);
        } else {
            if (location.getDirection() == Direction.SOUTH) {
                location.setY(moveDown);
            } else if (location.getDirection() == Direction.WEST) {
                location.setX(moveDown);
            }
        }

    }

    private void executeCommandTurnLeft() {
        if (location.getDirection() == Direction.NORTH) {
            location.setDirection(Direction.WEST);
        } else if (location.getDirection() == Direction.SOUTH) {
            location.setDirection(Direction.EAST);
        } else if (location.getDirection() == Direction.EAST) {
            location.setDirection(Direction.NORTH);
        } else if (location.getDirection() == Direction.WEST) {
            location.setDirection(Direction.SOUTH);
        }
    }

    private void executeCommandTurnRight() {

        if (location.getDirection() == Direction.NORTH) {
            location.setDirection(Direction.EAST);
        } else if (location.getDirection() == Direction.SOUTH) {
            location.setDirection(Direction.WEST);
        } else if (location.getDirection() == Direction.EAST) {
            location.setDirection(Direction.SOUTH);
        } else if (location.getDirection() == Direction.WEST) {
            location.setDirection(Direction.NORTH);
        }
    }


    public void executeBatchCommands(List<Command> commandList) {
        commandList.forEach(this::executeCommand);
    }


    public Location getCurrentLocation() {
        return location;
    }
}
