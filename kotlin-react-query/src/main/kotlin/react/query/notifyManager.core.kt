// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

typealias NotifyCallback = () -> Unit

typealias NotifyFunction = (callback: () -> Unit) -> Unit

typealias BatchNotifyFunction = (callback: () -> Unit) -> Unit

open external class NotifyManager {
    open fun <T> batch(callback: () -> T): T
    open fun schedule(callback: NotifyCallback)
    open fun <T : Function<*>> batchCalls(callback: T): T
    open fun flush()
    open fun setNotifyFunction(fn: NotifyFunction)
    open fun setBatchNotifyFunction(fn: BatchNotifyFunction)
}

external val notifyManager: NotifyManager
