@file:JsModule("@tanstack/react-virtual")
@file:JsNonModule

package tanstack.react.virtual

import tanstack.virtual.core.Virtualizer
import tanstack.virtual.core.VirtualizerOptions
import web.dom.Element

external interface UseVirtualizerOptions<TScrollElement : Any, TItemElement : Element> :
    VirtualizerOptions<TScrollElement, TItemElement> {

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var observeElementRect: dynamic

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var observeElementOffset: dynamic

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var scrollToFn: dynamic
}

external fun <TScrollElement : Any, TItemElement : Element> useVirtualizer(
    options: UseVirtualizerOptions<TScrollElement, TItemElement>
): Virtualizer<TScrollElement, TItemElement>
