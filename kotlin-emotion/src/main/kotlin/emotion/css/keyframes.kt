@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import csstype.AnimationName

@JsName("keyframes")
external fun rawKeyframes(
    blocks: Keyframes,
): AnimationName
