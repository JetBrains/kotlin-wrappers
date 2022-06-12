package react

fun <T : Any> useRequiredContext(
    context: Context<T?>,
): T {
    val value = useContext(context)
    return requireNotNull(value)
}
