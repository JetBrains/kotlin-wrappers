@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray

/**
 * [Online Documentation](https://react.dev/reference/react/useMemo)
 */
@JsName("useMemo")
external fun <T> useMemoRaw(
    callback: () -> T,
    dependencies: ReadonlyArray<Any?>,
): T
