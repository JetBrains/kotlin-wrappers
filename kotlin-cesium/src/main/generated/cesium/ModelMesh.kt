// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A model's mesh and its materials.
 *
 * Use [Model.getMesh] to create an instance.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelMesh.html">Online Documentation</a>
 */
external class ModelMesh {
    /**
     * The value of the `name` property of this mesh.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelMesh.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The index of the mesh.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelMesh.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * An array of [ModelMaterial] instances indexed by the mesh's
     * primitive indices.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelMesh.html#materials">Online Documentation</a>
     */
    val materials: ReadonlyArray<ModelMaterial>
}
