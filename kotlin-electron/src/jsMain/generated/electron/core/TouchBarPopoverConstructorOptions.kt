package electron.core


external interface TouchBarPopoverConstructorOptions {
    /**
     * Popover button text.
     */
    var label: String?

    /**
     * Popover button icon.
     */
    var icon: NativeImage?

    /**
     * Items to display in the popover.
     */
    var items: TouchBar

    /**
     * `true` to display a close button on the left of the popover, `false` to not show
     * it. Default is `true`.
     */
    var showCloseButton: Boolean?
}
