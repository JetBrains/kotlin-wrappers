// Automatically generated - do not modify!

package web.gpu

/**
 * The **`GPUAdapterInfo`** interface of the WebGPU API contains identifying information about a GPUAdapter.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapterInfo)
 */
open external class GPUAdapterInfo
private constructor() {
    /**
     * The **`architecture`** read-only property of the GPUAdapterInfo interface returns the name of the family or class of GPUs the adapter belongs to, or an empty string if it is not available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapterInfo/architecture)
     */
    val architecture: String

    /**
     * The **`description`** read-only property of the GPUAdapterInfo interface returns a human-readable string describing the adapter, or an empty string if it is not available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapterInfo/description)
     */
    val description: String

    /**
     * The **`device`** read-only property of the GPUAdapterInfo interface returns a vendor-specific identifier for the adapter, or an empty string if it is not available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapterInfo/device)
     */
    val device: String

    /**
     * The **`isFallbackAdapter`** read-only property of the GPUAdapterInfo interface returns true if the adapter is a fallback adapter, and false if not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapterInfo/isFallbackAdapter)
     */
    val isFallbackAdapter: Boolean

    /**
     * The **`subgroupMaxSize`** read-only property of the GPUAdapterInfo interface returns the maximum supported subgroup size for the GPUAdapter. This can be used along with the subgroups feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapterInfo/subgroupMaxSize)
     */
    val subgroupMaxSize: Int

    /**
     * The **`subgroupMinSize`** read-only property of the GPUAdapterInfo interface returns the minimum supported subgroup size for the GPUAdapter. This can be used along with the subgroups feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapterInfo/subgroupMinSize)
     */
    val subgroupMinSize: Int

    /**
     * The **`vendor`** read-only property of the GPUAdapterInfo interface returns the name of the adapter vendor, or an empty string if it is not available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapterInfo/vendor)
     */
    val vendor: String
}
