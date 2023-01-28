// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray

/**
 * An observable collection of [Entity] instances where each entity has a unique id.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html">Online Documentation</a>
 */
external class EntityCollection() {
    constructor(owner: DataSource)

    constructor(owner: CompositeEntityCollection)

    /**
     * Prevents [EntityCollection.collectionChanged] events from being raised
     * until a corresponding call is made to [EntityCollection.resumeEvents], at which
     * point a single event will be raised that covers all suspended operations.
     * This allows for many items to be added and removed efficiently.
     * This function can be safely called multiple times as long as there
     * are corresponding calls to [EntityCollection.resumeEvents].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#suspendEvents">Online Documentation</a>
     */
    fun suspendEvents()

    /**
     * Resumes raising [EntityCollection.collectionChanged] events immediately
     * when an item is added or removed.  Any modifications made while while events were suspended
     * will be triggered as a single event when this function is called.
     * This function is reference counted and can safely be called multiple times as long as there
     * are corresponding calls to [EntityCollection.resumeEvents].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#resumeEvents">Online Documentation</a>
     */
    fun resumeEvents()

    /**
     * Gets the event that is fired when entities are added or removed from the collection.
     * The generated event is a [EntityCollection.CollectionChangedEventCallback].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#collectionChanged">Online Documentation</a>
     */
    val collectionChanged: Event<CollectionChangedEventCallback>

    /**
     * Gets a globally unique identifier for this collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * Gets the array of Entity instances in the collection.
     * This array should not be modified directly.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#values">Online Documentation</a>
     */
    val values: ReadonlyArray<Entity>

    /**
     * Gets whether or not this entity collection should be
     * displayed.  When true, each entity is only displayed if
     * its own show property is also true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets the owner of this entity collection, ie. the data source or composite entity collection which created it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#owner">Online Documentation</a>
     */
    val owner: dynamic

    /**
     * Computes the maximum availability of the entities in the collection.
     * If the collection contains a mix of infinitely available data and non-infinite data,
     * it will return the interval pertaining to the non-infinite data only.  If all
     * data is infinite, an infinite interval will be returned.
     * @return The availability of entities in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#computeAvailability">Online Documentation</a>
     */
    fun computeAvailability(): TimeInterval

    /**
     * Add an entity to the collection.
     * @param [entity] The entity to be added.
     * @return The entity that was added.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#add">Online Documentation</a>
     */
    fun add(entity: Entity): Entity

    /**
     * Removes an entity from the collection.
     * @param [entity] The entity to be removed.
     * @return true if the item was removed, false if it did not exist in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#remove">Online Documentation</a>
     */
    fun remove(entity: Entity): Boolean

    /**
     * Returns true if the provided entity is in this collection, false otherwise.
     * @param [entity] The entity.
     * @return true if the provided entity is in this collection, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#contains">Online Documentation</a>
     */
    fun contains(entity: Entity): Boolean

    /**
     * Removes an entity with the provided id from the collection.
     * @param [id] The id of the entity to remove.
     * @return true if the item was removed, false if no item with the provided id existed in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#removeById">Online Documentation</a>
     */
    fun removeById(id: String): Boolean

    /**
     * Removes all Entities from the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll()

    /**
     * Gets an entity with the specified id.
     * @param [id] The id of the entity to retrieve.
     * @return The entity with the provided id or undefined if the id did not exist in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#getById">Online Documentation</a>
     */
    fun getById(id: String): Entity?

    /**
     * Gets an entity with the specified id or creates it and adds it to the collection if it does not exist.
     * @param [id] The id of the entity to retrieve or create.
     * @return The new or existing object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#getOrCreateEntity">Online Documentation</a>
     */
    fun getOrCreateEntity(id: String): Entity
}

/**
 * The signature of the event generated by [EntityCollection.collectionChanged].
 * @param [collection] The collection that triggered the event.
 * @param [added] The array of [Entity] instances that have been added to the collection.
 * @param [removed] The array of [Entity] instances that have been removed from the collection.
 * @param [changed] The array of [Entity] instances that have been modified.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCollection.html#.CollectionChangedEventCallback">Online Documentation</a>
 */
typealias CollectionChangedEventCallback = (collection: EntityCollection, added: ReadonlyArray<Entity>, removed: ReadonlyArray<Entity>, changed: ReadonlyArray<Entity>) -> Unit
