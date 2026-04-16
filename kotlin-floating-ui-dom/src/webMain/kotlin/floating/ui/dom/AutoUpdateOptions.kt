package floating.ui.dom

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AutoUpdateOptions {
    /**
     * Whether to update the position when an overflow ancestor is scrolled.
     * @default true
     */
    val ancestorScroll: Boolean?

    /**
     * Whether to update the position when an overflow ancestor is resized. This
     * uses the native `resize` event.
     * @default true
     */
    val ancestorResize: Boolean?

    /**
     * Whether to update the position when either the reference or floating
     * elements resized. This uses a `ResizeObserver`.
     * @default true
     */
    val elementResize: Boolean?

    /**
     * Whether to update the position when the reference relocated on the screen
     * due to layout shift.
     * @default true
     */
    val layoutShift: Boolean?

    /**
     * Whether to update on every animation frame if necessary. Only use if you
     * need to update the position in response to an animation using transforms.
     * @default false
     */
    val animationFrame: Boolean?
}
