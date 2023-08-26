@file:JsModule("node:dns")

package node.dns


/**
 * Set the default value of `verbatim` in {@link lookup} and `dnsPromises.lookup()`. The value could be:
 *
 * * `ipv4first`: sets default `verbatim` `false`.
 * * `verbatim`: sets default `verbatim` `true`.
 *
 * The default is `ipv4first` and {@link setDefaultResultOrder} have higher
 * priority than `--dns-result-order`. When using `worker threads`,{@link setDefaultResultOrder} from the main thread won't affect the default
 * dns orders in workers.
 * @since v16.4.0, v14.18.0
 * @param order must be `'ipv4first'` or `'verbatim'`.
 */
external fun setDefaultResultOrder(order: SetDefaultResultOrderOrder): Unit
