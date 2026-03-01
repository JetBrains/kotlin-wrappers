package floating.ui.react.dom

import floating.ui.dom.ReferenceElement
import kotlinx.js.JsPlainObject
import react.CSSProperties
import react.Ref
import react.RefObject
import web.html.HTMLElement

@JsPlainObject
external interface UseFloatingReturn<R : ReferenceElement> :
    UseFloatingData {
    /**
     * Update the position of the floating element, re-rendering the component
     * if required.
     */
    val update: () -> Unit

    /**
     * Pre-configured positioning styles to apply to the floating element.
     */
    val floatingStyles: CSSProperties

    /**
     * Object containing the reference and floating refs and reactive setters.
     */
    val refs: Refs<R>

    @JsPlainObject
    interface Refs<R : ReferenceElement> {
        /**
         * A React ref to the reference element.
         */
        val reference: RefObject<R>

        /**
         * A React ref to the floating element.
         */
        val floating: RefObject<HTMLElement>

        /**
         * A callback to set the reference element (reactive).
         */
        val setReference: Ref<R> /* LegacyRefCallback<R> */

        /**
         * A callback to set the floating element (reactive).
         */
        val setFloating: Ref<HTMLElement> /* LegacyRefCallback<HTMLElement> */
    }

    /**
     * Object containing the reference and floating elements.
     */
    val elements: Elements<R>

    @JsPlainObject
    interface Elements<R> {
        val reference: R?
        val floating: HTMLElement?
    }
}
