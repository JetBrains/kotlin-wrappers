package tanstack.react.router

import js.errors.JsError
import react.ComponentType
import react.ErrorInfo
import react.Props

external interface ErrorComponentProps :
    Props {
    var error: JsError
    var info: ErrorInfo
    var reset: () -> Unit
}

typealias ErrorRouteComponent = ComponentType<ErrorComponentProps>
