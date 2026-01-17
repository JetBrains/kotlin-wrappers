// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/app")

package tauri.apps.api.app

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
