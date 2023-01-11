@file:JsModule("react-dom/test-utils")
@file:JsNonModule

package react.dom.test

import react.ReactElement

/**
 * Render a React element into a detached DOM node in the document.
 *
 * __This function requires a DOM__.
 */
external fun renderIntoDocument(
    element: ReactElement<*>,
)
