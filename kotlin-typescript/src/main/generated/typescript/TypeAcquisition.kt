// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface TypeAcquisition {
    /**
     * @deprecated typingOptions.enableAutoDiscovery
     * Use typeAcquisition.enable instead.
     */
    var enableAutoDiscovery: Boolean?
    var enable: Boolean?
    var include: ReadonlyArray<String>?
    var exclude: ReadonlyArray<String>?
    var disableFilenameBasedTypeAcquisition: Boolean?
    // [option: string]: CompilerOptionsValue | undefined
}
