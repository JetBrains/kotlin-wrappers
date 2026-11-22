@file:JsModule("react")

package react.raw

/**
 * [Online Documentation](https://react.dev/reference/react/useState)
 */
@PublishedApi
@JsName("useState")
internal /* raw */
external fun <T : Any> useStateRaw(): StateInstanceRaw<T?>

/**
 * [Online Documentation](https://react.dev/reference/react/useState)
 */
@PublishedApi
@JsName("useState")
internal /* raw */
external fun <T> useStateRaw(
    initialValue: T,
): StateInstanceRaw<T>

/**
 * [Online Documentation](https://react.dev/reference/react/useState)
 */
@PublishedApi
@JsName("useState")
internal /* raw */
external fun <T> useStateRaw(
    initializer: () -> T,
): StateInstanceRaw<T>
