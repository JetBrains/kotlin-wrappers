@file:JsModule("@jetbrains/ring-ui/components/error-message/error-message")

package ringui

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName

external interface ErrorMessageProps : PropsWithChildren, PropsWithClassName {
    var icon: String
    var code: String
    var message: String
    var description: String
}

@JsName("default")
external val ErrorMessage: ComponentClass<ErrorMessageProps>
