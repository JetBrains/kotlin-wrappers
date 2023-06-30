package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{appearanceBased: 'appearance-based', light: 'light', dark: 'dark', titlebar: 'titlebar', selection: 'selection', menu: 'menu', popover: 'popover', sidebar: 'sidebar', mediumLight: 'medium-light', ultraDark: 'ultra-dark', header: 'header', sheet: 'sheet', window: 'window', hud: 'hud', fullscreenUi: 'fullscreen-ui', tooltip: 'tooltip', content: 'content', underWindow: 'under-window', underPage: 'under-page'}/*union*/)""")
sealed external interface BrowserWindowConstructorOptionsVibrancy {
    companion object {
        val appearanceBased: BrowserWindowConstructorOptionsVibrancy
        val light: BrowserWindowConstructorOptionsVibrancy
        val dark: BrowserWindowConstructorOptionsVibrancy
        val titlebar: BrowserWindowConstructorOptionsVibrancy
        val selection: BrowserWindowConstructorOptionsVibrancy
        val menu: BrowserWindowConstructorOptionsVibrancy
        val popover: BrowserWindowConstructorOptionsVibrancy
        val sidebar: BrowserWindowConstructorOptionsVibrancy
        val mediumLight: BrowserWindowConstructorOptionsVibrancy
        val ultraDark: BrowserWindowConstructorOptionsVibrancy
        val header: BrowserWindowConstructorOptionsVibrancy
        val sheet: BrowserWindowConstructorOptionsVibrancy
        val window: BrowserWindowConstructorOptionsVibrancy
        val hud: BrowserWindowConstructorOptionsVibrancy
        val fullscreenUi: BrowserWindowConstructorOptionsVibrancy
        val tooltip: BrowserWindowConstructorOptionsVibrancy
        val content: BrowserWindowConstructorOptionsVibrancy
        val underWindow: BrowserWindowConstructorOptionsVibrancy
        val underPage: BrowserWindowConstructorOptionsVibrancy
    }
}
