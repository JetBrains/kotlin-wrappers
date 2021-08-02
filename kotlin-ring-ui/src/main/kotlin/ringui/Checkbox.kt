@file:JsModule("@jetbrains/ring-ui/components/checkbox/checkbox")
@file:JsNonModule

package ringui

import kotlinext.js.Object
import org.w3c.dom.Node
import org.w3c.dom.events.InputEvent
import react.ComponentClass
import react.dom.WithClassName

external interface CheckboxProps : WithClassName {
    var name: String
    var label: String
    var containerClassName: String
    /**
     * From React docs: "The style attribute accepts a JavaScript object with camelCased properties rather than a CSS string.".
     */
    var containerStyle: Object
    var cellClassName: String
    var labelClassName: String
    var defaultChecked: Boolean
    var checked: Boolean
    var indeterminate: Boolean
    var disabled: Boolean
    var onChange: (InputEvent) -> Unit
    var children: Node
}

@JsName("default")
external val Checkbox: ComponentClass<CheckboxProps>