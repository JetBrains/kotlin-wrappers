package react.use

import js.reflect.unsafeCast
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.job
import react.Cleanup
import react.MutableRefObject
import react.Ref
import react.RefCallback
import seskar.js.JsNative

@JsName("Function")
private external class UnsafeRefCallback<T : Any> :
    RefCallback<T> {
    @JsNative
    operator fun invoke(value: T): Cleanup
}

/**
 * [Original](https://github.com/mui/material-ui/blob/f0f33c6038f874d2f3ecc251a8ca5bc640424992/packages/mui-utils/src/setRef.ts#L16
 */
internal suspend fun <T : Any> setRef(
    ref: Ref<T>?,
    value: T,
) {
    ref ?: return

    val cleanup = if (ref is UnsafeRefCallback<T>) {
        ref(value)
    } else {
        val refObject = unsafeCast<MutableRefObject<T>>(ref)
        refObject.current = value
        { refObject.current = undefined }
    }

    currentCoroutineContext().job.invokeOnCompletion { cleanup() }
}
