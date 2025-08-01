// Automatically generated - do not modify!

package web.gl

sealed external interface OES_vertex_array_object {
    /**
     * The **`OES_vertex_array_object.bindVertexArrayOES()`** method of the WebGL API binds a passed WebGLVertexArrayObject object to the buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object/bindVertexArrayOES)
     */
    fun bindVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES?)

    /**
     * The **`OES_vertex_array_object.createVertexArrayOES()`** method of the WebGL API creates and initializes a WebGLVertexArrayObject object that represents a vertex array object (VAO) pointing to vertex array data and which provides names for different sets of vertex data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object/createVertexArrayOES)
     */
    fun createVertexArrayOES(): WebGLVertexArrayObjectOES

    /**
     * The **`OES_vertex_array_object.deleteVertexArrayOES()`** method of the WebGL API deletes a given WebGLVertexArrayObject object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object/deleteVertexArrayOES)
     */
    fun deleteVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES?)

    /**
     * The **`OES_vertex_array_object.isVertexArrayOES()`** method of the WebGL API returns `true` if the passed object is a WebGLVertexArrayObject object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_vertex_array_object/isVertexArrayOES)
     */
    fun isVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES?): GLboolean
    val VERTEX_ARRAY_BINDING_OES: GLenum
}
