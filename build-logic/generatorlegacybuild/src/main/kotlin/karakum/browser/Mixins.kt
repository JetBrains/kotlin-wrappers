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

        // TEMP
        if (name == "GlobalEventHandlers")
            return false

        if ("fun " in body)
            return true

        return body
            .splitToSequence("\n")
            .filter { it.startsWith("val ") || it.startsWith("var ") }
            .any { !it.endsWith("?") }
    }
}
