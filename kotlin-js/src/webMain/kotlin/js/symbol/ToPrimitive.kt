package js.symbol

import js.core.JsAny

typealias ToPrimitive = (
    hint: PrimitiveHint?,
) -> JsAny?
