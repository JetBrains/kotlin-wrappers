@file:JsModule("@emotion/css")

package emotion.css

import js.array.ReadonlyArray
import web.cssom.ClassName

external fun getRegisteredStyles(
    registeredStyles: ReadonlyArray<String>,
    className: ClassName,
): String
