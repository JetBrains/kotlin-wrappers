package example

import react.ComponentClass
import react.Props
import react.VFC
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

val QuillApp = VFC {
    var text by useState("Hello, World")

    div {
        ReactQuill {
            value = text
            onChange = { text = it }
        }
    }
}
