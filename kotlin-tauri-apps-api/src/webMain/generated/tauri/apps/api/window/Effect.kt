// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/window")

package tauri.apps.api.window

/**
 * Platform-specific window effects
 *
 * @since 2.0.0
 */
/* enum */
external class Effect
private constructor() {
    companion object {
        /**
         *  **macOS 10.10+**
         */
        val Titlebar: Effect

        /**
         *  **macOS 10.10+**
         */
        val Selection: Effect

        /**
         *  **macOS 10.11+**
         */
        val Menu: Effect

        /**
         *  **macOS 10.11+**
         */
        val Popover: Effect

        /**
         *  **macOS 10.11+**
         */
        val Sidebar: Effect

        /**
         *  **macOS 10.14+**
         */
        val HeaderView: Effect

        /**
         *  **macOS 10.14+**
         */
        val Sheet: Effect

        /**
         *  **macOS 10.14+**
         */
        val WindowBackground: Effect

        /**
         *  **macOS 10.14+**
         */
        val HudWindow: Effect

        /**
         *  **macOS 10.14+**
         */
        val FullScreenUI: Effect

        /**
         *  **macOS 10.14+**
         */
        val Tooltip: Effect

        /**
         *  **macOS 10.14+**
         */
        val ContentBackground: Effect

        /**
         *  **macOS 10.14+**
         */
        val UnderWindowBackground: Effect

        /**
         *  **macOS 10.14+**
         */
        val UnderPageBackground: Effect

        /**
         *  **macOS 26.0+**
         */
        val LiquidGlassRegular: Effect

        /**
         *  **macOS 26.0+**
         */
        val LiquidGlassClear: Effect

        /**
         *  **Windows 11 Only**
         */
        val Mica: Effect

        /**
         * **Windows 7/10/11(22H1) Only**
         *
         * #### Notes
         *
         * This effect has bad performance when resizing/dragging the window on Windows 11 build 22621.
         */
        val Blur: Effect

        /**
         * **Windows 10/11**
         *
         * #### Notes
         *
         * This effect has bad performance when resizing/dragging the window on Windows 10 v1903+ and Windows 11 build 22000.
         */
        val Acrylic: Effect

        /**
         * Tabbed effect that matches the system dark preference **Windows 11 Only**
         */
        val Tabbed: Effect

        /**
         * Tabbed effect with dark mode but only if dark mode is enabled on the system **Windows 11 Only**
         */
        val TabbedDark: Effect

        /**
         * Tabbed effect with light mode **Windows 11 Only**
         */
        val TabbedLight: Effect
    }
}
