@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import web.cssom.ClassName

external fun merge(
    className: ClassName,
): String
