// Automatically generated - do not modify!

@file:JsModule("node:os")
@file:JsNonModule

package node.os

import kotlinx.js.ReadonlyArray
import node.Dict

/**
 * Returns an object containing network interfaces that have been assigned a
 * network address.
 *
 * Each key on the returned object identifies a network interface. The associated
 * value is an array of objects that each describe an assigned network address.
 *
 * The properties available on the assigned network address object include:
 *
 * ```js
 * {
 *   lo: [
 *     {
 *       address: '127.0.0.1',
 *       netmask: '255.0.0.0',
 *       family: 'IPv4',
 *       mac: '00:00:00:00:00:00',
 *       internal: true,
 *       cidr: '127.0.0.1/8'
 *     },
 *     {
 *       address: '::1',
 *       netmask: 'ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff',
 *       family: 'IPv6',
 *       mac: '00:00:00:00:00:00',
 *       scopeid: 0,
 *       internal: true,
 *       cidr: '::1/128'
 *     }
 *   ],
 *   eth0: [
 *     {
 *       address: '192.168.1.108',
 *       netmask: '255.255.255.0',
 *       family: 'IPv4',
 *       mac: '01:02:03:0a:0b:0c',
 *       internal: false,
 *       cidr: '192.168.1.108/24'
 *     },
 *     {
 *       address: 'fe80::a00:27ff:fe4e:66a1',
 *       netmask: 'ffff:ffff:ffff:ffff::',
 *       family: 'IPv6',
 *       mac: '01:02:03:0a:0b:0c',
 *       scopeid: 1,
 *       internal: false,
 *       cidr: 'fe80::a00:27ff:fe4e:66a1/64'
 *     }
 *   ]
 * }
 * ```
 * @since v0.6.0
 */
external fun networkInterfaces(): Dict<ReadonlyArray<NetworkInterfaceInfo>>
