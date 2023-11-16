@file:JsModule("@emotion/css")

package emotion.css

import csstype.Properties
import web.cssom.ClassName

external fun css(
    properties: Properties,
): ClassName
