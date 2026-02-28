// Automatically generated - do not modify!

package electron.core

import node.buffer.Buffer

external interface SharedTextureHandle {
// Docs: https://electronjs.org/docs/api/structures/shared-texture-handle
    /**
     * IOSurfaceRef holds the shared texture. Note that this IOSurface is local to
     * current process (not global).
     *
     * @platform darwin
     */
    var ioSurface: Buffer<*>?

    /**
     * Structure contains planes of shared texture.
     *
     * @platform linux
     */
    var nativePixmap: NativePixmap?

    /**
     * NT HANDLE holds the shared texture. Note that this NT HANDLE is local to current
     * process.
     *
     * @platform win32
     */
    var ntHandle: Buffer<*>?
}
