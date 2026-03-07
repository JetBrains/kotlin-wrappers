@file:JsModule("react")

package react.raw

import react.DependencyList

/**
 * [Online Documentation](https://react.dev/reference/react/useMemo)
 */
@PublishedApi
@JsName("useMemo")
internal /* raw */
external fun <T> useMemoRaw(
    callback: () -> T,
    dependencies: DependencyList,
): T
