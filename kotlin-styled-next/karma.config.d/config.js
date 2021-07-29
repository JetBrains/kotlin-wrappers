const puppeteer = require('puppeteer');
process.env.CHROME_BIN = puppeteer.executablePath();

config.customLaunchers = {
    ChromeHeadlessNoSandbox: {
        base: 'ChromeHeadless',
        flags: ['--no-sandbox']
    }
}

config.browsers = config.browsers.map(b => b === 'ChromeHeadless' ? 'ChromeHeadlessNoSandbox' : b)

config.client.mocha = config.client.mocha || {}
config.client.mocha.timeout = 60000

config.browserNoActivityTimeout = 100000
config.browserDisconnectTimeout = 50000
config.browserDisconnectTolerance = 3