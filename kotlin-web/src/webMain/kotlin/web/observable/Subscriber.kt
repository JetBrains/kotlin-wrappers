package js.observable

import js.errors.JsError
import web.abort.AbortSignal
import web.abort.AbortableLike
import web.function.VoidFunction
import kotlin.js.JsAny

external class Subscriber<T : JsAny?> :
    AbortableLike {
    val active: Boolean
    override val signal: AbortSignal

    fun next(value: T)
    fun error(error: JsError)
    fun complete()
    fun addTeardown(teardown: VoidFunction)
}
