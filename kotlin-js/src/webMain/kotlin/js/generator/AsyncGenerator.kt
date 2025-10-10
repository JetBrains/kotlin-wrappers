package js.generator

import js.errors.JsError
import js.iterable.AsyncIterator
import js.iterable.IteratorResult
import js.promise.Promise
import js.promise.PromiseLike
import kotlin.js.JsAny
import kotlin.js.JsName
import kotlin.js.definedExternally

private const val ASYNC_GENERATOR: String = "(async function* () {}.constructor.prototype.prototype)"

@JsName(ASYNC_GENERATOR)
external class AsyncGenerator<out T : JsAny?, TReturn : JsAny?, in TNext : JsAny?>
private constructor() :
    AsyncIterator<T> {
    override fun next(): Promise<IteratorResult<T, TReturn>>
    fun next(value: TNext = definedExternally): Promise<IteratorResult<T, TReturn>>

    fun `return`(): Promise<IteratorResult<T, TReturn?>>

    fun `return`(value: TReturn): Promise<IteratorResult<T, TReturn>>

    fun `return`(value: PromiseLike<TReturn>): Promise<IteratorResult<T, TReturn>>

    fun `throw`(error: JsError): Promise<IteratorResult<T, TReturn>>
}
