# 09_DEL2
## Dice Game

## Introduction
This project is a dice game developed by IOOuterActive, a team of students from DTU. The game is designed for two players and can be played on DTU’s databar machines without noticeable delays. Players take turns rolling two dice and land on a field with numbers from 2 to 12, each having a positive or negative effect on their money balance. The game ends when a player reaches 3000.

## Game Rules
- Players start with a balance of 1000.
- Players roll two dice by typing 'r' in the console and land on a field numbered 2 to 12.
- Each field has a specific effect on the player's balance:
  - **2: Tower** (+250)
  - **3: Crater** (-100)
  - **4: Palace Gates** (+100)
  - **5: Cold Desert** (-20)
  - **6: Walled City** (+180)
  - **7: Monastery** (0)
  - **8: Black Cave** (-70)
  - **9: Huts in the Mountain** (+60)
  - **10: The Werewall** (-80, but the player gets an extra turn)
  - **11: The Pit** (-50)
  - **12: Goldmine** (+650)
- The game ends when a player reaches a balance of 3000.

## Features
- Easily translatable to other languages.
- Supports different types of dice.
- Player and balance information can be reused in other games.

## Version Control
The project uses Git for version control. Commits should be made frequently, at least once per hour during active development, and should include a brief description of the changes made. Only tested and working code should be committed to the main branch.

## Project Structure
- **Player Class**: Contains player attributes and functions.
- **Account Class**: Manages the player's balance with methods to deposit and withdraw money, ensuring the balance never goes negative.
- **Dice Class**: Contains to dice, has a Roll dice method.
- **Game Class**: Is the main controller for the game, handles turns of play and if the game is over.
- **GameBoard Class**: Handles the different field values for the each sum of dice, and prints corresponding text.
- **Main Class**: Instantiates players, and has main method.
- **Test Class**: Class for testing.

