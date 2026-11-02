// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface StartAppShimServerOptions {
    /**
     * A name for this server, which lets several running copies of your app each have
     * their own. It can only contain letters, digits, `.`, `-` and `_`, and must match
     * the `ElectronAppShimServerName` of the shims that connect to it. Default is
     * `appshim`.
     */
    var name: String?
}
