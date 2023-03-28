package react

fun <T : Any> useEqualState(): StateInstance<T?> {
    val state = useState<T>()
    return useEqualStateInternal(state)
}

fun <T> useEqualState(
    initialValue: T,
): StateInstance<T> {
    val state = useState(initialValue)
    return useEqualStateInternal(state)
}

fun <T> useEqualState(
    initializer: () -> T,
): StateInstance<T> {
    val state = useState(initializer)
    return useEqualStateInternal(state)
}

private fun <T> useEqualStateInternal(
    state: StateInstance<T>,
): StateInstance<T> {
    val (value, setter) = state

    val equalSetter = useMemo(setter) {
        toEqualSetter(setter)
    }

    return StateInstance(
        value = value,
        setter = equalSetter,
    )
}

private fun <T> toEqualSetter(
    setter: StateSetter<T>,
): StateSetter<T> =
    { source: Any? ->
        if (jsTypeOf(source) === "function") {
            val transform = source.unsafeCast<(T) -> T>()
            setter { oldValue ->
                val newValue = transform(oldValue)
                if (newValue != oldValue) newValue else oldValue
            }
        } else {
            val newValue = source.unsafeCast<T>()
            setter { oldValue ->
                if (newValue != oldValue) newValue else oldValue
            }
        }
    }.unsafeCast<StateSetter<T>>()
