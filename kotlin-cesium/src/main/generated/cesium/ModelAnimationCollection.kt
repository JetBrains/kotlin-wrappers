// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A collection of active model animations.  Access this using [Model.activeAnimations].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimationCollection.html">Online Documentation</a>
 */
external class ModelAnimationCollection {
    /**
     * The event fired when an animation is added to the collection.  This can be used, for
     * example, to keep a UI in sync.
     * ```
     * model.activeAnimations.animationAdded.addEventListener(function(model, animation) {
     *   console.log('Animation added: ' + animation.name);
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimationCollection.html#animationAdded">Online Documentation</a>
     */
    var animationAdded: DefaultEvent

    /**
     * The event fired when an animation is removed from the collection.  This can be used, for
     * example, to keep a UI in sync.
     * ```
     * model.activeAnimations.animationRemoved.addEventListener(function(model, animation) {
     *   console.log('Animation removed: ' + animation.name);
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimationCollection.html#animationRemoved">Online Documentation</a>
     */
    var animationRemoved: DefaultEvent

    /**
     * The number of animations in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimationCollection.html#length">Online Documentation</a>
     */
    val length: Int

    /**
     * Creates and adds an animation with the specified initial properties to the collection.
     *
     * This raises the [ModelAnimationCollection.animationAdded] event so, for example, a UI can stay in sync.
     * ```
     * // Example 1. Add an animation by name
     * model.activeAnimations.add({
     *   name : 'animation name'
     * });
     *
     * // Example 2. Add an animation by index
     * model.activeAnimations.add({
     *   index : 0
     * });
     * ```
     * ```
     * // Example 3. Add an animation and provide all properties and events
     * const startTime = JulianDate.now();
     *
     * const animation = model.activeAnimations.add({
     *   name : 'another animation name',
     *   startTime : startTime,
     *   delay : 0.0,                          // Play at startTime (default)
     *   stopTime : JulianDate.addSeconds(startTime, 4.0, new JulianDate()),
     *   removeOnStop : false,                 // Do not remove when animation stops (default)
     *   multiplier : 2.0,                        // Play at double speed
     *   reverse : true,                       // Play in reverse
     *   loop : ModelAnimationLoop.REPEAT      // Loop the animation
     * });
     *
     * animation.start.addEventListener(function(model, animation) {
     *   console.log('Animation started: ' + animation.name);
     * });
     * animation.update.addEventListener(function(model, animation, time) {
     *   console.log('Animation updated: ' + animation.name + '. glTF animation time: ' + time);
     * });
     * animation.stop.addEventListener(function(model, animation) {
     *   console.log('Animation stopped: ' + animation.name);
     * });
     * ```
     * @return The animation that was added to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimationCollection.html#add">Online Documentation</a>
     */
    fun add(options: AddOptions): ModelAnimation

    /**
     * @property [name] The glTF animation name that identifies the animation. Must be defined if `options.index` is `undefined`.
     * @property [index] The glTF animation index that identifies the animation. Must be defined if `options.name` is `undefined`.
     * @property [startTime] The scene time to start playing the animation.  When this is `undefined`, the animation starts at the next frame.
     * @property [delay] The delay, in seconds, from `startTime` to start playing.
     *   Default value - `0.0`
     * @property [stopTime] The scene time to stop playing the animation.  When this is `undefined`, the animation is played for its full duration.
     * @property [removeOnStop] When `true`, the animation is removed after it stops playing.
     *   Default value - `false`
     * @property [multiplier] Values greater than `1.0` increase the speed that the animation is played relative to the scene clock speed; values less than `1.0` decrease the speed.
     *   Default value - `1.0`
     * @property [reverse] When `true`, the animation is played in reverse.
     *   Default value - `false`
     * @property [loop] Determines if and how the animation is looped.
     *   Default value - [ModelAnimationLoop.NONE]
     */
    interface AddOptions {
        var name: String?
        var index: Int?
        var startTime: JulianDate?
        var delay: Double?
        var stopTime: JulianDate?
        var removeOnStop: Boolean?
        var multiplier: Double?
        var reverse: Boolean?
        var loop: ModelAnimationLoop?
    }

    /**
     * Creates and adds an animation with the specified initial properties to the collection
     * for each animation in the model.
     *
     * This raises the [ModelAnimationCollection.animationAdded] event for each model so, for example, a UI can stay in sync.
     * ```
     * model.activeAnimations.addAll({
     *   multiplier : 0.5,                        // Play at half-speed
     *   loop : ModelAnimationLoop.REPEAT      // Loop the animations
     * });
     * ```
     * @return An array of [ModelAnimation] objects, one for each animation added to the collection.  If there are no glTF animations, the array is empty.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimationCollection.html#addAll">Online Documentation</a>
     */
    fun addAll(options: AddAllOptions? = definedExternally): Array<out ModelAnimation>

    /**
     * @property [startTime] The scene time to start playing the animations.  When this is `undefined`, the animations starts at the next frame.
     * @property [delay] The delay, in seconds, from `startTime` to start playing.
     *   Default value - `0.0`
     * @property [stopTime] The scene time to stop playing the animations.  When this is `undefined`, the animations are played for its full duration.
     * @property [removeOnStop] When `true`, the animations are removed after they stop playing.
     *   Default value - `false`
     * @property [multiplier] Values greater than `1.0` increase the speed that the animations play relative to the scene clock speed; values less than `1.0` decrease the speed.
     *   Default value - `1.0`
     * @property [reverse] When `true`, the animations are played in reverse.
     *   Default value - `false`
     * @property [loop] Determines if and how the animations are looped.
     *   Default value - [ModelAnimationLoop.NONE]
     */
    interface AddAllOptions {
        var startTime: JulianDate?
        var delay: Double?
        var stopTime: JulianDate?
        var removeOnStop: Boolean?
        var multiplier: Double?
        var reverse: Boolean?
        var loop: ModelAnimationLoop?
    }

    /**
     * Removes an animation from the collection.
     *
     * This raises the [ModelAnimationCollection.animationRemoved] event so, for example, a UI can stay in sync.
     *
     * An animation can also be implicitly removed from the collection by setting [ModelAnimation.removeOnStop] to
     * `true`.  The [ModelAnimationCollection.animationRemoved] event is still fired when the animation is removed.
     * ```
     * const a = model.activeAnimations.add({
     *   name : 'animation name'
     * });
     * model.activeAnimations.remove(a); // Returns true
     * ```
     * @param [animation] The animation to remove.
     * @return `true` if the animation was removed; `false` if the animation was not found in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimationCollection.html#remove">Online Documentation</a>
     */
    fun remove(animation: ModelAnimation): Boolean

    /**
     * Removes all animations from the collection.
     *
     * This raises the [ModelAnimationCollection.animationRemoved] event for each
     * animation so, for example, a UI can stay in sync.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimationCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll()

    /**
     * Determines whether this collection contains a given animation.
     * @param [animation] The animation to check for.
     * @return `true` if this collection contains the animation, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimationCollection.html#contains">Online Documentation</a>
     */
    fun contains(animation: ModelAnimation): Boolean

    /**
     * Returns the animation in the collection at the specified index.  Indices are zero-based
     * and increase as animations are added.  Removing an animation shifts all animations after
     * it to the left, changing their indices.  This function is commonly used to iterate over
     * all the animations in the collection.
     * ```
     * // Output the names of all the animations in the collection.
     * const animations = model.activeAnimations;
     * const length = animations.length;
     * for (let i = 0; i < length; ++i) {
     *   console.log(animations.get(i).name);
     * }
     * ```
     * @param [index] The zero-based index of the animation.
     * @return The animation at the specified index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelAnimationCollection.html#get">Online Documentation</a>
     */
    fun get(index: Int): ModelAnimation
}
