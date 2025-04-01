@file:JsModule("@emotion/cache")

package emotion.cache

import emotion.utils.EmotionCache
import js.import.JsModule
import kotlin.js.JsName

@JsName("default")
external fun createCache(
    options: Options,
): EmotionCache
