// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface TimeoutProvider<TTimerId : ManagedTimerId> {
    val setTimeout: (callback: TimeoutCallback, delay: Int) -> TTimerId
    val clearTimeout: (timeoutId: TTimerId?) -> Unit
    val setInterval: (callback: TimeoutCallback, delay: Int) -> TTimerId
    val clearInterval: (intervalId: TTimerId?) -> Unit
}
