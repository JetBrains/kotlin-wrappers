package karakum.browser

internal object Mixins {
    fun isUnsafeMixin(
        name: String,
        body: String,
    ): Boolean {
        if (!IDLRegistry.isMixin(name))
            return false

        if (name == "GenericTransformStream")
            return false

        if ("fun " in body)
            return true

        return body
            .splitToSequence("\n")
            .filter { it.startsWith("val ") || it.startsWith("var ") }
            /* GlobalEventHandlers */
            .map { it.substringBefore(" /* ") }
            .any { !it.endsWith("?") }
    }
}
