package example

/**
 * An example of using an external React component by Scott_Huang@qq.com (Zhiliang.Huang@gmail.com)
 *
 * Run `npm install react-quill --save`
 * Add `require ("react-quill/dist/quill.snow.css")` to index.kt to include the CSS
 */

import react.*
import react.dom.*

@JsModule("react-quill")
@JsNonModule
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
