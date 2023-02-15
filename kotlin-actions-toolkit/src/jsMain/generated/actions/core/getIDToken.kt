// Automatically generated - do not modify!

package actions.core

import kotlinx.coroutines.await

suspend fun getIDToken(): String =
    getIDTokenAsync().await()

suspend fun getIDToken(
    aud: String,
): String =
    getIDTokenAsync(
        aud = aud,
    ).await()
