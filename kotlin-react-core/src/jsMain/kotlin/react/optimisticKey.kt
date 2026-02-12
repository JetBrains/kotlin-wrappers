@file:JsModule("react")

package react

import js.symbol.Symbol
import react.canary.ReactCanary

/**
 * [Details](https://github.com/facebook/react/pull/35162)
 */
@ReactCanary
external object optimisticKey :
    Symbol,
    Key
