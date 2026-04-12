package react

import js.array.ReadonlyArray
import js.objects.unsafeJso
import kotlinx.coroutines.flow.Flow
import react.canary.ReactCanary
import web.coroutines.internal.observerFlow
import web.dom.FocusOptions
import web.dom.GetRootNodeOptions
import web.dom.Node
import web.dom.NodePosition
import web.events.EventTargetLike
import web.geometry.DOMRect
import web.intersection.IntersectionObserver
import web.intersection.IntersectionObserverEntry
import web.intersection.IntersectionObserverInit
import web.resize.ResizeObserver
import web.resize.ResizeObserverEntry

/**
 * [Online Documentation](https://react.dev/reference/react/Fragment#fragmentinstance)
 */
@ReactCanary
external interface FragmentInstance :
    EventTargetLike {

    // Focus management methods

    fun blur()
    fun focus(options: FocusOptions = definedExternally)
    fun focusLast(options: FocusOptions = definedExternally)

    // Observer methods

    fun observeUsing(observer: IntersectionObserver)
    fun unobserveUsing(observer: IntersectionObserver)

    fun observeUsing(observer: ResizeObserver)
    fun unobserveUsing(observer: ResizeObserver)

    // Layout methods

    fun compareDocumentPosition(otherNode: Node /* ? */): NodePosition
    fun getClientRects(): ReadonlyArray<DOMRect>
    fun getRootNode(options: GetRootNodeOptions = definedExternally): EventTargetLike /* Document | ShadowRoot | FragmentInstance */

    // Scroll methods

    fun scrollIntoView(alignToTop: Boolean = definedExternally)
}

@ReactCanary
fun FragmentInstance.intersectionFlow(
    options: IntersectionObserverInit = unsafeJso(),
): Flow<IntersectionObserverEntry> =
    observerFlow { callback ->
        val observer = IntersectionObserver(callback, options)
        observeUsing(observer)

        return@observerFlow {
            unobserveUsing(observer)
        }
    }

@ReactCanary
fun FragmentInstance.resizeFlow(): Flow<ResizeObserverEntry> =
    observerFlow { callback ->
        val observer = ResizeObserver(callback)
        observeUsing(observer)

        return@observerFlow {
            unobserveUsing(observer)
        }
    }

