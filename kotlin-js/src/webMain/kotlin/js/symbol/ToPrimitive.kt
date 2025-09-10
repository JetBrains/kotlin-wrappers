package js.symbol

import kotlin.js.JsAny

typealias ToPrimitive = (
    hint: PrimitiveHint?,
) -> JsAny?
