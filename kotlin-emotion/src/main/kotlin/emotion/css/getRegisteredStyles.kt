@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import csstype.ClassName
import js.core.ReadonlyArray

external fun getRegisteredStyles(
    registeredStyles: ReadonlyArray<String>,
    className: ClassName,
): String
