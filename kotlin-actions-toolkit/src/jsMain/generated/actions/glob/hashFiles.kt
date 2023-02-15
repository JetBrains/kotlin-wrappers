// Automatically generated - do not modify!

package actions.glob

import kotlinx.coroutines.await

suspend fun hashFiles(
    globber: Globber,
    currentWorkspace: String,
): String =
    hashFilesAsync(
        globber = globber,
        currentWorkspace = currentWorkspace,
    ).await()

suspend fun hashFiles(
    globber: Globber,
    currentWorkspace: String,
    verbose: Boolean,
): String =
    hashFilesAsync(
        globber = globber,
        currentWorkspace = currentWorkspace,
        verbose = verbose,
    ).await()

suspend fun hashFiles(
    patterns: String,
): String =
    hashFilesAsync(
        patterns = patterns,
    ).await()

suspend fun hashFiles(
    patterns: String,
    currentWorkspace: String,
): String =
    hashFilesAsync(
        patterns = patterns,
        currentWorkspace = currentWorkspace,
    ).await()

suspend fun hashFiles(
    patterns: String,
    currentWorkspace: String,
    options: HashFileOptions,
): String =
    hashFilesAsync(
        patterns = patterns,
        currentWorkspace = currentWorkspace,
        options = options,
    ).await()

suspend fun hashFiles(
    patterns: String,
    currentWorkspace: String,
    options: HashFileOptions,
    verbose: Boolean,
): String =
    hashFilesAsync(
        patterns = patterns,
        currentWorkspace = currentWorkspace,
        options = options,
        verbose = verbose,
    ).await()
