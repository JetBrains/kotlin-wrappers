package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{followWindow: 'followWindow', active: 'active', inactive: 'inactive'}/*union*/)""")
sealed external interface BrowserWindowConstructorOptionsVisualEffectState {
    companion object {
        val followWindow: BrowserWindowConstructorOptionsVisualEffectState
        val active: BrowserWindowConstructorOptionsVisualEffectState
        val inactive: BrowserWindowConstructorOptionsVisualEffectState
    }
}
