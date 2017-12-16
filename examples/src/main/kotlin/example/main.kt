package example

import kotlinext.js.*
import react.*
import react.dom.*

fun RBuilder.app(props: RProps) {
    div {
        // Three different ways to define style properties are listed below
        attrs.jsStyle = js {
            width = "100px"
        }

        attrs {
            jsStyle {
                height = "100px"
            }
        }

        attrs.jsStyle.backgroundColor = "red"

        // Setting an attribute
        attrs.attributes["title"] = "My title"

        // Setting a custom attribute
        attrs["my-attribute"] = "my-value"
        attrs["class"] = "class"

        // Appending children from props
        props.children()
    }
}
