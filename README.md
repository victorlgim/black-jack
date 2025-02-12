# Black Jack Project in Clojure

This is a Black Jack project developed in Clojure, using Leiningen as a dependency manager and build tool. The goal of this game is to simulate the dynamics of the popular card game known as Black Jack or Twenty-One.

## Prerequisites

Before running the project, ensure you have the following tools installed:

- [Clojure](https://clojure.org/guides/getting_started)
- [Leiningen](https://leiningen.org/)

## Installation

Follow these steps to run the project:

1. Clone this repository to your local environment:

   ```shell
   git clone https://github.com/victorlgim/black_jack.git
   ```
   
2. Navigate to the project directory:

   ```shell
   cd black_jack
   ```
   
3. Install project dependencies using Leiningen:

   ```shell
   lein deps
   ```

## How to Play?

After installation and environment setup, you can start the game using the following command:

   ```shell
   lein run
   ```

The game will start, and you can interact through the terminal.

## Game Rules

Black Jack is a card game played between a player and a dealer (represented by the computer). The goal is to obtain a hand as close as possible to 21 points without exceeding it.

### Card Values

- Numbered cards (2 to 10) hold their respective values.
- J, Q, and K cards are worth 10 points each.
- The Ace (A) can be worth either 1 or 11 points, depending on the situation.

## Game Flow

1. The player places a bet.
2. The player and dealer receive two cards each, with one of the dealer's cards hidden.
3. The player decides whether to receive more cards (hit) or stop (stand).
4. If the player exceeds 21 points, they automatically lose (bust).
5. If the player stops, the dealer reveals their hidden card and decides whether to hit or stand.
6. The dealer must stand if reaching 17 points or more.
7. If the dealer exceeds 21 points, the player wins automatically.
8. If neither exceeds 21, the hand closest to 21 wins.
9. The game allows bets and keeps track of the match history.

## 📝 License

This project is licensed. See the [LICENSE](LICENSE.md) file for more details.
