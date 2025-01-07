@file:JsModule("react-dom/server")

package react.dom.server

import js.promise.Promise
import react.ReactNode
import seskar.js.JsAsync

/**
 * [Online Documentation](https://react.dev/reference/react-dom/server/renderToReadableStream)
 */
@JsAsync
external suspend fun renderToReadableStream(
    children: ReactNode?,
    options: RenderToReadableStreamOptions? = definedExternally,
): ReactDOMServerReadableStream

@JsName("renderToReadableStream")
external fun renderToReadableStreamAsync(
    children: ReactNode?,
    options: RenderToReadableStreamOptions? = definedExternally,
): Promise<ReactDOMServerReadableStream>
