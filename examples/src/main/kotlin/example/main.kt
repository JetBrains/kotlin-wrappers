package example

import kotlinext.js.js
import react.RBuilder
import react.dom.div
import react.dom.jsStyle

fun RBuilder.app() {
    div {
        attrs.jsStyle = js {
            width = "100px"
        }

        attrs {
            jsStyle {
                height = "100px"
            }
        }

        attrs.jsStyle.backgroundColor = "red"
    }
}
