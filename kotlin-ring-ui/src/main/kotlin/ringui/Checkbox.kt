@file:JsModule("@jetbrains/ring-ui/components/checkbox/checkbox")
@file:JsNonModule

package ringui

import org.w3c.dom.events.InputEvent
import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName
import react.PropsWithStyle

external interface CheckboxProps : PropsWithChildren, PropsWithClassName {
    var name: String
    var label: String
    var containerClassName: String
    var containerStyle: PropsWithStyle
    var cellClassName: String
    var labelClassName: String
    var defaultChecked: Boolean
    var checked: Boolean
    var indeterminate: Boolean
    var disabled: Boolean
    var onChange: (InputEvent) -> Unit
}

@JsName("default")
external val Checkbox: ComponentClass<CheckboxProps>
