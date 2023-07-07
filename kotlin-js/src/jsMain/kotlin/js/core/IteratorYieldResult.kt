@file:Suppress("WRONG_JS_QUALIFIER")
// language=JavaScript
@file:JsQualifier(
    """({
    __guard__: {
        name: `IteratorYieldResult`,
        [Symbol.hasInstance](instance) {
            return instance && (typeof instance === 'object') && !instance.done
        }
    }
  })"""
)

package js.core

@JsName("__guard__")
sealed external class IteratorYieldResult<out TYield> :
    IteratorResult<TYield, Void> {
    val value: TYield
}
