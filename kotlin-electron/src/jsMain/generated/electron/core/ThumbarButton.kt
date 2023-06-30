package electron.core


external interface ThumbarButton {
    // Docs: https://electronjs.org/docs/api/structures/thumbar-button
    var click: Function<*>

    /**
     * Control specific states and behaviors of the button. By default, it is
     * `['enabled']`.
     */
    var flags: js.core.ReadonlyArray<String>?

    /**
     * The icon showing in thumbnail toolbar.
     */
    var icon: NativeImage

    /**
     * The text of the button's tooltip.
     */
    var tooltip: String?
}
