package react

fun <T : Any> setRef(
    ref: Ref<T>?,
    value: T?,
) {
    ref ?: return

    if (ref is Function<*>) {
        ref.asDynamic()(value)
    } else {
        val refObject = ref.unsafeCast<MutableRefObject<T>>()
        refObject.current = value
    }
}
