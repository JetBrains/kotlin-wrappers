// Automatically generated - do not modify!

package web.streams

import js.core.JsAny

// @JsPlainObject
sealed external interface QueuingStrategy<T : JsAny?> {
    val highWaterMark: Double?
    val size: QueuingStrategySize<T>?
}
