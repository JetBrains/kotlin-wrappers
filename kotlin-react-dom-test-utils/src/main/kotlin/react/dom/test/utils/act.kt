@file:JsModule("react-dom/test-utils")
@file:JsNonModule

package react.dom.test.utils

import kotlin.js.Promise

external fun <T> act(
    callback: () -> T, /* | Promise<T> */
): Promise<T>
