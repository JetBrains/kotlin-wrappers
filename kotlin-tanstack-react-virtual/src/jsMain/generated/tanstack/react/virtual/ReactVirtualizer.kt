// Automatically generated - do not modify!

package tanstack.react.virtual

import tanstack.virtual.core.Virtualizer

typealias ReactVirtualizer<TScrollElement, TItemElement> = Virtualizer<TScrollElement, TItemElement>

/**
 * Ref callback for the inner size container element. Only meaningful when
 * `directDomUpdates: true` - the virtualizer writes the container's
 * main-axis size (`height` or `width`) directly to skip React re-renders.
 */
inline val Virtualizer<*, *>.containerRef: (node: web.html.HTMLElement?) -> Unit
    get() = asDynamic().containerRef
