// Automatically generated - do not modify!

package electron.core

external interface NativePixmap {
    /**
     * Each plane's info of the shared texture.
     *
     * @platform linux
     */
    var planes: js.array.ReadonlyArray<Planes>

    /**
     * The modifier is retrieved from GBM library and passed to EGL driver.
     *
     * @platform linux
     */
    var modifier: String

    /**
     * Indicates whether supports zero copy import to WebGPU.
     *
     * @platform linux
     */
    var supportsZeroCopyWebGpuImport: Boolean
}
