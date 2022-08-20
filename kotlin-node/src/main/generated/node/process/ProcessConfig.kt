// Automatically generated - do not modify!

package node.process

sealed external interface ProcessConfig {
    val target_defaults: Any /* {
        readonly cflags: any[];
        readonly default_configuration: string;
        readonly defines: string[];
        readonly include_dirs: string[];
        readonly libraries: string[];
    } */
    val variables: Any /* {
        readonly clang: number;
        readonly host_arch: string;
        readonly node_install_npm: boolean;
        readonly node_install_waf: boolean;
        readonly node_prefix: string;
        readonly node_shared_openssl: boolean;
        readonly node_shared_v8: boolean;
        readonly node_shared_zlib: boolean;
        readonly node_use_dtrace: boolean;
        readonly node_use_etw: boolean;
        readonly node_use_openssl: boolean;
        readonly target_arch: string;
        readonly v8_no_strict_aliasing: number;
        readonly v8_use_snapshot: boolean;
        readonly visibility: string;
    } */
}
