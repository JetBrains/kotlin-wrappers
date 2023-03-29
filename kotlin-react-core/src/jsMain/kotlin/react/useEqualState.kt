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
    val equalSetter = useEqualSetter(setter)

    return StateInstance(
        value = value,
        setter = equalSetter,
    )
}
