@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import kotlinext.js.ReadonlyArray

external fun getRegisteredStyles(
    registeredStyles: ReadonlyArray<String>,
    className: String,
): String
