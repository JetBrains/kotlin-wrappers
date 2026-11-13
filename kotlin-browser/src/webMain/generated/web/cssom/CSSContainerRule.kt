// Automatically generated - do not modify!

package web.cssom

import js.array.ReadonlyArray

/**
 * The **`CSSContainerRule`** interface represents a single CSS @container rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSContainerRule)
 */
open external class CSSContainerRule
private constructor() :
    CSSConditionRule {
    /**
     * The read-only **`conditions`** property of the CSSContainerRule interface represents an associated CSS @container at-rule as an array of objects, where each object represents a single container condition.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSContainerRule/conditions)
     */
    open val conditions: ReadonlyArray<CSSContainerCondition>

    /**
     * The read-only **`containerName`** property of the CSSContainerRule interface represents the name of the container condition for a container rule that only defines one container condition. If there are multiple container conditions, the value is set to the empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSContainerRule/containerName)
     */
    open val containerName: String

    /**
     * The read-only **`containerQuery`** property of the CSSContainerRule interface represents the query part of the container condition for a container rule that only defines one container condition. If there are multiple container conditions, the value is set to the empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSContainerRule/containerQuery)
     */
    open val containerQuery: String
}
