// Automatically generated - do not modify!

package web.gpu

sealed external class GPUQuerySet :
    GPUObjectBase {
    override var label: String
    fun destroy()
    val type: GPUQueryType
    val count: GPUSize32Out
}
