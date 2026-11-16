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

        val unsafe = ("fun " in body) || body
            .splitToSequence("\n")
            .filter { it.startsWith("val ") || it.startsWith("var ") }
            /* GlobalEventHandlers */
            .map { it.substringBefore(" /* ") }
            .any { !it.endsWith("?") }

        if (name in MIXINS_WITH_REQUIRED_OVERRIDES) {
            require(unsafe) {
                "Mixin `$name` should be unsafe!"
            }
            return false
        }

        return unsafe
    }
}
