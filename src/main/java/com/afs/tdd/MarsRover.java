package com.afs.tdd;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        if (givenCommand == Command.MOVE) {
            if (location.getDirection() == Direction.NORTH) {
                location.setY(location.getY() + 1);
            }  if (givenCommand == Command.MOVE) {
                if (location.getDirection() == Direction.SOUTH) {
                    location.setY(location.getY() - 1);
                }
            }  if (givenCommand == Command.MOVE) {
                if (location.getDirection() == Direction.EAST) {
                    location.setX(location.getX() + 1);
                }
            }  if (givenCommand == Command.MOVE) {
                if (location.getDirection() == Direction.WEST) {
                    location.setX(location.getX()- 1);
                }
            }
        }if(givenCommand ==Command.TURN_LEFT){
            if(location.getDirection() ==  Direction.NORTH){
                location.setDirection(Direction.WEST);
            }if(location.getDirection() ==  Direction.SOUTH){
                location.setDirection(Direction.EAST);
            }if(location.getDirection() ==  Direction.EAST){
                location.setDirection(Direction.NORTH);
            }if(location.getDirection() ==  Direction.WEST){
                location.setDirection(Direction.SOUTH);
            }

        }if(givenCommand ==Command.TURN_RIGHT){
            if(location.getDirection() ==  Direction.NORTH){
                location.setDirection(Direction.EAST);
            }if(location.getDirection() ==  Direction.SOUTH){
                location.setDirection(Direction.WEST);
            }if(location.getDirection() ==  Direction.EAST){
                location.setDirection(Direction.SOUTH);
            }if(location.getDirection() ==  Direction.WEST){
                location.setDirection(Direction.NORTH);
            }

        }




    }

    public Location getCurrentLocation() {
        return location;
    }
}
