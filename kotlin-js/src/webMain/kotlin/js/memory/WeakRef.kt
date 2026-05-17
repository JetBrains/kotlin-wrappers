package js.memory

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakRef)
 */
open external class WeakRef<T : JsAny>(
    target: T,
) {
    /**
     * Returns the WeakRef instance's target object, or undefined if the target object has been
     * reclaimed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/WeakRef/deref)
     */
    fun deref(): T?
}
