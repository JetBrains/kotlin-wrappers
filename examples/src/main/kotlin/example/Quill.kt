package example

import react.ComponentClass
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.useState

/**
 * An example of using an external React component by Scott_Huang@qq.com (Zhiliang.Huang@gmail.com)
 *
 * Run `npm install react-quill --save`
 * Add `require ("react-quill/dist/quill.snow.css")` to index.kt to include the CSS
 */

external interface ReactQuillProps : Props {
    var value: String
    var onChange: (String) -> Unit
}

@JsModule("react-quill")
@JsNonModule
external val ReactQuill: ComponentClass<ReactQuillProps>

external interface QuillProps : Props {
    var initialText: String
}

val Quill = FC<QuillProps> { props ->
    var text by useState(props.initialText)

    fun handleChange(value: String) {
        text = value
        console.log(value)
    }

    div {
        ReactQuill {
            value = text
            onChange = { handleChange(it) }
        }
    }
}

val QuillApp = FC<Props> {
    Quill {
        initialText = "Hello, World"
    }
}
