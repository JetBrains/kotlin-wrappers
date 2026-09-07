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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSContainerRule/conditions)
     */
    val conditions: ReadonlyArray<CSSContainerCondition>

    /**
     * The read-only **`containerName`** property of the CSSContainerRule interface represents the container name of the associated CSS @container at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSContainerRule/containerName)
     */
    val containerName: String

    /**
     * The read-only **`containerQuery`** property of the CSSContainerRule interface returns a string representing the container conditions that are evaluated when the container changes size in order to determine if the styles in the associated @container are applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSContainerRule/containerQuery)
     */
    val containerQuery: String
}
