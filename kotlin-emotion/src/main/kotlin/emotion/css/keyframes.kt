@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import csstype.AnimationName

external fun keyframes(
    blocks: Keyframes,
): AnimationName
