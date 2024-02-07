package js.collections

external interface ReadonlySet<out T> :
    CollectionLike<@UnsafeVariance T, T> {

    val size: Int

    fun has(key: @UnsafeVariance T): Boolean
}
