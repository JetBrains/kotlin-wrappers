package js.generator

import js.core.JsAny
import js.errors.JsError
import js.iterable.IteratorResult
import js.iterable.JsIterator
import seskar.js.JsSpecialName

private const val GENERATOR: String = "(function* () {}.constructor.prototype.prototype)"

@JsSpecialName(GENERATOR)
external class Generator<out T : JsAny?, TReturn : JsAny?, in TNext : JsAny?>
private constructor() :
    JsIterator<T> {
    override fun next(): IteratorResult<T, TReturn>

    fun next(value: TNext): IteratorResult<T, TReturn>

    fun `return`(value: TReturn): IteratorResult<T, TReturn>

    fun `throw`(error: JsError): IteratorResult<T, TReturn>
}
