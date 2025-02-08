package tanstack.react.virtual

import tanstack.virtual.core.VirtualizerOptions
import web.dom.Element
import web.events.EventTarget

external interface UseVirtualizerOptions<TScrollElement : EventTarget, TItemElement : Element> :
    VirtualizerOptions<TScrollElement, TItemElement> {

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var observeElementRect: dynamic

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var observeElementOffset: dynamic

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var scrollToFn: dynamic
}
