@file:JsModule("@jetbrains/ring-ui/components/error-bubble/error-bubble")

package ringui

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName

external interface ErrorBubbleProps : PropsWithChildren, PropsWithClassName {
    var error: String?
}

@JsName("default")
external val ErrorBubble: ComponentClass<ErrorBubbleProps>
