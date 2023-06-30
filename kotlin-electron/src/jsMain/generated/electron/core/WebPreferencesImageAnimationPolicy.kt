package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{animate: 'animate', animateOnce: 'animateOnce', noAnimation: 'noAnimation'}/*union*/)""")
sealed external interface WebPreferencesImageAnimationPolicy {
    companion object {
        val animate: WebPreferencesImageAnimationPolicy
        val animateOnce: WebPreferencesImageAnimationPolicy
        val noAnimation: WebPreferencesImageAnimationPolicy
    }
}
