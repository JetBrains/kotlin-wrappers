// Automatically generated - do not modify!

package web.gpu

/**
 * The **`GPUQuerySet`** interface of the WebGPU API is used to record the results of queries on passes, such as occlusion or timestamp queries.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQuerySet)
 */
open external class GPUQuerySet
private constructor() :
    GPUObjectBase {
    /**
     * The **`count`** read-only property of the GPUQuerySet interface is a number specifying the number of queries managed by the GPUQuerySet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQuerySet/count)
     */
    val count: GPUSize32Out

    /**
     * The **`type`** read-only property of the GPUQuerySet interface is an enumerated value specifying the type of queries managed by the GPUQuerySet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQuerySet/type)
     */
    val type: GPUQueryType

    /**
     * The **`destroy()`** method of the GPUQuerySet interface destroys the GPUQuerySet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQuerySet/destroy)
     */
    fun destroy()
}
