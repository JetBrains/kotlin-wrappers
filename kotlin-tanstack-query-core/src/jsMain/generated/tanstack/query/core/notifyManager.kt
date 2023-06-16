// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

typealias NotifyCallback = () -> Unit

typealias NotifyFunction = (callback: () -> Unit) -> Unit

typealias BatchNotifyFunction = (callback: () -> Unit) -> Unit

typealias BatchCallsCallback<T> = Function<Unit> /* (...args: T) => void */

external fun createNotifyManager(): dynamic /* { */

external val notifyManager: dynamic /* { */
