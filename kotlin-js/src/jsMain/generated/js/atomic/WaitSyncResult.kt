@file:Suppress("WRONG_JS_QUALIFIER")
// language=JavaScript
@file:JsQualifier(
    """({
    __guard__: {
        [Symbol.hasInstance](instance) {
            return instance && (typeof instance === 'object') && (instance.async === false)
        }
    }
  })"""
)

package js.atomic

@JsName("__guard__")
sealed external class WaitSyncResult : WaitResult {
    val value: WaitSyncStatus
}
