import kotlinx.html.*
import kotlinx.html.js.*
import org.w3c.dom.HTMLInputElement
import react.*
import react.dom.*

interface TodoProps : RProps {
    var initialItems: List<String?>   //revise to immutable per Hypnosphi  proposal.
}

interface TodoState : RState {
    var items: List<String?>
    var text: String
}

class Todo(props: TodoProps) : RComponent<TodoProps, TodoState>(props) {
    override fun TodoState.init(props: TodoProps) {
        items = props.initialItems
        text = ""
    }

    override fun RBuilder.render() {
        div {

            input(type = InputType.text, name = "itemText") {
                key = "itemText"


                attrs {
                    value = state.text
                    placeholder = "Input todo text here..."
                    onChangeFunction = {
                        val target = it.target as HTMLInputElement
                        setState {
                            text = target.value
                        }
                    }
                }
            }

            button {
                +"Add"
                attrs {
                    onClickFunction = {
                        if (state.text.isNotEmpty()) {
                            setState {
                                items += text
                                text = ""  //clear the input text after add to list
                            }
                        }
                    }
                }
            }


//            +state.text


            h3 {
                ul {
                    for ((index, item) in state.items.withIndex()) {
                        li {
                            key = index.toString()
                            +item.toString()
                            button {
                                +"X"
                                attrs {
                                    onClickFunction = {
                                        //                                        console.log(index, item)
                                        setState {
                                            items = items.filterIndexed { i, _ -> i != index }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}

fun RBuilder.todo(items: List<String?> = listOf("Hello", "World")) = child(Todo::class) {
    attrs.initialItems = items
}
