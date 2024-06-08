// Automatically generated - do not modify!

package cesium.engine

import js.array.ReadonlyArray

/**
 * A function which creates an array of visualizers used for visualization.
 * ```
 * function createVisualizers(scene, entityCluster, dataSource) {
 *     return [new BillboardVisualizer(entityCluster, dataSource.entities)];
 * }
 * ```
 * @param [scene] The scene to create visualizers for.
 * @param [entityCluster] The entity cluster to create visualizers for.
 * @param [dataSource] The data source to create visualizers for.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceDisplay.html#.VisualizersCallback">Online Documentation</a>
 */
typealias VisualizersCallback = (scene: Scene, entityCluster: EntityCluster, dataSource: DataSource) -> ReadonlyArray<Visualizer>
