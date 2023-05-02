@file:JsModule("@emotion/cache")
@file:JsNonModule

package emotion.cache

import emotion.utils.EmotionCache

@JsName("default")
external fun createCache(
    options: Options,
): EmotionCache
