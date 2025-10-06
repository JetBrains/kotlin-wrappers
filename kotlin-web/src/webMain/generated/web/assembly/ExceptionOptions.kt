package web.assembly

import js.objects.JsPlainObject

@JsPlainObject
external interface ExceptionOptions {
    var traceStack: Boolean?
}
