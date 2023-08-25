// Automatically generated - do not modify!

@file:JsModule("node:os")

package node.os

/**
 * Returns the string path of the current user's home directory.
 *
 * On POSIX, it uses the `$HOME` environment variable if defined. Otherwise it
 * uses the [effective UID](https://en.wikipedia.org/wiki/User_identifier#Effective_user_ID) to look up the user's home directory.
 *
 * On Windows, it uses the `USERPROFILE` environment variable if defined.
 * Otherwise it uses the path to the profile directory of the current user.
 * @since v2.3.0
 */
external fun homedir(): String
