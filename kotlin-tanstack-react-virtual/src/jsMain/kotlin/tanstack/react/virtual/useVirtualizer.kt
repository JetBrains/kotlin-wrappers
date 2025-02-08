@file:JsModule("@tanstack/react-virtual")

package tanstack.react.virtual

import tanstack.virtual.core.Virtualizer
import web.dom.Element
import web.events.EventTarget

external fun <TScrollElement : EventTarget, TItemElement : Element> useVirtualizer(
    options: UseVirtualizerOptions<TScrollElement, TItemElement>,
): Virtualizer<TScrollElement, TItemElement>
