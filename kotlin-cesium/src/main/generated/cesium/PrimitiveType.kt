// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * The type of a geometric primitive, i.e., points, lines, and triangles.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#PrimitiveType">Online Documentation</a>
 */

external enum class PrimitiveType {

    /**
     * Points primitive where each vertex (or index) is a separate point.
     */
    POINTS,

    /**
     * Lines primitive where each two vertices (or indices) is a line segment.  Line segments are not necessarily connected.
     */
    LINES,

    /**
     * Line loop primitive where each vertex (or index) after the first connects a line to
     * the previous vertex, and the last vertex implicitly connects to the first.
     */
    LINE_LOOP,

    /**
     * Line strip primitive where each vertex (or index) after the first connects a line to the previous vertex.
     */
    LINE_STRIP,

    /**
     * Triangles primitive where each three vertices (or indices) is a triangle.  Triangles do not necessarily share edges.
     */
    TRIANGLES,

    /**
     * Triangle strip primitive where each vertex (or index) after the first two connect to
     * the previous two vertices forming a triangle.  For example, this can be used to model a wall.
     */
    TRIANGLE_STRIP,

    /**
     * Triangle fan primitive where each vertex (or index) after the first two connect to
     * the previous vertex and the first vertex forming a triangle.  For example, this can be used
     * to model a cone or circle.
     */
    TRIANGLE_FAN,

    ;

}
