// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * The type of a geometric primitive, i.e., points, lines, and triangles.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#PrimitiveType">Online Documentation</a>
 */
sealed /* enum */
external interface PrimitiveType {
    companion object {

        /**
         * Points primitive where each vertex (or index) is a separate point.
         *
         * Value - [WebGL2RenderingContext.POINTS]
         */
        val POINTS: PrimitiveType

        /**
         * Lines primitive where each two vertices (or indices) is a line segment.  Line segments are not necessarily connected.
         *
         * Value - [WebGL2RenderingContext.LINES]
         */
        val LINES: PrimitiveType

        /**
         * Line loop primitive where each vertex (or index) after the first connects a line to
         * the previous vertex, and the last vertex implicitly connects to the first.
         *
         * Value - [WebGL2RenderingContext.LINE_LOOP]
         */
        val LINE_LOOP: PrimitiveType

        /**
         * Line strip primitive where each vertex (or index) after the first connects a line to the previous vertex.
         *
         * Value - [WebGL2RenderingContext.LINE_STRIP]
         */
        val LINE_STRIP: PrimitiveType

        /**
         * Triangles primitive where each three vertices (or indices) is a triangle.  Triangles do not necessarily share edges.
         *
         * Value - [WebGL2RenderingContext.TRIANGLES]
         */
        val TRIANGLES: PrimitiveType

        /**
         * Triangle strip primitive where each vertex (or index) after the first two connect to
         * the previous two vertices forming a triangle.  For example, this can be used to model a wall.
         *
         * Value - [WebGL2RenderingContext.TRIANGLE_STRIP]
         */
        val TRIANGLE_STRIP: PrimitiveType

        /**
         * Triangle fan primitive where each vertex (or index) after the first two connect to
         * the previous vertex and the first vertex forming a triangle.  For example, this can be used
         * to model a cone or circle.
         *
         * Value - [WebGL2RenderingContext.TRIANGLE_FAN]
         */
        val TRIANGLE_FAN: PrimitiveType
    }
}
