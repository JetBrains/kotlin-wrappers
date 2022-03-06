@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

import csstype.AnimationName
import csstype.Percentage
import csstype.Properties
import kotlinx.js.Record

@JsName("keyframes")
external fun rawKeyframes(blocks: Record<Percentage, Properties>): AnimationName
