package js.generator

import js.errors.JsError
import js.iterable.AsyncIterator
import js.iterable.IteratorResult
import js.promise.Promise
import js.promise.PromiseLike

sealed external interface AsyncGenerator<out T, TReturn, in TNext> : AsyncIterator<T> {
    fun next(value: TNext): Promise<IteratorResult<T, TReturn>>

    fun `return`(value: TReturn): Promise<IteratorResult<T, TReturn>>

    fun `return`(value: PromiseLike<TReturn>): Promise<IteratorResult<T, TReturn>>

    fun `throw`(error: JsError): Promise<IteratorResult<T, TReturn>>
}
