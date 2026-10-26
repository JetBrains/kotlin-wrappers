package cesium.core

import js.function.JsFunction
import js.void.Void

typealias EventListener<T /* : Tuple */> = JsFunction<T, Void>
