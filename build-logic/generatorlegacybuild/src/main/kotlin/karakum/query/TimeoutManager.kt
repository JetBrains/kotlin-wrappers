package karakum.query

// language=TypeScript
internal val TIMEOUT_PROVIDER_SOURCE = """
type TimeoutProvider<TTimerId extends ManagedTimerId = ManagedTimerId> = {
    readonly setTimeout: (callback: TimeoutCallback, delay: number) => TTimerId;
    readonly clearTimeout: (timeoutId: TTimerId | undefined) => void;
    readonly setInterval: (callback: TimeoutCallback, delay: number) => TTimerId;
    readonly clearInterval: (intervalId: TTimerId | undefined) => void;
};
""".trimIndent()

// language=kotlin
internal val TIMEOUT_PROVIDER_CODE = """
@JsPlainObject
external interface TimeoutProvider {
    val setTimeout: (callback: TimerHandler, delay: Int) -> Timeout
    val clearTimeout: (timeoutId: Timeout?) -> Unit
    val setInterval: (callback: TimerHandler, delay: Int) -> Interval
    val clearInterval: (intervalId: Interval?) -> Unit
}
""".trimIndent()

// language=TypeScript
internal val TIMEOUT_MANAGER_SOURCE = """
declare class TimeoutManager implements Omit<TimeoutProvider, 'name'> {
    #private;
    setTimeoutProvider<TTimerId extends ManagedTimerId>(provider: TimeoutProvider<TTimerId>): void;
    setTimeout(callback: TimeoutCallback, delay: number): ManagedTimerId;
    clearTimeout(timeoutId: ManagedTimerId | undefined): void;
    setInterval(callback: TimeoutCallback, delay: number): ManagedTimerId;
    clearInterval(intervalId: ManagedTimerId | undefined): void;
}
""".trimIndent()

// language=kotlin
internal val TIMEOUT_MANAGER_CODE = """
open external class TimeoutManager {
    open fun setTimeoutProvider(provider: TimeoutProvider)
    open fun setTimeout(
        callback: TimerHandler,
        delay: Int,
    ): Timeout

    open fun clearTimeout(timeoutId: Timeout?)
    open fun setInterval(
        callback: TimerHandler,
        delay: Int,
    ): Interval

    open fun clearInterval(intervalId: Interval?)
}
""".trimIndent()
