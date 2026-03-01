@file:JsModule("react")

package react.raw

import react.DependencyList

/**
 * [Online Documentation](https://react.dev/reference/react/useMemo)
 */
@JsName("useMemo")
external fun <T> useMemoRaw(
    callback: () -> T,
    dependencies: DependencyList,
): T
