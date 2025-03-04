package js.memory

import js.core.JsAny

external class WeakRef<T : JsAny>(
    target: T,
) {
    /**
     * Returns the WeakRef instance's target object, or undefined if the target object has been
     * reclaimed.
     */
    fun deref(): T?
}
