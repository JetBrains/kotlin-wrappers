@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import csstype.ClassName
import csstype.Properties

external fun css(
    properties: Properties,
): ClassName
