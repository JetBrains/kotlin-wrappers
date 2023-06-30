package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{auto: 'auto', none: 'none', mica: 'mica', acrylic: 'acrylic', tabbed: 'tabbed'}/*union*/)""")
sealed external interface BrowserWindowSetBackgroundMaterialMaterial {
    companion object {
        val auto: BrowserWindowSetBackgroundMaterialMaterial
        val none: BrowserWindowSetBackgroundMaterialMaterial
        val mica: BrowserWindowSetBackgroundMaterialMaterial
        val acrylic: BrowserWindowSetBackgroundMaterialMaterial
        val tabbed: BrowserWindowSetBackgroundMaterialMaterial
    }
}
