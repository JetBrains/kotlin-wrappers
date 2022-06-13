package react

fun <T> useRequiredContext(
    context: Context<T>,
): T & Any {
    val value = useContext(context)
    return requireNotNull(value)
}
