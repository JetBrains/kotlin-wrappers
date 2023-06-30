package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{auto: 'auto', none: 'none', mica: 'mica', acrylic: 'acrylic', tabbed: 'tabbed'}/*union*/)""")
sealed external interface BrowserWindowConstructorOptionsBackgroundMaterial {
    companion object {
        val auto: BrowserWindowConstructorOptionsBackgroundMaterial
        val none: BrowserWindowConstructorOptionsBackgroundMaterial
        val mica: BrowserWindowConstructorOptionsBackgroundMaterial
        val acrylic: BrowserWindowConstructorOptionsBackgroundMaterial
        val tabbed: BrowserWindowConstructorOptionsBackgroundMaterial
    }
}
