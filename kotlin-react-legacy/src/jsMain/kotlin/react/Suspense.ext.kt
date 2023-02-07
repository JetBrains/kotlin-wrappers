package react

// 16.6+
fun SuspenseProps.fallback(handler: Render) {
    fallback = createElement<Props>(handler)
}
