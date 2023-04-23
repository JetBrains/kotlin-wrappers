@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import web.cssom.ClassName

external fun cx(
    vararg classNames: ClassName?,
): ClassName
