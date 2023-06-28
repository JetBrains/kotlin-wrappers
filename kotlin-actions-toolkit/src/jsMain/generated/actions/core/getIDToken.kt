// Automatically generated - do not modify!

package actions.core

import js.promise.await

suspend fun getIDToken(): String =
    getIDTokenAsync().await()

suspend fun getIDToken(
    aud: String,
): String =
    getIDTokenAsync(
        aud = aud,
    ).await()
