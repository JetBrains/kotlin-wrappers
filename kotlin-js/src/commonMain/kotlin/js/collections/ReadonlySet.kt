@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.collections

external interface ReadonlySet<out T> :
    CollectionLike<@UnsafeVariance T, T>,
    ReadonlySetLike<T> {

    override val size: Int

    override fun has(key: @UnsafeVariance T): Boolean
}
