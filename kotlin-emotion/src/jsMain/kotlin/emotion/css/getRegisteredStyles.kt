@file:JsModule("@emotion/css")

package emotion.css

import js.core.ReadonlyArray
import web.cssom.ClassName

external fun getRegisteredStyles(
    registeredStyles: ReadonlyArray<String>,
    className: ClassName,
): String
