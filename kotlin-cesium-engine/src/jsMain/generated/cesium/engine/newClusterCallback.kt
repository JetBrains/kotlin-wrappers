// Automatically generated - do not modify!

package cesium.engine

import js.array.ReadonlyArray

/**
 * A event listener function used to style clusters.
 * ```
 * // The default cluster values.
 * dataSource.clustering.clusterEvent.addEventListener(function(entities, cluster) {
 *     cluster.label.show = true;
 *     cluster.label.text = entities.length.toLocaleString();
 * });
 * ```
 * @param [clusteredEntities] An array of the entities contained in the cluster.
 * @param [cluster] An object containing the Billboard, Label, and Point
 *   primitives that represent this cluster of entities.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCluster.html#.newClusterCallback">Online Documentation</a>
 */
typealias newClusterCallback = (
    clusteredEntities: ReadonlyArray<Entity>,
    cluster: Any,
    /* {
        billboard: Billboard;
        label: Label;
        point: PointPrimitive;
    } */
) -> Unit
