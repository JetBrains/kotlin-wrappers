package js.observable

import js.errors.JsError
import web.abort.AbortSignal
import web.abort.AbortableLike
import web.experimental.ExperimentalWebApi
import web.function.VoidFunction

@ExperimentalWebApi
open external class Subscriber<T : JsAny?> :
    AbortableLike {
    open val active: Boolean
    override val signal: AbortSignal

    open fun next(value: T)
    open fun error(error: JsError)
    open fun complete()
    open fun addTeardown(teardown: VoidFunction)
}
