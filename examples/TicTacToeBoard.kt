@file:Suppress("UnsafeCastFromDynamic")

package TicTacToeBoard

import kotlinx.html.js.onClickFunction
import react.*
import react.dom.button
import react.dom.div

//We store state in Board level only in this example
//Will provide further example to store state in game level, and provide history links to navigate tic tac toe steps
//------------------------------------------------------------------------------------
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


fun RBuilder.ticTacToeBoard() = child(Board::class) {
    board()
}

//------------------------------------------------------------------------------------
//below for Board component
interface BoardProps : RProps {
    //TODO
}

interface BoardState : RState {
    var squares: Array<String?>
    var xIsNext: Boolean
}

class Board(props: BoardProps) : RComponent<BoardProps, BoardState>(props) {

    override fun BoardState.init(props: BoardProps) {
//      squares = Array(9, { i -> (i * i).toString() })
        squares = arrayOfNulls(9)
        xIsNext = true
    }


    override fun RBuilder.render() {
        val winner = calculateWinner(state.squares)
        val status = if (winner.isNullOrEmpty()) {
            "Next player: " + (if (state.xIsNext) "X" else "O")
        } else {
            "Winner: " + winner
        }

        div {
            div(classes = "status") {
                +status
            }
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

    fun handleClick(i: Int): () -> Unit = {
        if (state.squares[i].isNullOrEmpty() and calculateWinner(state.squares).isNullOrEmpty()) {
            //try copy existing state instead of direct change it to keep immutable
            val newSquare = state.squares.slice(0..i - 1) +
                    (if (state.xIsNext) "X" else "O") +
                    state.squares.slice(i + 1..9)


            setState {
                squares = newSquare.toTypedArray()
                xIsNext = !xIsNext
            }
        }
    }

    fun RBuilder.renderSquare(i: Int) {
        square(state.squares[i], handleClick(i))
    }

    fun calculateWinner(squares: Array<String?>): String? {
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
            if (!squares[a].isNullOrEmpty() and squares[a].equals(squares[b]) and squares[a].equals(squares[c])) {
                return squares[a]
            }
        }
        return null
    }
}


fun RBuilder.board() = child(Board::class) {}


//------------------------------------------------------------------------------------
//below for Square component
//it been controlled by Board component through the props

/*
//this is component version, since it only have render function, so we can change to fun version easily as below new simple version
interface SquareProps : RProps {
    var squareValue: String?
    var onClick: () -> Unit
}

class Square(props: SquareProps) : RComponent<SquareProps, RState>(props) {
    override fun RBuilder.render() {
        button(classes = "square") {
            val displayText = props.squareValue ?: ""
            +displayText
            attrs {
                onClickFunction = {
                    props.onClick()  //Scott: remember to add () here
                }
            }
        }
    }
}

fun RBuilder.square(squareValue: String?, onClick: () -> Unit) = child(Square::class) {
    attrs.squareValue = squareValue
    attrs.onClick = onClick
}
*/

fun RBuilder.square(squareValue: String?, onClick: () -> Unit) {
    button(classes = "square") {
        val displayText = squareValue ?: ""
        +displayText
        attrs {
            onClickFunction = {
                onClick()  //Scott: remember to add () here
            }
        }
    }

}
