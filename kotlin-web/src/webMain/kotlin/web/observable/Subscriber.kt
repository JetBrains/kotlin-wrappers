package js.observable

import js.core.JsAny
import js.errors.JsError
import web.abort.AbortSignal
import web.function.VoidFunction

external class Subscriber<T : JsAny?> {
    val active: Boolean
    val signal: AbortSignal

    fun next(value: T)
    fun error(error: JsError)
    fun complete()
    fun addTeardown(teardown: VoidFunction)
}
