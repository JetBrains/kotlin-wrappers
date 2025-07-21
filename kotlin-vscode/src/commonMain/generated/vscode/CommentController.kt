// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * A comment controller is able to provide {@link CommentThread comments} support to the editor and
 * provide users various ways to interact with comments.
*/
export interface CommentController {
/**
 * The id of this comment controller.
*/
readonly id: string;

/**
 * The human-readable label of this comment controller.
*/
readonly label: string;

/**
 * Comment controller options
*/
options?: CommentOptions;

/**
 * Optional commenting range provider. Provide a list {@link Range ranges} which support commenting to any given resource uri.
 *
 * If not provided, users cannot leave any comments.
*/
commentingRangeProvider?: CommentingRangeProvider;

/**
 * Create a {@link CommentThread comment thread}. The comment thread will be displayed in visible text editors (if the resource matches)
 * and Comments Panel once created.
 *
 * @param uri The uri of the document the thread has been created on.
 * @param range The range the comment thread is located within the document.
 * @param comments The ordered comments of the thread.
*/
createCommentThread(uri: Uri, range: Range, comments: readonly Comment[]): CommentThread;

/**
 * Optional reaction handler for creating and deleting reactions on a {@link Comment}.
*/
reactionHandler?: (comment: Comment, reaction: CommentReaction) => Thenable<void>;

/**
 * Dispose this comment controller.
 *
 * Once disposed, all {@link CommentThread comment threads} created by this comment controller will also be removed from the editor
 * and Comments Panel.
*/
dispose(): void;
}

namespace comments {
/**
 * Creates a new {@link CommentController comment controller} instance.
 *
 * @param id An `id` for the comment controller.
 * @param label A human-readable string for the comment controller.
 * @returns An instance of {@link CommentController comment controller}.
*/
export function createCommentController(id: string, label: string): CommentController;
}

// ORIGINAL SOURCE
 **/
