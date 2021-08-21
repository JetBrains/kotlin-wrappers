package example

/**
 * An example of using an external React component by Scott_Huang@qq.com (Zhiliang.Huang@gmail.com)
 *
 * Run `npm install react-quill --save`
 * Add `require ("react-quill/dist/quill.snow.css")` to index.kt to include the CSS
 */

import react.*
import react.dom.div

@JsModule("react-quill")
@JsNonModule
external val reactQuill: ComponentClass<ReactQuillProps>

external interface ReactQuillProps : Props {
    var value: String
    var onChange: (String) -> Unit
}

interface QuillProps : Props {
    var initialText: String
}

interface QuillState : State {
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

fun RBuilder.quill(quillValue: String) {
    child(Quill::class) {
        attrs.initialText = quillValue
    }
}
