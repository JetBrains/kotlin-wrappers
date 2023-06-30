@file:JsModule("electron/electron")

package electron


open external class BrowserView {
// Docs: https://electronjs.org/docs/api/browser-view
    /**
     * BrowserView
     */
    constructor (options: BrowserViewConstructorOptions = definedExternally)

    /**
     * The `bounds` of this BrowserView instance as `Object`.
     *
     * @experimental
     */
    fun getBounds(): Rectangle
    fun setAutoResize(options: AutoResizeOptions): Unit

    /**
     * Examples of valid `color` values:
     *
     * * Hex
     *   * #fff (RGB)
     *   * #ffff (ARGB)
     *   * #ffffff (RRGGBB)
     *   * #ffffffff (AARRGGBB)
     * * RGB
     *   * rgb(([\d]+),\s*([\d]+),\s*([\d]+))
     *     * e.g. rgb(255, 255, 255)
     * * RGBA
     *   * rgba(([\d]+),\s*([\d]+),\s*([\d]+),\s*([\d.]+))
     *     * e.g. rgba(255, 255, 255, 1.0)
     * * HSL
     *   * hsl((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%)
     *     * e.g. hsl(200, 20%, 50%)
     * * HSLA
     *   * hsla((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%,\s*([\d.]+))
     *     * e.g. hsla(200, 20%, 50%, 0.5)
     * * Color name
     *   * Options are listed in SkParseColor.cpp
     *   * Similar to CSS Color Module Level 3 keywords, but case-sensitive.
     *     * e.g. `blueviolet` or `red`
     *
     * **Note:** Hex format with alpha takes `AARRGGBB` or `ARGB`, _not_ `RRGGBBA` or
     * `RGA`.
     *
     * @experimental
     */
    fun setBackgroundColor(color: String): Unit

    /**
     * Resizes and moves the view to the supplied bounds relative to the window.
     *
     * @experimental
     */
    fun setBounds(bounds: Rectangle): Unit

    /**
     * A `WebContents` object owned by this view.
     *
     * @experimental
     */
    var webContents: WebContents
}
