// Automatically generated - do not modify!

package typescript

/**
 * Type of objects whose values are all of the same type.
 * The `in` and `for-in` operators can *not* be safely used,
 * since `Object.prototype` may be modified by outside code.
 */
sealed external interface MapLike<T> {
    @seskar.js.JsNativeGetter
    operator fun get(key: String): T?

    @seskar.js.JsNativeSetter
    operator fun set(
        key: String,
        value: T?,
    )
}
