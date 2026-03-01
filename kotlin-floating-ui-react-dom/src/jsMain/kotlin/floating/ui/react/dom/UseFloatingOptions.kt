package floating.ui.react.dom

import floating.ui.dom.Middleware
import floating.ui.dom.Platform
import floating.ui.dom.ReferenceElement
import floating.ui.utils.Placement
import floating.ui.utils.Strategy
import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.html.HTMLElement

@JsPlainObject
external interface UseFloatingOptions<R : ReferenceElement> {
    // `Partial<ComputePositionConfig>` start

    /**
     * Object to interface with the current platform.
     */
    val platform: Platform?

    /**
     * Where to place the floating element relative to the reference element.
     */
    val placement: Placement?

    /**
     * The strategy to use when positioning the floating element.
     */
    val strategy: Strategy?

    /**
     * Array of middleware objects to modify the positioning or provide data for
     * rendering.
     */
    val middleware: ReadonlyArray<Middleware?>?

    // `Partial<ComputePositionConfig>` end

    /**
     * A callback invoked when both the reference and floating elements are
     * mounted, and cleaned up when either is unmounted. This is useful for
     * setting up event listeners (e.g. pass `autoUpdate`).
     */
    val whileElementsMounted: WhileElementsMounted<R>?

    typealias WhileElementsMounted<R /* : ReferenceElement */> = (
        reference: R,
        floating: HTMLElement,
        update: () -> Unit,
    ) -> () -> Unit

    /**
     * Object containing the reference and floating elements.
     */
    val elements: Elements<R>?

    @JsPlainObject
    interface Elements<R : ReferenceElement> {
        val reference: R?
        val floating: HTMLElement?
    }

    /**
     * The `open` state of the floating element to synchronize with the
     * `isPositioned` value.
     * @default false
     */
    val open: Boolean?

    /**
     * Whether to use `transform` for positioning instead of `top` and `left`
     * (layout) in the `floatingStyles` object.
     * @default true
     */
    val transform: Boolean?
}
