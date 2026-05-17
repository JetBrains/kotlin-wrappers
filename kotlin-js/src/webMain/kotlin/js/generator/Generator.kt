package js.generator

import js.errors.JsError
import js.iterable.IteratorResult
import js.iterable.JsIterator

private const val GENERATOR: String = "(function* () {}.constructor.prototype.prototype)"

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Generator)
 */
@JsName(GENERATOR)
open external class Generator<out T : JsAny?, TReturn : JsAny?, in TNext : JsAny?>
private constructor() :
    JsIterator<T> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Generator/next)
     */
    override fun next(): IteratorResult<T, TReturn>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Generator/next)
     */
    fun next(value: TNext): IteratorResult<T, TReturn>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Generator/return)
     */
    fun `return`(value: TReturn): IteratorResult<T, TReturn>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Generator/throw)
     */
    fun `throw`(error: JsError): IteratorResult<T, TReturn>
}
