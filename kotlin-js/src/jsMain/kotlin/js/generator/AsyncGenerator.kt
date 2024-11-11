package js.generator

import js.errors.JsError
import js.iterable.AsyncIterator
import js.iterable.IteratorResult
import js.promise.Promise
import js.promise.PromiseLike
import seskar.js.JsSpecialName

private const val ASYNC_GENERATOR: String = "(async function* () {}.constructor.prototype.prototype)"

@JsSpecialName(ASYNC_GENERATOR)
external class AsyncGenerator<out T, TReturn, in TNext>
private constructor() :
    AsyncIterator<T> {
    override fun next(): Promise<IteratorResult<T, TReturn>>
    fun next(value: TNext = definedExternally): Promise<IteratorResult<T, TReturn>>

    fun `return`(value: TReturn): Promise<IteratorResult<T, TReturn>>

    fun `return`(value: PromiseLike<TReturn>): Promise<IteratorResult<T, TReturn>>

    fun `throw`(error: JsError): Promise<IteratorResult<T, TReturn>>
}
