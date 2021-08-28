@file:JsModule("@jetbrains/ring-ui/components/input/input")
@file:JsNonModule

package ringui

import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.InputEvent
import react.ComponentClass
import react.PropsWithClassName
import react.RefObject

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
    var onChange: (InputEvent) -> Unit
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
external val Input : ComponentClass<InputProps>
