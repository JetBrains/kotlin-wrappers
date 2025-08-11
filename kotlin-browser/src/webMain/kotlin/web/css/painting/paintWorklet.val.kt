@file:JsQualifier("CSS")

package web.css.painting

import web.experimental.ExperimentalWebApi
import web.worklets.Worklet
import kotlin.js.JsQualifier

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSS/paintWorklet_static)
 */
@ExperimentalWebApi
external val paintWorklet: Worklet<PaintWorkletModule>
