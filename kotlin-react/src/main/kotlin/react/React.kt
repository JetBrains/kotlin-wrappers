package react

fun Children.forEachElement(children: Any?, handler: (ReactElement) -> Unit) =
    forEach(children) {
        val element = it.asElementOrNull()
        element?.let(handler)
    }

// 16.6+
fun SuspenseProps.fallback(handler: Render) {
    asDynamic().fallback = createElement(handler)
}
