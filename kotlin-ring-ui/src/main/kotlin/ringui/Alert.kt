@file:JsModule("@jetbrains/ring-ui/components/alert/alert")
@file:JsNonModule

package ringui

import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/alert/alert.js
external interface AlertProps : WithClassName {
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
external val Alert: RClass<AlertProps>
