package example

import react.*
import react.dom.html.InputType
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul

/**
 * A to-do list implementation by Scott_Huang@qq.com
 */

external interface TodoProps : Props {
    var initialItems: List<String?>
}

val Todo = FC<TodoProps> { props ->
    var items by useState(props.initialItems)
    var text by useState("")

    div {
        input {
            key = "itemText"
            type = InputType.text
            name = "itemText"
            value = text
            placeholder = "Add a to-do item"
            onChange = { text = it.target.value }
        }

        button {
            onClick = {
                if (text.isNotEmpty()) {
                    items = items + text
                    text = ""
                }
            }

            +"Add"
        }

        h3 {
            ul {
                for ((index, item) in items.withIndex()) {
                    li {
                        key = index.toString()

                        +item.toString()

                        button {
                            onClick = {
                                items = items.filterIndexed { i, _ -> i != index }
                            }

                            +"×"
                        }
                    }
                }
            }
        }
    }
}

val TodoApp = FC<Props> {
    val items = useMemo { listOf("Hello", "World") }

    Todo {
        initialItems = items
    }
}
