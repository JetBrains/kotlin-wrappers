@file:JsModule("@jetbrains/ring-ui/components/checkbox/checkbox")

package ringui

import react.CSSProperties
import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName
import web.uievents.InputEvent

external interface CheckboxProps : PropsWithChildren, PropsWithClassName {
    var name: String
    var label: String
    var containerClassName: String
    var containerStyle: CSSProperties
    var cellClassName: String
    var labelClassName: String
    var defaultChecked: Boolean
    var checked: Boolean
    var indeterminate: Boolean
    var disabled: Boolean
    var onChange: (InputEvent<*>) -> Unit
}

@JsName("default")
external val Checkbox: ComponentClass<CheckboxProps>
