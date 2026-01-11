// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

// unhandled import: PluginListener from "./core"
// unhandled import: Image from "./image"
// unhandled import: Theme from "./window"

/**
 * Bundle type of the current application.
 */
sealed external interface BundleType {
    companion object {
        /** Windows NSIS */
        val Nsis: BundleType

        /** Windows MSI */
        val Msi: BundleType

        /** Linux Debian package */
        val Deb: BundleType

        /** Linux RPM */
        val Rpm: BundleType

        /** Linux AppImage */
        val AppImage: BundleType

        /** macOS app bundle */
        val App: BundleType
    }
}
