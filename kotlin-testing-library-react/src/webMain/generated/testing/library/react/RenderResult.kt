// Automatically generated - do not modify!

package testing.library.react

// unhandled import: * as ReactDOMClient from "react-dom/client"
import testing.library.dom.BoundFunction
// unhandled import: act as reactDeprecatedAct from "react-dom/test-utils"
// unhandled import: act as reactAct from "react"
import web.dom.DocumentFragment

external interface RenderResult<Container : Any? /* RendererableContainer | HydrateableContainer */ /* default is HTMLElement */, BaseElement : Any? /* RendererableContainer | HydrateableContainer */ /* default is Container */> :
    testing.library.dom.BoundFunctions {
    override operator fun <P /*  : /* keyof Q */ */> get(key: P): BoundFunction<Any?>?

    override operator fun <P /*  : /* keyof Q */ */> set(key: P, value: BoundFunction<Any?>?)

    var container: Container
    var baseElement: BaseElement
    var debug: (
        baseElement:
        Any?,
        /* RendererableContainer | HydrateableContainer | Array<RendererableContainer | HydrateableContainer> | undefined */ /* use undefined for default */
        maxLength: Double?, /* use undefined for default */
        options: Any /* TODO: prettyFormat.OptionsReceived */?, // use undefined for default
    ) -> Unit
    var rerender: (ui: react.ReactNode) -> Unit
    var unmount: () -> Unit
    var asFragment: () -> DocumentFragment
}
