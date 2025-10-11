package react

import js.array.ReadonlyArray
import react.canary.ReactCanary
import web.dom.FocusOptions
import web.dom.GetRootNodeOptions
import web.dom.Node
import web.dom.NodePosition
import web.events.AddEventListenerOptions
import web.events.Event
import web.events.EventListenerOptions
import web.events.EventType
import web.geometry.DOMRect
import web.intersection.IntersectionObserver
import web.resize.ResizeObserver

/**
 * [Online Documentation](https://react.dev/reference/react/Fragment#fragmentinstance)
 */
@ReactCanary
external interface FragmentInstance {

    // Focus management methods

    fun blur()
    fun focus(focusOptions: FocusOptions = definedExternally)
    fun focusLast(focusOptions: FocusOptions = definedExternally)

    // Observer methods

    fun observeUsing(observer: IntersectionObserver)
    fun unobserveUsing(observer: IntersectionObserver)

    fun observeUsing(observer: ResizeObserver)
    fun unobserveUsing(observer: ResizeObserver)

    // Layout methods

    fun compareDocumentPosition(otherNode: Node /* ? */): NodePosition
    fun getClientRects(): ReadonlyArray<DOMRect>
    fun getRootNode(getRootNodeOptions: GetRootNodeOptions = definedExternally): Any /* Document | ShadowRoot | FragmentInstance */

    // Event handling methods

    fun <E : Event> addEventListener(
        type: EventType<E>,
        listener: (E) -> Unit,
        options: AddEventListenerOptions,
    )

    fun <E : Event> removeEventListener(
        type: EventType<E>,
        listener: (E) -> Unit,
        options: EventListenerOptions,
    )

    fun dispatchEvent(event: Event): Boolean

    // Scroll methods

    fun scrollIntoView(alignToTop: Boolean = definedExternally)
}
