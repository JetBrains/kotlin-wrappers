package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{normal: 'normal', floating: 'floating', tornOffMenu: 'torn-off-menu', modalPanel: 'modal-panel', mainMenu: 'main-menu', status: 'status', popUpMenu: 'pop-up-menu', screenSaver: 'screen-saver'}/*union*/)""")
sealed external interface BrowserWindowSetAlwaysOnTopLevel {
    companion object {
        val normal: BrowserWindowSetAlwaysOnTopLevel
        val floating: BrowserWindowSetAlwaysOnTopLevel
        val tornOffMenu: BrowserWindowSetAlwaysOnTopLevel
        val modalPanel: BrowserWindowSetAlwaysOnTopLevel
        val mainMenu: BrowserWindowSetAlwaysOnTopLevel
        val status: BrowserWindowSetAlwaysOnTopLevel
        val popUpMenu: BrowserWindowSetAlwaysOnTopLevel
        val screenSaver: BrowserWindowSetAlwaysOnTopLevel
    }
}
