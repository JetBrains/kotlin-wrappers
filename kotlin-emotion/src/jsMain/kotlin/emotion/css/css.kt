@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import csstype.Properties
import web.cssom.ClassName

external fun css(
    properties: Properties,
): ClassName
