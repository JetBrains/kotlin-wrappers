// Automatically generated - do not modify!

@file:JsModule("node:sqlite")
@file:JsQualifier("constants")

package node.sqlite.constants

/**
 * If foreign key handling is enabled, and applying a changeset leaves the database in a state containing foreign key violations, the conflict handler is invoked with this constant exactly once before the changeset is committed. If the conflict handler returns `SQLITE_CHANGESET_OMIT`, the changes, including those that caused the foreign key constraint violation, are committed. Or, if it returns `SQLITE_CHANGESET_ABORT`, the changeset is rolled back.
 * @since v22.14.0
 */
external val SQLITE_CHANGESET_FOREIGN_KEY: Double
