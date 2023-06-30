package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{animate: 'animate', animateOnce: 'animateOnce', noAnimation: 'noAnimation'}/*union*/)""")
sealed external interface WebContentsSetImageAnimationPolicyPolicy {
    companion object {
        val animate: WebContentsSetImageAnimationPolicyPolicy
        val animateOnce: WebContentsSetImageAnimationPolicyPolicy
        val noAnimation: WebContentsSetImageAnimationPolicyPolicy
    }
}
