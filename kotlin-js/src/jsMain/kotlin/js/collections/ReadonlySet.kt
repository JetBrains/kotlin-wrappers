package js.collections

external interface ReadonlySet<out T> :
    CollectionLike<@UnsafeVariance T, T>,
    SetLike<T> {

    override val size: Int

    override fun has(key: @UnsafeVariance T): Boolean
}
