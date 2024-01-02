package js.generator

import js.errors.JsError
import js.iterable.IteratorResult
import js.iterable.JsIterator

sealed external interface Generator<out T, TReturn, in TNext> : JsIterator<T> {
    fun next(value: TNext): IteratorResult<T, TReturn>

    fun `return`(value: TReturn): IteratorResult<T, TReturn>

    fun `throw`(error: JsError): IteratorResult<T, TReturn>
}
