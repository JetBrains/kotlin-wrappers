package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{regular: 'regular', accessory: 'accessory', prohibited: 'prohibited'}/*union*/)""")
sealed external interface AppSetActivationPolicyPolicy {
    companion object {
        val regular: AppSetActivationPolicyPolicy
        val accessory: AppSetActivationPolicyPolicy
        val prohibited: AppSetActivationPolicyPolicy
    }
}
