@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import csstype.ClassName

external fun cx(
    vararg classNames: ClassName?,
): ClassName
