@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import js.core.ReadonlyArray
import web.cssom.ClassName

external fun getRegisteredStyles(
    registeredStyles: ReadonlyArray<String>,
    className: ClassName,
): String
