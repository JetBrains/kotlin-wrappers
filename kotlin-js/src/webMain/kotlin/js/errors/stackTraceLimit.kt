package js.errors

import js.core.Int53
import kotlin.js.JsQualifier

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Error/captureStackTrace)
 */
@JsQualifier("Error")
external var stackTraceLimit: Int53?
