package js.core

external class WeakRef<T : Any>(
    target: T,
) {
    /**
     * Returns the WeakRef instance's target object, or undefined if the target object has been
     * reclaimed.
     */
    fun deref(): T?
}
