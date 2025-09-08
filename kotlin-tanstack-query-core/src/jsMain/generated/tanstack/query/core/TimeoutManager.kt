// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

open external class TimeoutManager {
    open fun <TTimerId : ManagedTimerId> setTimeoutProvider(provider: TimeoutProvider<TTimerId>)
    open fun setTimeout(
        callback: TimeoutCallback,
        delay: Int,
    ): ManagedTimerId

    open fun clearTimeout(timeoutId: ManagedTimerId?)
    open fun setInterval(
        callback: TimeoutCallback,
        delay: Int,
    ): ManagedTimerId

    open fun clearInterval(intervalId: ManagedTimerId?)
}
