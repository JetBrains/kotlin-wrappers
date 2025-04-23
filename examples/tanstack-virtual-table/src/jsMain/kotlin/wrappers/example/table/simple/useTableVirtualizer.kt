package wrappers.example.table.simple

import react.useEffectOnce
import tanstack.react.virtual.UseVirtualizerOptions
import tanstack.react.virtual.useVirtualizer
import tanstack.virtual.core.Virtualizer
import web.dom.Element
import web.html.HTMLElement

private val DEFAULT_OPTIONS = UseVirtualizerOptions<HTMLElement, Element>(
    count = 0,
    estimateSize = { 0 },
    getScrollElement = { null },
)

internal fun useTableVirtualizer(): Virtualizer<HTMLElement, Element> {
    val virtualOptions = useVirtualOptionsOrNull()

    val virtualizer = useVirtualizer(virtualOptions ?: DEFAULT_OPTIONS)

    useEffectOnce {
        virtualizer.asDynamic()._willUpdate()
    }

    return virtualizer
}
