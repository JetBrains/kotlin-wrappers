package react

fun Children.forEachElement(
    children: ReactNode?,
    handler: (ReactElement<*>) -> Unit,
) {
    forEach(children) {
        val element = it.asElementOrNull()
        element?.let(handler)
    }
}
