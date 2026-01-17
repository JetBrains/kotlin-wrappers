// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api


/**
 * The scrollbar style to use in the webview.
 *
 * ## Platform-specific
 *
 * **Windows**: This option must be given the same value for all webviews.
 *
 * @since 2.8.0
 */
sealed external interface ScrollBarStyle {
    companion object {
        /**
         * The default scrollbar style for the webview.
         */
        val Default: ScrollBarStyle

        /**
         * Fluent UI style overlay scrollbars. **Windows Only**
         *
         * Requires WebView2 Runtime version 125.0.2535.41 or higher, does nothing on older versions,
         * see https://learn.microsoft.com/en-us/microsoft-edge/webview2/release-notes/?tabs=dotnetcsharp#10253541
         */
        val FluentOverlay: ScrollBarStyle
    }
}
