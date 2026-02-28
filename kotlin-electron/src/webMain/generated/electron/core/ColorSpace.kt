// Automatically generated - do not modify!

package electron.core

external interface ColorSpace {
// Docs: https://electronjs.org/docs/api/structures/color-space
    /**
     * The color matrix of the color space. Can be one of the following values:
     */
    var matrix: (ColorSpaceMatrix)

    /**
     * The color primaries of the color space. Can be one of the following values:
     */
    var primaries: (ColorSpacePrimaries)

    /**
     * The color range of the color space. Can be one of the following values:
     */
    var range: (ColorSpaceRange)

    /**
     * The transfer function of the color space. Can be one of the following values:
     */
    var transfer: (ColorSpaceTransfer)
}
