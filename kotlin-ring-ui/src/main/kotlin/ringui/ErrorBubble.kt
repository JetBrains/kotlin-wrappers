@file:JsModule("@jetbrains/ring-ui/components/error-bubble/error-bubble")
@file:JsNonModule

package ringui

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName

external interface ErrorBubbleProps : PropsWithClassName, PropsWithChildren {
    var error: String?
}

@JsName("default")
external val ErrorBubble: ComponentClass<ErrorBubbleProps>
