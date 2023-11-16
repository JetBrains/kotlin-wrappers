@file:JsModule("@emotion/css")

package emotion.css

import web.cssom.ClassName

external fun cx(
    vararg classNames: ClassName?,
): ClassName
