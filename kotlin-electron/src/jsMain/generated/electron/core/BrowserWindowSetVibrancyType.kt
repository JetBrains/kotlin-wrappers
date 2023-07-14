package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{appearanceBased: 'appearance-based', light: 'light', dark: 'dark', titlebar: 'titlebar', selection: 'selection', menu: 'menu', popover: 'popover', sidebar: 'sidebar', mediumLight: 'medium-light', ultraDark: 'ultra-dark', header: 'header', sheet: 'sheet', window: 'window', hud: 'hud', fullscreenUi: 'fullscreen-ui', tooltip: 'tooltip', content: 'content', underWindow: 'under-window', underPage: 'under-page'}/*union*/)""")
sealed external interface BrowserWindowSetVibrancyType {
    companion object {
        val appearanceBased: BrowserWindowSetVibrancyType
        val light: BrowserWindowSetVibrancyType
        val dark: BrowserWindowSetVibrancyType
        val titlebar: BrowserWindowSetVibrancyType
        val selection: BrowserWindowSetVibrancyType
        val menu: BrowserWindowSetVibrancyType
        val popover: BrowserWindowSetVibrancyType
        val sidebar: BrowserWindowSetVibrancyType
        val mediumLight: BrowserWindowSetVibrancyType
        val ultraDark: BrowserWindowSetVibrancyType
        val header: BrowserWindowSetVibrancyType
        val sheet: BrowserWindowSetVibrancyType
        val window: BrowserWindowSetVibrancyType
        val hud: BrowserWindowSetVibrancyType
        val fullscreenUi: BrowserWindowSetVibrancyType
        val tooltip: BrowserWindowSetVibrancyType
        val content: BrowserWindowSetVibrancyType
        val underWindow: BrowserWindowSetVibrancyType
        val underPage: BrowserWindowSetVibrancyType
    }
}
