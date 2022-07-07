@file:JsModule("@tanstack/react-virtual")
@file:JsNonModule

package tanstack.react.virtual

import tanstack.virtual.core.Virtualizer
import tanstack.virtual.core.VirtualizerOptions

external interface UseVirtualizerOptions<TScrollElement, TItemElement> :
    VirtualizerOptions<TScrollElement, TItemElement> {

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var observeElementRect: dynamic

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var observeElementOffset: dynamic

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var scrollToFn: dynamic
}

external fun <TScrollElement, TItemElement> useVirtualizer(
    options: UseVirtualizerOptions<TScrollElement, TItemElement>
): Virtualizer<TScrollElement, TItemElement>
