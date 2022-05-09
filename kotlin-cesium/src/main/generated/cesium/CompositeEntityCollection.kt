// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Non-destructively composites multiple [EntityCollection] instances into a single collection.
 * If a Entity with the same ID exists in multiple collections, it is non-destructively
 * merged into a single new entity instance.  If an entity has the same property in multiple
 * collections, the property of the Entity in the last collection of the list it
 * belongs to is used.  CompositeEntityCollection can be used almost anywhere that a
 * EntityCollection is used.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html">Online Documentation</a>
 *
 * @constructor
 * @param [collections] The initial list of EntityCollection instances to merge.
 * @param [owner] The data source (or composite entity collection) which created this collection.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html">Online Documentation</a>
 */
external class CompositeEntityCollection(collections: Array<out EntityCollection>? = definedExternally) {
    constructor(
        collections: Array<out EntityCollection>? = definedExternally,
        owner: DataSource,
    )

    constructor(
        collections: Array<out EntityCollection>? = definedExternally,
        owner: CompositeEntityCollection,
    )

    /**
     * Gets the event that is fired when entities are added or removed from the collection.
     * The generated event is a [EntityCollection.collectionChangedEventCallback].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#collectionChanged">Online Documentation</a>
     */
    val collectionChanged: DefaultEvent

    /**
     * Gets a globally unique identifier for this collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * Gets the array of Entity instances in the collection.
     * This array should not be modified directly.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#values">Online Documentation</a>
     */
    val values: Array<out Entity>

    /**
     * Gets the owner of this composite entity collection, ie. the data source or composite entity collection which created it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#owner">Online Documentation</a>
     */
    val owner: dynamic

    /**
     * Adds a collection to the composite.
     * @param [collection] the collection to add.
     * @param [index] the index to add the collection at.  If omitted, the collection will
     *   added on top of all existing collections.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#addCollection">Online Documentation</a>
     */
    fun addCollection(
        collection: EntityCollection,
        index: Int? = definedExternally,
    )

    /**
     * Removes a collection from this composite, if present.
     * @param [collection] The collection to remove.
     * @return true if the collection was in the composite and was removed,
     *   false if the collection was not in the composite.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#removeCollection">Online Documentation</a>
     */
    fun removeCollection(collection: EntityCollection): Boolean

    /**
     * Removes all collections from this composite.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#removeAllCollections">Online Documentation</a>
     */
    fun removeAllCollections()

    /**
     * Checks to see if the composite contains a given collection.
     * @param [collection] the collection to check for.
     * @return true if the composite contains the collection, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#containsCollection">Online Documentation</a>
     */
    fun containsCollection(collection: EntityCollection): Boolean

    /**
     * Returns true if the provided entity is in this collection, false otherwise.
     * @param [entity] The entity.
     * @return true if the provided entity is in this collection, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#contains">Online Documentation</a>
     */
    fun contains(entity: Entity): Boolean

    /**
     * Determines the index of a given collection in the composite.
     * @param [collection] The collection to find the index of.
     * @return The index of the collection in the composite, or -1 if the collection does not exist in the composite.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#indexOfCollection">Online Documentation</a>
     */
    fun indexOfCollection(collection: EntityCollection): Int

    /**
     * Gets a collection by index from the composite.
     * @param [index] the index to retrieve.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#getCollection">Online Documentation</a>
     */
    fun getCollection(index: Int)

    /**
     * Gets the number of collections in this composite.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#getCollectionsLength">Online Documentation</a>
     */
    fun getCollectionsLength()

    /**
     * Raises a collection up one position in the composite.
     * @param [collection] the collection to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#raiseCollection">Online Documentation</a>
     */
    fun raiseCollection(collection: EntityCollection)

    /**
     * Lowers a collection down one position in the composite.
     * @param [collection] the collection to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#lowerCollection">Online Documentation</a>
     */
    fun lowerCollection(collection: EntityCollection)

    /**
     * Raises a collection to the top of the composite.
     * @param [collection] the collection to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#raiseCollectionToTop">Online Documentation</a>
     */
    fun raiseCollectionToTop(collection: EntityCollection)

    /**
     * Lowers a collection to the bottom of the composite.
     * @param [collection] the collection to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#lowerCollectionToBottom">Online Documentation</a>
     */
    fun lowerCollectionToBottom(collection: EntityCollection)

    /**
     * Prevents [EntityCollection.collectionChanged] events from being raised
     * until a corresponding call is made to [EntityCollection.resumeEvents], at which
     * point a single event will be raised that covers all suspended operations.
     * This allows for many items to be added and removed efficiently.
     * While events are suspended, recompositing of the collections will
     * also be suspended, as this can be a costly operation.
     * This function can be safely called multiple times as long as there
     * are corresponding calls to [EntityCollection.resumeEvents].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#suspendEvents">Online Documentation</a>
     */
    fun suspendEvents()

    /**
     * Resumes raising [EntityCollection.collectionChanged] events immediately
     * when an item is added or removed.  Any modifications made while while events were suspended
     * will be triggered as a single event when this function is called.  This function also ensures
     * the collection is recomposited if events are also resumed.
     * This function is reference counted and can safely be called multiple times as long as there
     * are corresponding calls to [EntityCollection.resumeEvents].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#resumeEvents">Online Documentation</a>
     */
    fun resumeEvents()

    /**
     * Computes the maximum availability of the entities in the collection.
     * If the collection contains a mix of infinitely available data and non-infinite data,
     * It will return the interval pertaining to the non-infinite data only.  If all
     * data is infinite, an infinite interval will be returned.
     * @return The availability of entities in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#computeAvailability">Online Documentation</a>
     */
    fun computeAvailability(): TimeInterval

    /**
     * Gets an entity with the specified id.
     * @param [id] The id of the entity to retrieve.
     * @return The entity with the provided id or undefined if the id did not exist in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeEntityCollection.html#getById">Online Documentation</a>
     */
    fun getById(id: String): Entity?
}
