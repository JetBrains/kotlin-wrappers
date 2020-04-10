package example

import kotlinx.html.js.*
import react.*
import react.dom.*

/**
 * A TicTacToe implementation by Scott_Huang@qq.com
 * This is a port of https://reactjs.org/tutorial/tutorial.html
 */

// Renders a single square, the board has 3x3 squares
fun RBuilder.square(squareValue: String?, onClick: () -> Unit) {
    button(classes = "square") {
        val displayText = squareValue ?: ""
        +displayText
        attrs {
            onClickFunction = {
                onClick()
            }
        }
    }
}

interface BoardProps : RProps {
    var squares: Array<String?>
    var onClick: (Int) -> () -> Unit
}

class Board(props: BoardProps) : RComponent<BoardProps, RState>(props) {
    fun RBuilder.renderSquare(i: Int) {
        square(props.squares[i], props.onClick(i))
    }

    override fun RBuilder.render() {
        div {
            div(classes = "board-row") {
                renderSquare(0)
                renderSquare(1)
                renderSquare(2)
            }
            div(classes = "board-row") {
                renderSquare(3)
                renderSquare(4)
                renderSquare(5)
            }
            div(classes = "board-row") {
                renderSquare(6)
                renderSquare(7)
                renderSquare(8)
            }
        }
    }
}

fun RBuilder.board(initialSquares: Array<String?>, onClick: (Int) -> () -> Unit) = child(Board::class) {
    attrs.squares = initialSquares
    attrs.onClick = onClick
}

interface TicTacToeProps : RProps {

}

interface TicTacToeState : RState {
    var history: Array<Array<String?>>
    var xIsNext: Boolean
    var stepNumber: Int
}

// Make sure to include the CSS in your index.kt, e.g.
// require("TicTacToe.css")
class TicTacToe(props: TicTacToeProps) : RComponent<TicTacToeProps, TicTacToeState>(props) {
    override fun TicTacToeState.init(props: TicTacToeProps) {
        history = arrayOf(
            arrayOfNulls<String?>(9)
        )
        xIsNext = true
        stepNumber = 0
    }

    private fun handleClick(i: Int): () -> Unit = {
        val squares = state.history[state.stepNumber]

        if (squares[i].isNullOrEmpty() and calculateWinner(squares).isNullOrEmpty()) {
            val newSquare = (
                    squares.slice(0 until i) +
                            (if (state.xIsNext) "X" else "O") +
                            squares.slice(i + 1..8)
                    ).toTypedArray()

            val historyCopy = state.history.slice(0..state.stepNumber).toMutableList()

            historyCopy.add(newSquare)

            setState {
                history = historyCopy.toTypedArray()
                xIsNext = !xIsNext
                stepNumber = historyCopy.size - 1
            }
        }
    }

    private fun jumpTo(step: Int) {
        setState {
            stepNumber = step
            xIsNext = step % 2 == 0
        }
    }

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

    override fun RBuilder.render() {
        val historyCopy = state.history
        val current = historyCopy[state.stepNumber]

        val winner = calculateWinner(current)
        val totalStep = historyCopy.size - 1

        fun RBuilder.moves(totalStep: Int) {
            for (step in 0..totalStep) {
                val desc = if (step == 0) "Go to game start" else "Go to step #" + step.toString()
                li {
                    key = step.toString()
                    button {
                        +desc
                        attrs {
                            onClickFunction = {
                                jumpTo(step)
                            }
                        }
                    }

                }
            }
        }

        val status = if (winner.isNullOrEmpty()) {
            "Next player: " + (if (state.xIsNext) "X" else "O")
        } else {
            "Winner: " + winner
        }

        div(classes = "game") {
            div(classes = "game-board") {
                board(current, { i: Int -> handleClick(i) })
            }
            div(classes = "game-info") {
                div {
                    +status
                }
                ol {
                    moves(totalStep)
                }
            }
        }
    }
}

fun RBuilder.ticTacToe() = child(TicTacToe::class) {

}
