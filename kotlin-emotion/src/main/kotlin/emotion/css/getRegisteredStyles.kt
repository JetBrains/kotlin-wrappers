@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import csstype.ClassName
import kotlinx.js.ReadonlyArray

external fun getRegisteredStyles(
    registeredStyles: ReadonlyArray<String>,
    className: ClassName,
): String
