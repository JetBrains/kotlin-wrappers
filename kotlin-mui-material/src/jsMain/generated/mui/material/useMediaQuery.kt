// Automatically generated - do not modify!

@file:JsModule("@mui/material/useMediaQuery")

package mui.material

import mui.system.UseMediaQueryOptions

@JsName("default")
external fun useMediaQuery(
    queryInput: String,
    options: UseMediaQueryOptions? = definedExternally,
): Boolean

@JsName("default")
external fun <Theme : Any> useMediaQuery(
    queryInput: (theme: Theme) -> String,
    options: UseMediaQueryOptions? = definedExternally,
): Boolean
