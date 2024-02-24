@file:JsModule("@jetbrains/ring-ui/components/input/input")

package ringui

import react.ComponentClass
import react.PropsWithClassName
import react.RefObject
import web.html.HTMLInputElement
import web.uievents.InputEvent

// https://github.com/JetBrains/ring-ui/blob/master/components/input/input.js
external interface InputProps : PropsWithClassName {
    var value: String
    var theme: String
    var inputClassName: String
    var size: String
    var label: String
    var active: String
    var error: String
    var multiline: Boolean
    var borderless: Boolean
    var compact: Boolean
    var onChange: (InputEvent<*>) -> Unit
    var onClear: () -> Unit
    var inputRef: RefObject<HTMLInputElement>
    var enableShortcuts: Boolean
    var disabled: Boolean
    var id: String
    var placeholder: String
    var icon: String

    var renderUnderline: () -> Unit
}

@JsName("default")
external val Input: ComponentClass<InputProps>
