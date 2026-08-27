// Automatically generated - do not modify!

package tanstack.react.virtual

import tanstack.virtual.core.Virtualizer

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface ReactVirtualizer<TScrollElement : web.events.EventTarget /* Element | Window */, TItemElement : web.dom.Element> :
    Virtualizer<TScrollElement, TItemElement> {
    /**
     * Ref callback for the inner size container element. Only meaningful when
     * `directDomUpdates: true` — the virtualizer writes the container's
     * main-axis size (`height` or `width`) directly to skip React re-renders.
     */
    var containerRef: (node: web.html.HTMLElement?) -> Unit
}
