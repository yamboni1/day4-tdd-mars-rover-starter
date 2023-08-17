package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MarsRoverTest {
    @Test
    void should_change_to_location_0_1_North_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(1 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_negative1_South_when_executeCommand_given_0_0_South_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(-1 , currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_1_0_East_when_executeCommand_given_0_0_EAST_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(1 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_negative1_0_West_when_executeCommand_given_0_0_West_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(-1 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.WEST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_direction_0_0_West_when_executeCommand_given_0_0_North_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.WEST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_direction_0_0_East_when_executeCommand_given_0_0_South_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_direction_0_0_North_when_executeCommand_given_0_0_East_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_direction_0_0_South_when_executeCommand_given_0_0_West_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }

    @Test
    void should_change_to_direction_0_0_East_when_executeCommand_given_0_0_North_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_direction_0_0_West_when_executeCommand_given_0_0_South_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.WEST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_direction_0_0_South_when_executeCommand_given_0_0_East_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_direction_0_0_North_when_executeCommand_given_0_0_West_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 0 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_direction_and_location_0_1_E_when_executeBatchCommand_given_0_0_North_and_command_M_and_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        List<Command> listOfCommands = new ArrayList<>();
        listOfCommands.add(Command.MOVE);
        listOfCommands.add(Command.TURN_RIGHT);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(listOfCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals( 1 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }

}
