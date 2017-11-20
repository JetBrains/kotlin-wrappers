import kotlinx.html.*
import kotlinx.html.js.*
import org.w3c.dom.HTMLInputElement
import react.*
import react.dom.*

interface TodoProps : RProps {
    var items: MutableList<String?>
}

interface TodoState : RState {
    var items: MutableList<String?>
    var text: String
}

class Todo(props: TodoProps) : RComponent<TodoProps, TodoState>(props) {
    override fun TodoState.init(props: TodoProps) {
        items = props.items
        text = ""

    }

    override fun RBuilder.render() {
        div {

            input(type = InputType.text, name = "itemText") {
                key = "itemText"


                attrs {
                    placeholder = "Input todo text here..."
                    onChangeFunction = {
                        val target = it.target as HTMLInputElement
                        setState {
                            text = target.value
                        }
                    }
                }
            }
            button{
                +"Add"
                attrs{
                    onClickFunction = {
                        if(state.text.isNotEmpty()){
                            setState{
                                items.add(text)
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
                                            items.removeAt(index)
                                        }
//                                        console.log(state.items)
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

fun RBuilder.todo(items: MutableList<String?> = mutableListOf("Hello", "World")) = child(Todo::class) {
    attrs.items = items
