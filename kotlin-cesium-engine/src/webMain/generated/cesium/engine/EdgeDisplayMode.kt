// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Defines how edges contributed by the
 * [EXT_mesh_primitive_edge_visibility](https://github.com/KhronosGroup/glTF/pull/2479)
 * glTF extension are rendered relative to surface geometry.
 *
 * Primitives that do not include the extension are unaffected by this setting
 * and always render normally.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#EdgeDisplayMode">Online Documentation</a>
 */
sealed /* enum */
external interface EdgeDisplayMode {
    companion object {

        /**
         * Render surfaces only. Edges from the
         * [EXT_mesh_primitive_edge_visibility](https://github.com/KhronosGroup/glTF/pull/2479)
         * extension are hidden.
         */
        val SURFACES_ONLY: EdgeDisplayMode

        /**
         * Render both surfaces and edges. Edges from the
         * [EXT_mesh_primitive_edge_visibility](https://github.com/KhronosGroup/glTF/pull/2479)
         * extension are composited on top of the surface geometry.
         */
        val SURFACES_AND_EDGES: EdgeDisplayMode

        /**
         * Render edges only. Surface geometry is hidden for primitives that have edge visibility data,
         * approximating CAD-style wireframe rendering. Primitives without the extension are unaffected.
         */
        val EDGES_ONLY: EdgeDisplayMode
    }
}
