@file:JsModule("@jetbrains/ring-ui/components/alert/alert")
@file:JsNonModule

package ringui

import react.ComponentClass
import react.PropsWithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/alert/alert.js
external interface AlertProps : PropsWithClassName {
    var timeout: Int
    var onCloseRequest: () -> Unit
    var onClose: () -> Unit
    var isShaking: Boolean
    var isClosing: Boolean
    var inline: Boolean
    var showWithAnimation: Boolean
    var closeable: Boolean
    var type: AlertType
}

@JsName("default")
external val Alert: ComponentClass<AlertProps>
