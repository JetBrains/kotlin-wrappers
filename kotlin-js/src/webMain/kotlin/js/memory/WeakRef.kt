package js.memory

import kotlin.js.JsAny

external class WeakRef<T : JsAny>(
    target: T,
) {
    /**
     * Returns the WeakRef instance's target object, or undefined if the target object has been
     * reclaimed.
     */
    fun deref(): T?
}
