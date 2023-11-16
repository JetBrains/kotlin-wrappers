@file:JsModule("@emotion/css")

package emotion.css

import web.cssom.ClassName

external fun merge(
    className: ClassName,
): String
