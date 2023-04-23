@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import web.cssom.AnimationName

external fun keyframes(
    keyframes: Keyframes,
): AnimationName
