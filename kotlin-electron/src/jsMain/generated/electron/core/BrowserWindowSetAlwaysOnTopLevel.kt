// Generated by Karakum - do not modify it manually!

package electron.core

sealed external interface BrowserWindowSetAlwaysOnTopLevel {
    companion object {
        @seskar.js.JsValue("normal")
        val normal: BrowserWindowSetAlwaysOnTopLevel

        @seskar.js.JsValue("floating")
        val floating: BrowserWindowSetAlwaysOnTopLevel

        @seskar.js.JsValue("torn-off-menu")
        val tornOffMenu: BrowserWindowSetAlwaysOnTopLevel

        @seskar.js.JsValue("modal-panel")
        val modalPanel: BrowserWindowSetAlwaysOnTopLevel

        @seskar.js.JsValue("main-menu")
        val mainMenu: BrowserWindowSetAlwaysOnTopLevel

        @seskar.js.JsValue("status")
        val status: BrowserWindowSetAlwaysOnTopLevel

        @seskar.js.JsValue("pop-up-menu")
        val popUpMenu: BrowserWindowSetAlwaysOnTopLevel

        @seskar.js.JsValue("screen-saver")
        val screenSaver: BrowserWindowSetAlwaysOnTopLevel

        @seskar.js.JsValue("dock")
        val dock: BrowserWindowSetAlwaysOnTopLevel
    }
}
