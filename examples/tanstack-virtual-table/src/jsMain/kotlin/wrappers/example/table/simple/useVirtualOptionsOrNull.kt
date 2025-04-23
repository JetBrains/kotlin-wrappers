package wrappers.example.table.simple

import react.Context
import react.createContext
import react.use
import tanstack.react.virtual.UseVirtualizerOptions
import web.dom.Element
import web.html.HTMLElement

internal typealias VirtualOptions = UseVirtualizerOptions<HTMLElement, Element>

internal val VirtualOptionsContext: Context<VirtualOptions?> =
    createContext()

internal fun useVirtualOptionsOrNull(): VirtualOptions? =
    use(VirtualOptionsContext)
