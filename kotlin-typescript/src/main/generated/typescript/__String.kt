// Automatically generated - do not modify!

package typescript

/**
 * This represents a string whose leading underscore have been escaped by adding extra leading underscores.
 * The shape of this brand is rather unique compared to others we've used.
 * Instead of just an intersection of a string and an object, it is that union-ed
 * with an intersection of void and an object. This makes it wholly incompatible
 * with a normal string (which is good, it cannot be misused on assignment or on usage),
 * while still being comparable with a normal string via === (also good) and castable from a string.
 */
sealed interface __String /* (string & {
    __escapedIdentifier: void;
}) | (void & {
    __escapedIdentifier: void;
}) | InternalSymbolName */
