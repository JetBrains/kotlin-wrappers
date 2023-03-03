package react

fun <T> useRequiredContext(
    context: Context<T>,
): T & Any {
    val value = useContext(context)
    return requireNotNull(value)
}

fun <T : Any> useRequiredContext(
    context: RequiredContext<T>,
): T {
    val value = useContext(context)
    return requireNotNull(value)
}
