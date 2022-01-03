package example

import react.FC
import react.Props
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ol
import react.key
import react.useState

/**
 * A TicTacToe implementation by Scott_Huang@qq.com
 * This is a port of https://reactjs.org/tutorial/tutorial.html
 */

external interface SquareProps : Props {
    var squareValue: String?
    var onClick: () -> Unit
}

// Renders a single square, the board has 3x3 squares
val Square = FC<SquareProps> { props ->
    button {
        className = "square"
        onClick = { props.onClick() }

        val displayText = props.squareValue ?: ""
        +displayText
    }
}

external interface BoardProps : Props {
    var squares: Array<String?>
    var onClick: (Int) -> Unit
}

val Board = FC<BoardProps> { props ->
    div {
        div {
            className = "board-row"

            Square {
                squareValue = props.squares[0]
                onClick = { props.onClick(0) }
            }
            Square {
                squareValue = props.squares[1]
                onClick = { props.onClick(1) }
            }
            Square {
                squareValue = props.squares[2]
                onClick = { props.onClick(2) }
            }
        }
        div {
            className = "board-row"

            Square {
                squareValue = props.squares[3]
                onClick = { props.onClick(3) }
            }
            Square {
                squareValue = props.squares[4]
                onClick = { props.onClick(4) }
            }
            Square {
                squareValue = props.squares[5]
                onClick = { props.onClick(5) }
            }
        }
        div {
            className = "board-row"

            Square {
                squareValue = props.squares[6]
                onClick = { props.onClick(6) }
            }
            Square {
                squareValue = props.squares[7]
                onClick = { props.onClick(7) }
            }
            Square {
                squareValue = props.squares[8]
                onClick = { props.onClick(8) }
            }
        }
    }
}

external interface TicTacToeProps : Props

private fun calculateWinner(squares: Array<String?>): String? {
    val lines = arrayOf(
        intArrayOf(0, 1, 2),
        intArrayOf(3, 4, 5),
        intArrayOf(6, 7, 8),
        intArrayOf(0, 3, 6),
        intArrayOf(1, 4, 7),
        intArrayOf(2, 5, 8),
        intArrayOf(0, 4, 8),
        intArrayOf(2, 4, 6)
    )

    for (row in lines) {
        val a = row[0]
        val b = row[1]
        val c = row[2]
        if (!squares[a].isNullOrEmpty()) {
            if (squares[a].equals(squares[b])) {
                if (squares[a].equals(squares[c])) {
                    return squares[a]
                }
            }
        }
    }
    return null
}

// Make sure to include the CSS in your index.kt, e.g.
// require("TicTacToe.css")
val TicTacToe = FC<TicTacToeProps> {
    var history by useState(arrayOf(arrayOfNulls<String?>(9)))
    var xIsNext by useState(true)
    var stepNumber by useState(0)

    fun handleClick(i: Int) {
        val squares = history[stepNumber]

        if (squares[i].isNullOrEmpty() and calculateWinner(squares).isNullOrEmpty()) {
            val newSquare = (
                    squares.slice(0 until i) +
                            (if (xIsNext) "X" else "O") +
                            squares.slice(i + 1..8)
                    )
                .toTypedArray()

            val historyCopy = history.slice(0..stepNumber).toMutableList()

            historyCopy.add(newSquare)

            history = historyCopy.toTypedArray()
            xIsNext = !xIsNext
            stepNumber = historyCopy.size - 1
        }
    }

    fun jumpTo(step: Int) {
        stepNumber = step
        xIsNext = step % 2 == 0
    }

    val historyCopy = history
    val current = historyCopy[stepNumber]

    val winner = calculateWinner(current)
    val totalStep = historyCopy.size - 1

    val status = if (winner.isNullOrEmpty()) {
        "Next player: ${if (xIsNext) "X" else "O"}"
    } else {
        "Winner: $winner"
    }

    div {
        className = "game"

        div {
            className = "game-board"

            Board {
                squares = current
                onClick = { i: Int -> handleClick(i) }
            }
        }
        div {
            className = "game-info"

            div {
                +status
            }
            ol {
                for (step in 0..totalStep) {
                    val desc = if (step == 0) "Go to game start" else "Go to step #$step"
                    li {
                        key = step.toString()
                        button {
                            onClick = { jumpTo(step) }

                            +desc
                        }
                    }
                }
            }
        }
    }
}

val TicTacToeApp = FC<Props> {
    TicTacToe()
}
