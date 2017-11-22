@file:Suppress("UnsafeCastFromDynamic")

package TicTacToe

import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*

//A TicTacToe Kotlin-React implementation by Scott_Huang@qq.com
//The code try convert from below javascript version to Kotlin-React version
//https://reactjs.org/tutorial/tutorial.html
//or  https://doc.react-china.org/tutorial/tutorial.html
//The code pen javascript sample : https://codepen.io/gaearon/pen/gWWZgR?editors=0010


//------------------------------------------------------------------------------------
//to render one square, a board will hav 3*3 squares
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

//------------------------------------------------------------------------------------
//below for Board component
interface BoardProps : RProps {
    var squares: Array<String?>
    var onClick: (Int) -> () -> Unit  // we need to define correct high end fun to pass into sub components/fun
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


//------------------------------------------------------------------------------------
//Below for TicTacToe Main
interface TicTacToePros : RProps {
//nothing here, may be add some props in case TicTacToe invoke by upper component later
}

interface TicTacToeState : RState {
    var history: Array<Array<String?>>
    var xIsNext: Boolean
    var stepNumber: Int
}

class TicTacToe(props: TicTacToePros) : RComponent<TicTacToePros, TicTacToeState>(props) {

    //please add the below require definition in your app.kt or index.kt. Thanks
    //require("src/TicTacToe/TicTacToe.css")  //Include the css file

    //the TicTacToe.css contents look like below
    /*
    ol, ul {
    padding-left: 30px;
}

.board-row:after {
    clear: both;
    content: "";
    display: table;
}

.status {
    margin-bottom: 10px;
}

.square {
    background: #fff;
    border: 1px solid #999;
    float: left;
    font-size: 24px;
    font-weight: bold;
    line-height: 34px;
    height: 34px;
    margin-right: -1px;
    margin-top: -1px;
    padding: 0;
    text-align: center;
    width: 34px;
}

.square:focus {
    outline: none;
}

.kbd-navigation .square:focus {
    background: #ddd;
}

.game {
    display: flex;
    flex-direction: row;
}

.game-info {
    margin-left: 20px;
}
     */

    override fun TicTacToeState.init(props: TicTacToePros) {
        history = arrayOf(
                arrayOfNulls<String?>(9)
        )
        xIsNext = true
        stepNumber = 0
    }

    private fun handleClick(i: Int): () -> Unit = {
        //        console.log("In handle click for square: " + i.toString())//to check it does call from square with correct i
        //        console.log(state)

        val squares = state.history[state.stepNumber]

        if (squares[i].isNullOrEmpty() and calculateWinner(squares).isNullOrEmpty()) {

            //try copy existing state instead of direct change it to keep immutable
            val newSquare = (
                    squares.slice(0..i - 1) +
                            (if (state.xIsNext) "X" else "O") +
                            squares.slice(i + 1..9)
                    ).toTypedArray()
            var historyCopy = state.history.slice(0..state.stepNumber).toMutableList()
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
                val desc = if (step == 0) "Go to game start" else "Go to step# " + step.toString()
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
                board(current, { i: Int -> handleClick(i) }) //The lambda fun type is: (Int) -> () -> Unit , mean provide a Int to get a unit result function
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




