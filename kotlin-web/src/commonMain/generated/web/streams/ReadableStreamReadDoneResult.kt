// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "done",
    value = "true",
)
external class ReadableStreamReadDoneResult<T : JsAny?>
private constructor() :
    ReadableStreamReadResult<T> {
    var value: T?
}
