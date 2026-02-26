// Automatically generated - do not modify!

@file:JsModule("@testing-library/react")

package testing.library.react

// unhandled import: * as ReactDOMClient from "react-dom/client"
// unhandled import: act as reactDeprecatedAct from "react-dom/test-utils"
// unhandled import: act as reactAct from "react"

/**
 * Render into a container which is appended to document.body. It should be used with cleanup.
 */
external fun <Container : Any? /* RendererableContainer | HydrateableContainer */ /* default is web.html.HTMLElement */, BaseElement : Any? /* RendererableContainer | HydrateableContainer */ /* default is Container */> render(
    ui: react.ReactNode,
    options: RenderOptions<Container, BaseElement>,
): RenderResult<Container, BaseElement>

external fun render(
    ui: react.ReactNode,
    options: RenderOptions<*, *>? = definedExternally,
): RenderResult<*, *>
