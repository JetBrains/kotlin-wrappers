// Automatically generated - do not modify!

package testing.library.react

// unhandled import: * as ReactDOMClient from "react-dom/client"
import testing.library.dom.Queries

// unhandled import: act as reactDeprecatedAct from "react-dom/test-utils"
// unhandled import: act as reactAct from "react"

external interface RenderOptions<Container : Any? /* RendererableContainer | HydrateableContainer */ /* default is HTMLElement */, BaseElement : Any? /* RendererableContainer | HydrateableContainer */ /* default is Container */> {
    /**
     * By default, React Testing Library will create a div and append that div to the document.body. Your React component will be rendered in the created div. If you provide your own HTMLElement container via this option,
     *  it will not be appended to the document.body automatically.
     *
     *  For example: If you are unit testing a `<tbody>` element, it cannot be a child of a div. In this case, you can
     *  specify a table as the render container.
     *
     *  @see https://testing-library.com/docs/react-testing-library/api/#container
     */
    var container: Container?

    /**
     * Defaults to the container if the container is specified. Otherwise `document.body` is used for the default. This is used as
     *  the base element for the queries as well as what is printed when you use `debug()`.
     *
     *  @see https://testing-library.com/docs/react-testing-library/api/#baseelement
     */
    var baseElement: BaseElement?

    /**
     * If `hydrate` is set to `true`, then it will render with `ReactDOM.hydrate`. This may be useful if you are using server-side
     *  rendering and use ReactDOM.hydrate to mount your components.
     *
     *  @see https://testing-library.com/docs/react-testing-library/api/#hydrate)
     */
    var hydrate: Boolean?

    /**
     * Only works if used with React 18.
     * Set to `true` if you want to force synchronous `ReactDOM.render`.
     * Otherwise `render` will default to concurrent React if available.
     */
    var legacyRoot: Boolean?

    /**
     * Only supported in React 19.
     * Callback called when React catches an error in an Error Boundary.
     * Called with the error caught by the Error Boundary, and an `errorInfo` object containing the `componentStack`.
     *
     * @see {@link https://react.dev/reference/react-dom/client/createRoot#parameters createRoot#options}
     */
    var onCaughtError: Any /* ReactDOMClient.RootOptions extends {
    onCaughtError?: infer OnCaughtError;
} ? OnCaughtError : never */

    /**
     * Callback called when React automatically recovers from errors.
     * Called with an error React throws, and an `errorInfo` object containing the `componentStack`.
     * Some recoverable errors may include the original error cause as `error.cause`.
     *
     * @see {@link https://react.dev/reference/react-dom/client/createRoot#parameters createRoot#options}
     */
    var onRecoverableError: react.dom.client.RootOptions

    /**
     * Not supported at the moment
     */
    var onUncaughtError: Nothing?

    /**
     * Queries to bind. Overrides the default set from DOM Testing Library unless merged.
     *
     *  @see https://testing-library.com/docs/react-testing-library/api/#queries
     */
    var queries: Queries?

    /**
     * Pass a React Component as the wrapper option to have it rendered around the inner element. This is most useful for creating
     *  reusable custom render functions for common data providers. See setup for examples.
     *
     *  @see https://testing-library.com/docs/react-testing-library/api/#wrapper
     */
    var wrapper: Any /* React.JSXElementConstructor<{
    children: React.ReactNode;
}> */

    /**
     * When enabled, <StrictMode> is rendered around the inner element.
     * If defined, overrides the value of `reactStrictMode` set in `configure`.
     */
    var reactStrictMode: Boolean?
}
