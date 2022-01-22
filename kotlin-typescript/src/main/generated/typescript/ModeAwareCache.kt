// Automatically generated - do not modify!

package typescript

external interface ModeAwareCache<T> {
    fun get(
        key: String,
        mode: dynamic, /* ModuleKind.CommonJS | ModuleKind.ESNext | undefined */
    ): T?

    fun set(
        key: String,
        mode: dynamic, /* ModuleKind.CommonJS | ModuleKind.ESNext | undefined */
        value: T,
    ): ModeAwareCache<T>

    fun delete(
        key: String,
        mode: dynamic, /* ModuleKind.CommonJS | ModuleKind.ESNext | undefined */
    ): ModeAwareCache<T>

    fun has(
        key: String,
        mode: dynamic, /* ModuleKind.CommonJS | ModuleKind.ESNext | undefined */
    ): Boolean

    fun forEach(cb: (elem: T, key: String, mode: ModuleKind? /* ModuleKind.CommonJS | ModuleKind.ESNext | undefined */) -> Unit)
    fun size(): Int
}
