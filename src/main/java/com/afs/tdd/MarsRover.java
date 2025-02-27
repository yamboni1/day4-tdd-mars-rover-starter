package com.afs.tdd;

import java.util.List;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    //TODO: the commands and function can be separated in different classes or use a design pattern, suggestion can use command pattern.
    //TODO: some if/else statements can be converted into switch/stream so it can be shorten.
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

        if (location.getDirection() == Direction.NORTH) {
            location.setY(location.getY() + 1);
        } else if (location.getDirection() == Direction.EAST) {
            location.setX(location.getX() + 1);
        }else if (location.getDirection() == Direction.SOUTH) {
                location.setY(location.getY() - 1);
            } else if (location.getDirection() == Direction.WEST) {
                location.setX(location.getX() - 1);
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
