// Automatically generated - do not modify!

package webgl

sealed external interface OES_vertex_array_object {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object/bindVertexArrayOES) */
    fun bindVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object/createVertexArrayOES) */
    fun createVertexArrayOES(): WebGLVertexArrayObjectOES?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object/deleteVertexArrayOES) */
    fun deleteVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object/isVertexArrayOES) */
    fun isVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES?): GLboolean
    val VERTEX_ARRAY_BINDING_OES: GLenum
}
