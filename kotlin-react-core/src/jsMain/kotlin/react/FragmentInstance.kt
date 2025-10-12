package react

import js.array.ReadonlyArray
import react.canary.ReactCanary
import web.dom.FocusOptions
import web.dom.GetRootNodeOptions
import web.dom.Node
import web.dom.NodePosition
import web.events.EventTargetLike
import web.geometry.DOMRect
import web.intersection.IntersectionObserver
import web.resize.ResizeObserver

/**
 * [Online Documentation](https://react.dev/reference/react/Fragment#fragmentinstance)
 */
@ReactCanary
external interface FragmentInstance :
    EventTargetLike {

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
    fun getRootNode(getRootNodeOptions: GetRootNodeOptions = definedExternally): EventTargetLike /* Document | ShadowRoot | FragmentInstance */

    // Scroll methods

    fun scrollIntoView(alignToTop: Boolean = definedExternally)
}
