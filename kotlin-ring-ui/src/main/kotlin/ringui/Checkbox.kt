@file:JsModule("@jetbrains/ring-ui/components/checkbox/checkbox")
@file:JsNonModule

package ringui

import org.w3c.dom.Node
import org.w3c.dom.events.InputEvent
import react.ComponentClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/checkbox/checkbox.js
external interface CheckboxProps : WithClassName {
    var name: String
    var label: String
    var containerClassName: String
    var containerStyle: dynamic
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
