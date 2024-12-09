package js.errors

import js.objects.JsPlainObject

@JsPlainObject
external interface ErrorOptions {
    val cause: JsError?
}
