// Automatically generated - do not modify!

package testing.library.react

// unhandled import: * as ReactDOMClient from "react-dom/client"
// unhandled import: act as reactDeprecatedAct from "react-dom/test-utils"
// unhandled import: act as reactAct from "react"

external interface RenderHookOptions<Props, Container : Any? /* RendererableContainer | HydrateableContainer */ /* default is web.html.HTMLElement */, BaseElement : Any? /* RendererableContainer | HydrateableContainer */ /* default is Container */> :
    RenderOptions<Container, BaseElement> {
    /**
     * The argument passed to the renderHook callback. Can be useful if you plan
     * to use the rerender utility to change the values passed to your hook.
     */
    var initialProps: Props?
}
