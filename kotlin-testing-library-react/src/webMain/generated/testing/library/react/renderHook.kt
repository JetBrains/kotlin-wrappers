// Automatically generated - do not modify!

@file:JsModule("@testing-library/react")

package testing.library.react

// unhandled import: * as ReactDOMClient from "react-dom/client"
// unhandled import: act as reactDeprecatedAct from "react-dom/test-utils"
// unhandled import: act as reactAct from "react"

/**
 * Allows you to render a hook within a test React component without having to
 * create that component yourself.
 */
external fun <Result, Props, Container : Any? /* RendererableContainer | HydrateableContainer */ /* default is web.html.HTMLElement */, BaseElement : Any? /* RendererableContainer | HydrateableContainer */ /* default is Container */> renderHook(
    render: (initialProps: Props) -> Result,
    options: RenderHookOptions<Props, Container, BaseElement>? = definedExternally,
): RenderHookResult<Result, Props>
