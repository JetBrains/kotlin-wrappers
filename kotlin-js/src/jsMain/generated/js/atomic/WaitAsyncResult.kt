@file:Suppress("WRONG_JS_QUALIFIER")
// language=JavaScript
@file:JsQualifier(
    """({
    __guard__: {
        name: `WaitAsyncResult`,
        [Symbol.hasInstance](instance) {
            return instance && (typeof instance === 'object') && (instance.async === true)
        }
    }
  })"""
)

package js.atomic

import js.promise.Promise

@JsName("__guard__")
sealed external class WaitAsyncResult : WaitResult {
    val value: Promise<WaitAsyncStatus>
}
