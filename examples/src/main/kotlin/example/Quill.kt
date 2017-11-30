package example

/**
 * An example to show how to leverage external react component by Scott_Huang@qq.com (Zhiliang.Huang@gmail.com)
 * An import from https://www.npmjs.com/package/react-quill
 * Date: Nov 29, 2017
 */

import react.*
import react.dom.div

//npm install react-quill --save  ==> It will install module in your project
//And then you can add below sentences in your index.kt to enable react-quill module
//require("react-quill/dist/quill.snow.css")

@JsModule("react-quill")
external val reactQuill: RClass<ReactQuillProps>

external interface ReactQuillProps : RProps {
    var value: String
    var onChange: (String) -> Unit
}

interface QuillProps : RProps {
    var initialText: String
}

interface QuillState : RState {
    var text: String
}


class Quill(props: QuillProps) : RComponent<QuillProps, QuillState>(props) {
    override fun QuillState.init(props: QuillProps) {
        text = props.initialText
    }

    private fun handleChange(value: String) {
        setState {
            text = value
        }
        console.log(value)
    }

    override fun RBuilder.render() {
        div {
            reactQuill {
                attrs {
                    value = state.text
                    onChange = { handleChange(it) }
                }
            }
        }
    }
}

fun RBuilder.quill(quillValue: String) = child(Quill::class) {
    attrs.initialText = quillValue
}
